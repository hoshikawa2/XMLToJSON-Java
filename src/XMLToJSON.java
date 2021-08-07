public class XMLToJSON {

    public static void main(String[] args) {
        XMLToJSON xmltojson = new XMLToJSON();
        String xml;
        xml = xmltojson.ConvertXMLToJSON("");
        System.out.println(xml);
    }

    String substr(String xml, int pos, int len) {
        String retorno = "";

        if (pos < 0) {
            pos = 0;
        }

        if (len + pos > xml.length()) {
            len = xml.length();
        } else {
            len = len + pos;
        }
        retorno = xml.substring(pos, len);
        return retorno;
    }

    String ConvertXMLToJSON(String xml) {
        String retorno = "";

        XMLToJSON s = new XMLToJSON();

        int token = 0;
        String tagAtual = "";
        String tagConteudoAtual = "";
        String jsonStr = "";
        int tagLoops = 0;
        String xmltmp = "";
        String strAcumulado = "";
        int limit = 0;

        int c = 0;
        xml = xml.replaceAll("(?:\\n|\\r)", "");

        //Retira espaços e caracteres entre uma Tag e outra
        //Exceto conteúdo das tags
        //Ignora também labels das tags
        while (c < xml.length()){
            if (s.substr(xml, c, 1).equals(">") && token == 0){
                xmltmp = xmltmp + s.substr(xml, c, 1);
                token = 1;
                c++;
                continue;
            }
            if (s.substr(xml, c, 1).equals("<") && token == 1){
                xmltmp = xmltmp + s.substr(xml, c, 1);
                token = 0;
                c++;
                continue;
            }
            if (token == 1 && !s.substr(xml, c, 1).equals(" ")){
                xmltmp = xmltmp + strAcumulado + s.substr(xml, c, 1);
                strAcumulado = "";
                c++;
                token = 0;
                continue;
            }
            if (token == 0){
                strAcumulado = "";
                xmltmp = xmltmp + s.substr(xml, c, 1);
            }
            if (token == 1 && !s.substr(xml, c, 1).equals("<") && !s.substr(xml, c, 1).equals(">")){
                strAcumulado = strAcumulado + s.substr(xml, c, 1);
            }
            c++;
        }

        xml = xmltmp;

        c = 0;
        while (c < xml.length()){

            //Valida o final da tag </
            if (s.substr(xml, c, 2).equals("</"))
            {
                tagLoops--;
                if (tagLoops < 0) {
                    if (s.substr(jsonStr, jsonStr.length() -1, 1).equals(",")){
                        jsonStr = s.substr(jsonStr, 0, jsonStr.length() - 1);
                    }
                    jsonStr = jsonStr + "},";
                    tagLoops = 0;
                }
                int novaPos = c+2;
                int out = 0;
                //Valida o final da tag para poder começar a processar o conteúdo da tag
                while (novaPos < xml.length()) {
                    if (s.substr(xml, novaPos, 1).equals(">"))
                    {
                        c = novaPos + 1;
                        out = 1;
                        token = 1;
                        break;
                    }
                    novaPos++;
                }
                if (out == 1){
                    if (s.substr(jsonStr, jsonStr.length() -1, 1).equals(",")){
                        jsonStr = s.substr(jsonStr, 0, jsonStr.length() - 1);
                    }
                    jsonStr = jsonStr + "},";
                    continue;
                }

            }

            if (s.substr(xml, c, 1).equals("<")) {

                int f = c;
                int outNull = 0;
                //Valida tags nulas <tag/>
                while (f < xml.length()){
                    if (s.substr(xml, f, 1).equals(">"))
                    {
                        break;
                    }
                    if (s.substr(xml, f, 2).equals("/>"))
                    {
                        outNull = 1;
                        break;
                    }
                    f++;
                }
                if (outNull == 1){
                    c = f + 1;
                    continue;
                }

                token = 0;
                tagLoops++;

                if (s.substr(xml, c+1, 1).equals("?") && token == 0){
                    int novaPos = c+2;
                    int out = 0;
                    while (novaPos < xml.length()) {
                        if (s.substr(xml, novaPos, 1).equals(">"))
                        {
                            c = novaPos + 1;
                            out = 1;
                            break;
                        }
                        novaPos++;
                    }
                    if (out == 1){
                        jsonStr = "";
                        continue;
                    }
                }

                int novaPos = c+1;
                int out = 0;
                int acumulaFlag = 1;
                //Conversão para JSON da tag e conteúdo da tag
                while (novaPos < xml.length()) {
                    if (s.substr(xml, novaPos, 1).equals(">"))
                    {
                        c = novaPos + 1;
                        out = 1;
                        token = 1;
                        break;
                    }
                    if (s.substr(xml, novaPos, 1).equals(" ") && token == 0)
                    {
                        acumulaFlag = 0;
                    }
                    if (acumulaFlag == 1 && token == 0)
                    {
                        if (tagLoops > 1){
                            if (tagAtual != ""){
                                jsonStr = jsonStr + "{\"" + tagAtual + "\":";
                                if (tagLoops > 1){
                                    jsonStr = jsonStr + "{";
                                }
                            }

                            tagAtual = "";
                            tagLoops--;
                            if (tagLoops < 0) {
                                if (s.substr(jsonStr, jsonStr.length() -1, 1).equals(",")){
                                    jsonStr = s.substr(jsonStr, 0, jsonStr.length() - 1);
                                }
                                jsonStr = jsonStr + "},";
                                tagLoops = 0;
                            }
                        }
                        tagAtual = (tagAtual + s.substr(xml, novaPos, 1)).trim();
                    }
                    novaPos++;
                }
                if (out == 1){
                    continue;
                }


            }

            if (token == 1) {
                int novaPos = c;
                int out = 0;
                //Loop para buscar o conteúdo da Tag
                while (novaPos < xml.length()) {

                    if (s.substr(xml, novaPos, 2).equals("</"))
                    {
                        tagLoops--;
                        if (tagLoops < 0) {
                            if (s.substr(jsonStr, jsonStr.length() -1, 1).equals(",")){
                                jsonStr = s.substr(jsonStr, 0, jsonStr.length() - 1);
                            }
                            jsonStr = jsonStr + "},";
                            tagLoops = 0;
                        }
                        novaPos = novaPos+2;
                        out = 0;
                        while (novaPos <= xml.length()) {
                            if (s.substr(xml, novaPos, 1).equals(">"))
                            {
                                c = novaPos + 1;
                                out = 1;
                                token = 1;
                                break;
                            }
                            novaPos++;
                        }
                        if (out == 1){
                            continue;
                        }

                    }

                    if (s.substr(xml, novaPos, 1).equals(">"))
                    {
                        c = novaPos + 1;
                        out = 1;
                        token = 0;
                        break;
                    }
                    if (token == 1)
                    {
                        tagConteudoAtual = tagConteudoAtual + s.substr(xml, novaPos, 1);
                    }
                    novaPos++;
                }
                //Se achou Tag e achou Conteúdo da Tag, transforma em JSON
                if (out == 1){
                    if (tagConteudoAtual.equals("")) {
                        jsonStr = jsonStr + '"' + tagAtual + "\":";
                    } else {
                        jsonStr = jsonStr + '"' + tagAtual + "\":\"" + tagConteudoAtual + "\",";
                    }
                    if (tagLoops == 0){
                        if (s.substr(jsonStr, jsonStr.length() -1, 1).equals(",")){
                            jsonStr = s.substr(jsonStr, 0, jsonStr.length() - 1);
                        }
                        tagAtual = "";
                        tagConteudoAtual = "";
                        if (tagLoops == 0){
                            jsonStr = jsonStr + ",";
                        } else {
                            jsonStr = jsonStr + "},";
                        }
                    }
                    continue;
                }

            }

            c++;
        }
        if (s.substr(jsonStr, jsonStr.length() -1, 1).equals(",")){
            jsonStr = s.substr(jsonStr, 0, jsonStr.length() - 1);
        }

        c = 0;
        int out = 0;
        //Tratamento dos arrays. Começa a inserir [ como parte de array JSON
        while (c < jsonStr.length()) {

            if (s.substr(jsonStr, c, 1).equals("{")) {
                if (s.substr(jsonStr, c + 1, 1).equals("{")) {
                    out=1;
                }
            }
            if (out == 1){
                jsonStr = s.substr(jsonStr, 0, c ) + "[" + s.substr(jsonStr, c + 1, jsonStr.length());
                out = 0;
                c=0;
                continue;
            }
            c++;
        }

        limit = 0;
        c = 0;
        token = 0;
        out = 0;
        //Busca o fechamento dos arrays, substituindo as chaves } por ]
        while (c < jsonStr.length()) {

            if (s.substr(jsonStr, c, 1).equals("}")) {
                out = 1;
                limit = c;
            }
            if (out == 1)
            {
                int d = limit;
                token = 0;
                while (d >= 0) {
                    if (s.substr(jsonStr, d, 1).equals("}")) {
                        token--;
                    }
                    if (s.substr(jsonStr, d, 1).equals("{")) {
                        token++;
                    }
                    if (s.substr(jsonStr, d, 1).equals("[")) {
                        token++;
                        jsonStr = s.substr(jsonStr, 0, limit ) + "]" + s.substr(jsonStr, limit + 1, jsonStr.length());
                    }
                    if (token == 0){
                        c = limit + 1;
                        break;
                    }
                    d--;
                }
                out = 0;
            }

            c++;
        }

        retorno = jsonStr;
        return retorno;
    }


}
