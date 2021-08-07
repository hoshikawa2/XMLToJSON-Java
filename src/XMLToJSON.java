public class XMLToJSON {

    public static void main(String[] args) {
        XMLToJSON xmltojson = new XMLToJSON();
        String xml;
        xml = xmltojson.ConvertXMLToJSON("<Microvix>\n" +
                "    <ResponseData>\n" +
                "        <C>\n" +
                "            <D>Portal</D>\n" +
                "            <D>CnpjEmp</D>\n" +
                "            <D>Empresa</D>\n" +
                "            <D>Representante</D>\n" +
                "            <D>NumeroBilhete</D>\n" +
                "            <D>cnpjcpf</D>\n" +
                "            <D>Nome</D>\n" +
                "            <D>DataNascimento</D>\n" +
                "            <D>Sexo</D>\n" +
                "            <D>EstadoCivil</D>\n" +
                "            <D>Cep</D>\n" +
                "            <D>Endereco</D>\n" +
                "            <D>Numero</D>\n" +
                "            <D>Complemento</D>\n" +
                "            <D>Cidade</D>\n" +
                "            <D>Bairro</D>\n" +
                "            <D>UF</D>\n" +
                "            <D>Telefone</D>\n" +
                "            <D>QuantidadeParcela</D>\n" +
                "            <D>Email</D>\n" +
                "            <D>DataEmissao</D>\n" +
                "            <D>DataInicioVigencia</D>\n" +
                "            <D>DataFimVigencia</D>\n" +
                "            <D>ValorPremio</D>\n" +
                "            <D>ValorIS</D>\n" +
                "            <D>NomeAparelho</D>\n" +
                "            <D>FabricantedoAparelho</D>\n" +
                "            <D>Apolice</D>\n" +
                "            <D>IMEI</D>\n" +
                "            <D>TempoGarantiaSeguro</D>\n" +
                "            <D>TempoGarantia</D>\n" +
                "            <D>NF</D>\n" +
                "            <D>DataNF</D>\n" +
                "            <D>CodVendedor</D>\n" +
                "            <D>CodServico</D>\n" +
                "            <D>DescServico</D>\n" +
                "            <D>CodSegProduto</D>\n" +
                "            <D>DescApolice</D>\n" +
                "            <D>IdServicoTerceiros</D>\n" +
                "            <D>IdOperadora</D>\n" +
                "            <D>Identificador</D>\n" +
                "            <D>ApoliceAtiva</D>\n" +
                "        </C>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403004681</D>\n" +
                "            <D>20</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890200049034621427</D>\n" +
                "            <D>28266174865</D>\n" +
                "            <D>ERIK DIAS BERTIULINO</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>M</D>\n" +
                "            <D>N</D>\n" +
                "            <D>07844-010</D>\n" +
                "            <D>AVENIDA DO TREVO</D>\n" +
                "            <D>248</D>\n" +
                "            <D />\n" +
                "            <D>FRANCO DA ROCHA</D>\n" +
                "            <D>PARQUE PAULISTA</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>1</D>\n" +
                "            <D>pjerik@yahoo.com.br</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2021-12-01</D>\n" +
                "            <D>587.26</D>\n" +
                "            <D>2499.0000</D>\n" +
                "            <D>MOTO G9 PLUS, AZUL ÍNDIGO</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000165</D>\n" +
                "            <D>356904113884616</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>301</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>335</D>\n" +
                "            <D>2</D>\n" +
                "            <D>ROUBO E FURTO DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO DE PORTÁTEIS</D>\n" +
                "            <D>8456</D>\n" +
                "            <D>1</D>\n" +
                "            <D>e94ae130-5aeb-43f5-8697-10bdab0dc496</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403001828</D>\n" +
                "            <D>10</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890100021062735848</D>\n" +
                "            <D>48123326807</D>\n" +
                "            <D>ERICK BISMARK DA SILVA</D>\n" +
                "            <D>2000-05-12</D>\n" +
                "            <D>M</D>\n" +
                "            <D>N</D>\n" +
                "            <D>09971-070</D>\n" +
                "            <D>RUA BITUVA</D>\n" +
                "            <D>284</D>\n" +
                "            <D />\n" +
                "            <D>DIADEMA</D>\n" +
                "            <D>ELDORADO</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>10</D>\n" +
                "            <D />\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2021-12-01</D>\n" +
                "            <D>824.72</D>\n" +
                "            <D>2999.0000</D>\n" +
                "            <D>MOTO G 5G PLUS - AZUL OCEANO</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000166</D>\n" +
                "            <D>356924110967834</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>2685</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>323</D>\n" +
                "            <D>1</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTATEIS</D>\n" +
                "            <D>8457</D>\n" +
                "            <D>1</D>\n" +
                "            <D>c02d9b44-9135-40c9-97ea-936c0925fe79</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403001585</D>\n" +
                "            <D>9</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890090019077404500</D>\n" +
                "            <D>10439284805</D>\n" +
                "            <D>LUIZ MARCELO MARTINS</D>\n" +
                "            <D>1968-12-12</D>\n" +
                "            <D>M</D>\n" +
                "            <D>C</D>\n" +
                "            <D>05781-270</D>\n" +
                "            <D>RUA OJINAGA</D>\n" +
                "            <D>33</D>\n" +
                "            <D>CASA2</D>\n" +
                "            <D>SÃO PAULO</D>\n" +
                "            <D>JARDIM SÃO JANUÁRIO</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>1</D>\n" +
                "            <D>luimarmar@gmail.com</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2021-12-01</D>\n" +
                "            <D>467.22</D>\n" +
                "            <D>1699.0000</D>\n" +
                "            <D>MOTO G9 PLAY ED. ESPECIAL, AZUL SAFIRA</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000166</D>\n" +
                "            <D>355560111187898</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>2496</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>149</D>\n" +
                "            <D>1</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTATEIS</D>\n" +
                "            <D>8458</D>\n" +
                "            <D>1</D>\n" +
                "            <D>2b5fd820-6d5c-4fa4-a850-5b5f375beea0</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403001828</D>\n" +
                "            <D>10</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890100020082944463</D>\n" +
                "            <D>36650337803</D>\n" +
                "            <D>JESSICA CRISTINA DA SILVA</D>\n" +
                "            <D>1989-12-19</D>\n" +
                "            <D>F</D>\n" +
                "            <D>N</D>\n" +
                "            <D>09910-170</D>\n" +
                "            <D>AVENIDA ALDA</D>\n" +
                "            <D>2139</D>\n" +
                "            <D>S/</D>\n" +
                "            <D>DIADEMA</D>\n" +
                "            <D>CENTRO</D>\n" +
                "            <D>SP</D>\n" +
                "            <D>0</D>\n" +
                "            <D>10</D>\n" +
                "            <D>jessymailpereira@gmail.com</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2021-12-01</D>\n" +
                "            <D>352.26</D>\n" +
                "            <D>1499.0000</D>\n" +
                "            <D>MOTO E7 PLUS, AZUL NAVY</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000165</D>\n" +
                "            <D>355561111658912</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>968</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>285</D>\n" +
                "            <D>2</D>\n" +
                "            <D>ROUBO E FURTO DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO DE PORTÁTEIS</D>\n" +
                "            <D>8459</D>\n" +
                "            <D>1</D>\n" +
                "            <D>d4844f00-bb24-4ac2-bc6a-fea25f3ce652</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403004410</D>\n" +
                "            <D>18</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890180046002678939</D>\n" +
                "            <D>47453185882</D>\n" +
                "            <D>Rudnei Nunes De Matos Junior</D>\n" +
                "            <D>1997-09-18</D>\n" +
                "            <D>M</D>\n" +
                "            <D>C</D>\n" +
                "            <D>06766-360</D>\n" +
                "            <D>AVENIDA LAURITA ORTEGA MARI</D>\n" +
                "            <D>33</D>\n" +
                "            <D />\n" +
                "            <D>TABOÃO DA SERRA</D>\n" +
                "            <D>VILA DAS OLIVEIRAS</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>10</D>\n" +
                "            <D>karen.almeida matos@gmail.com</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2021-12-01</D>\n" +
                "            <D>439.72</D>\n" +
                "            <D>1599.0000</D>\n" +
                "            <D>MOTO G9 PLAY, VERDE TURQUESA</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000166</D>\n" +
                "            <D>355560119409153</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>253</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>356</D>\n" +
                "            <D>1</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTATEIS</D>\n" +
                "            <D>8460</D>\n" +
                "            <D>1</D>\n" +
                "            <D>b4490919-3d67-4242-b389-6f32e6b1f812</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403001828</D>\n" +
                "            <D>10</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890100020053220357</D>\n" +
                "            <D>13091510670</D>\n" +
                "            <D>Ronald Alves de Oliveira</D>\n" +
                "            <D>1993-10-05</D>\n" +
                "            <D>M</D>\n" +
                "            <D>N</D>\n" +
                "            <D>09992-110</D>\n" +
                "            <D>AVENIDA DANIEL JOSÉ DE CARVALHO</D>\n" +
                "            <D>305</D>\n" +
                "            <D />\n" +
                "            <D>DIADEMA</D>\n" +
                "            <D>CONCEIÇÃO</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>10</D>\n" +
                "            <D>andressasilvagomes3@gmail.com</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2021-12-01</D>\n" +
                "            <D>439.72</D>\n" +
                "            <D>1599.0000</D>\n" +
                "            <D>MOTO G9 PLAY, AZUL SAFIRA</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000166</D>\n" +
                "            <D>355560117941835</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>969</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>285</D>\n" +
                "            <D>1</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTATEIS</D>\n" +
                "            <D>8461</D>\n" +
                "            <D>1</D>\n" +
                "            <D>1c4d4d77-90da-4dea-bc2a-919e01663aab</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403001828</D>\n" +
                "            <D>10</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890100020053220358</D>\n" +
                "            <D>13091510670</D>\n" +
                "            <D>Ronald Alves de Oliveira</D>\n" +
                "            <D>1993-10-05</D>\n" +
                "            <D>M</D>\n" +
                "            <D>N</D>\n" +
                "            <D>09992-110</D>\n" +
                "            <D>AVENIDA DANIEL JOSÉ DE CARVALHO</D>\n" +
                "            <D>305</D>\n" +
                "            <D />\n" +
                "            <D>DIADEMA</D>\n" +
                "            <D>CONCEIÇÃO</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>10</D>\n" +
                "            <D>andressasilvagomes3@gmail.com</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2021-12-01</D>\n" +
                "            <D>439.72</D>\n" +
                "            <D>1599.0000</D>\n" +
                "            <D>MOTO G9 PLAY, ROSA QUARTZO</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000166</D>\n" +
                "            <D>355560119561458</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>969</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>285</D>\n" +
                "            <D>1</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTATEIS</D>\n" +
                "            <D>8462</D>\n" +
                "            <D>1</D>\n" +
                "            <D>1c4d4d77-90da-4dea-bc2a-919e01663aab</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403004681</D>\n" +
                "            <D>20</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890200049017820799</D>\n" +
                "            <D>38454339817</D>\n" +
                "            <D>LEONARDO ANDRE RIBEIRO</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>M</D>\n" +
                "            <D>N</D>\n" +
                "            <D>09410-650</D>\n" +
                "            <D>RUA DO EMBAIXADOR</D>\n" +
                "            <D>56</D>\n" +
                "            <D />\n" +
                "            <D>RIBEIRÃO PIRES</D>\n" +
                "            <D>RONCON</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>5</D>\n" +
                "            <D>leoribeiro12@hotmail.com</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>2021-12-01</D>\n" +
                "            <D>687.22</D>\n" +
                "            <D>2499.0000</D>\n" +
                "            <D>MOTO G9 PLUS, AZUL ÍNDIGO</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000166</D>\n" +
                "            <D>356904113885837</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>320</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>354</D>\n" +
                "            <D>1</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTATEIS</D>\n" +
                "            <D>8463</D>\n" +
                "            <D>1</D>\n" +
                "            <D>b9d0b606-edfc-4b90-961b-80f82d5346a9</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403004681</D>\n" +
                "            <D>20</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>07789020391914991</D>\n" +
                "            <D>01434175685</D>\n" +
                "            <D>juliano mendes</D>\n" +
                "            <D>1980-11-27</D>\n" +
                "            <D>M</D>\n" +
                "            <D>C</D>\n" +
                "            <D>09175-450</D>\n" +
                "            <D>RUA CABRÁLIA</D>\n" +
                "            <D>329</D>\n" +
                "            <D />\n" +
                "            <D>SANTO ANDRÉ</D>\n" +
                "            <D>VILA HELENA</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>1</D>\n" +
                "            <D>julianomendes825@gmail.com</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2021-12-02</D>\n" +
                "            <D>439.72</D>\n" +
                "            <D>1599.0000</D>\n" +
                "            <D>MOTO G9 PLAY, ROSA QUARTZO</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000166</D>\n" +
                "            <D>355560119533630</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>321</D>\n" +
                "            <D>2020-12-01</D>\n" +
                "            <D>342</D>\n" +
                "            <D>1</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTATEIS</D>\n" +
                "            <D>8466</D>\n" +
                "            <D>1</D>\n" +
                "            <D>7e534216-9d50-4274-a60a-c11b8355e7af</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403000260</D>\n" +
                "            <D>3</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>07789003203593371</D>\n" +
                "            <D>15128800865</D>\n" +
                "            <D>renata moura santos</D>\n" +
                "            <D>1972-04-01</D>\n" +
                "            <D>F</D>\n" +
                "            <D>N</D>\n" +
                "            <D>08341-150</D>\n" +
                "            <D>RUA ILHA DA QUEIMADA</D>\n" +
                "            <D>109</D>\n" +
                "            <D />\n" +
                "            <D>SÃO PAULO</D>\n" +
                "            <D>PARQUE BOA ESPERANÇA</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>10</D>\n" +
                "            <D />\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2021-12-02</D>\n" +
                "            <D>319.80</D>\n" +
                "            <D>1599.0000</D>\n" +
                "            <D>MOTO G9 PLAY, ROSA QUARTZO</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000166</D>\n" +
                "            <D>355560119522351</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>2913</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>344</D>\n" +
                "            <D>5</D>\n" +
                "            <D>(PROMO RQF) ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTÁTEIS</D>\n" +
                "            <D>407</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTATEIS</D>\n" +
                "            <D>8467</D>\n" +
                "            <D>1</D>\n" +
                "            <D>12bd4763-153a-468f-a5e1-cfaacdea9ca3</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403004509</D>\n" +
                "            <D>22</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890220053003319962</D>\n" +
                "            <D>10731138848</D>\n" +
                "            <D>MARCIA TAMIE NAMIKAWA</D>\n" +
                "            <D>1968-08-27</D>\n" +
                "            <D>F</D>\n" +
                "            <D>D</D>\n" +
                "            <D>08225-300</D>\n" +
                "            <D>RUA FERDINANDO BIBIENA</D>\n" +
                "            <D>147</D>\n" +
                "            <D />\n" +
                "            <D>SÃO PAULO</D>\n" +
                "            <D>CIDADE ANTÔNIO ESTEVÃO DE CARVALHO</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>10</D>\n" +
                "            <D>marciatami@hotmail.com</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2021-12-02</D>\n" +
                "            <D>522.22</D>\n" +
                "            <D>1899.0000</D>\n" +
                "            <D>MOTOROLA ONE FUSION 128, VERDE ESMERALDA</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000166</D>\n" +
                "            <D>356909110707736</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>295</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>269</D>\n" +
                "            <D>1</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTATEIS</D>\n" +
                "            <D>8468</D>\n" +
                "            <D>1</D>\n" +
                "            <D>883b6c8b-4774-4501-bbb7-a649f555a9cd</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403000260</D>\n" +
                "            <D>3</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890030013098569127</D>\n" +
                "            <D>37434564865</D>\n" +
                "            <D>daniel soares</D>\n" +
                "            <D>1986-08-14</D>\n" +
                "            <D>M</D>\n" +
                "            <D>N</D>\n" +
                "            <D>08346-600</D>\n" +
                "            <D>RUA TRANCREDO DE ALMEIDA NEVES</D>\n" +
                "            <D>128</D>\n" +
                "            <D />\n" +
                "            <D>SÃO PAULO</D>\n" +
                "            <D>JARDIM NOVA CONQUISTA</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>10</D>\n" +
                "            <D />\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2021-12-02</D>\n" +
                "            <D>412.22</D>\n" +
                "            <D>1499.0000</D>\n" +
                "            <D>MOTO E7 PLUS, AZUL NAVY</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000166</D>\n" +
                "            <D>355561111118891</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>2916</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>344</D>\n" +
                "            <D>1</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTATEIS</D>\n" +
                "            <D>8469</D>\n" +
                "            <D>1</D>\n" +
                "            <D>3df5d016-4ec0-4458-9439-f31176f9b72e</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403001828</D>\n" +
                "            <D>10</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890100021030381409</D>\n" +
                "            <D>29873285830</D>\n" +
                "            <D>SULLIVAN CIRINO DA SILVA</D>\n" +
                "            <D>1981-03-03</D>\n" +
                "            <D>F</D>\n" +
                "            <D>N</D>\n" +
                "            <D>09972-330</D>\n" +
                "            <D>RUA PRESIDENTE WENCESLAU</D>\n" +
                "            <D>142</D>\n" +
                "            <D>CASA 3</D>\n" +
                "            <D>DIADEMA</D>\n" +
                "            <D>ELDORADO</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>10</D>\n" +
                "            <D />\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2021-12-02</D>\n" +
                "            <D>375.76</D>\n" +
                "            <D>1599.0000</D>\n" +
                "            <D>MOTOROLA ONE FUSION, VERDE ESMERALDA</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000165</D>\n" +
                "            <D>353620111030316</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>2689</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>323</D>\n" +
                "            <D>2</D>\n" +
                "            <D>ROUBO E FURTO DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO DE PORTÁTEIS</D>\n" +
                "            <D>8470</D>\n" +
                "            <D>1</D>\n" +
                "            <D>5d226136-32da-4a78-a287-344fdb6a7fdd</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403001828</D>\n" +
                "            <D>10</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890100021046785486</D>\n" +
                "            <D>16371975862</D>\n" +
                "            <D>IVONETE FERREIRA DA SILVA</D>\n" +
                "            <D>1971-03-05</D>\n" +
                "            <D>F</D>\n" +
                "            <D>N</D>\n" +
                "            <D>09911-590</D>\n" +
                "            <D>RUA PRINCESA LEOPOLDINA</D>\n" +
                "            <D>95</D>\n" +
                "            <D />\n" +
                "            <D>DIADEMA</D>\n" +
                "            <D>CONCEIÇÃO</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>5</D>\n" +
                "            <D />\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2021-12-02</D>\n" +
                "            <D>258.26</D>\n" +
                "            <D>1099.0000</D>\n" +
                "            <D>MOTO G8 PLAY, VERMELHO MAGENTA</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000165</D>\n" +
                "            <D>350929391445174</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>2691</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>323</D>\n" +
                "            <D>2</D>\n" +
                "            <D>ROUBO E FURTO DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO DE PORTÁTEIS</D>\n" +
                "            <D>8471</D>\n" +
                "            <D>1</D>\n" +
                "            <D>bdc2e757-9efe-42a9-8fe7-bff8e146217c</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403004681</D>\n" +
                "            <D>20</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890200050066634959</D>\n" +
                "            <D>35032145858</D>\n" +
                "            <D>Bruna Alves</D>\n" +
                "            <D>1987-06-03</D>\n" +
                "            <D>F</D>\n" +
                "            <D>N</D>\n" +
                "            <D>03977-535</D>\n" +
                "            <D>TRAVESSA CRAVIÚNA</D>\n" +
                "            <D>70</D>\n" +
                "            <D />\n" +
                "            <D>SÃO PAULO</D>\n" +
                "            <D>FAZENDA DA JUTA</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>3</D>\n" +
                "            <D>bruna.alvesfrancisco@gmail.com</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2021-12-02</D>\n" +
                "            <D>439.72</D>\n" +
                "            <D>1599.0000</D>\n" +
                "            <D>MOTOROLA ONE FUSION, VERDE ESMERALDA</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000166</D>\n" +
                "            <D>353620111021570</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>316</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>354</D>\n" +
                "            <D>1</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTATEIS</D>\n" +
                "            <D>8464</D>\n" +
                "            <D>1</D>\n" +
                "            <D>34a5fe07-5951-4af5-88d3-75cc2216093d</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "        <R>\n" +
                "            <D>7789</D>\n" +
                "            <D>20216403001070</D>\n" +
                "            <D>7</D>\n" +
                "            <D>2195</D>\n" +
                "            <D>077890070030045938134</D>\n" +
                "            <D>33005918807</D>\n" +
                "            <D>ALESSANDRO DE DEUS MOREIRA DE ANDRANDE</D>\n" +
                "            <D>1986-01-29</D>\n" +
                "            <D>M</D>\n" +
                "            <D>C</D>\n" +
                "            <D>07745-040</D>\n" +
                "            <D>RUA ARAPONGA</D>\n" +
                "            <D>119</D>\n" +
                "            <D>CASA 2</D>\n" +
                "            <D>CAIEIRAS</D>\n" +
                "            <D>LARANJEIRAS</D>\n" +
                "            <D>SP</D>\n" +
                "            <D />\n" +
                "            <D>10</D>\n" +
                "            <D>alessandro.m.andrade@hotmail.com</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>2021-12-02</D>\n" +
                "            <D>824.72</D>\n" +
                "            <D>2999.0000</D>\n" +
                "            <D>MOTO G 5G PLUS - AZUL OCEANO</D>\n" +
                "            <D>MOTOROLA MOBILITY COMÉRCIO DE PRODUTOS ELETRÔNICOS</D>\n" +
                "            <D>0027109900000166</D>\n" +
                "            <D>356924110952299</D>\n" +
                "            <D>12</D>\n" +
                "            <D>0</D>\n" +
                "            <D>3262</D>\n" +
                "            <D>2020-12-02</D>\n" +
                "            <D>219</D>\n" +
                "            <D>1</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTÁTEIS</D>\n" +
                "            <D>4</D>\n" +
                "            <D>ROUBO E FURTO COM QUEBRA ACIDENTAL DE PORTATEIS</D>\n" +
                "            <D>8465</D>\n" +
                "            <D>1</D>\n" +
                "            <D>b4a03fea-6a11-4222-ae5a-66392b82b68d</D>\n" +
                "            <D>True</D>\n" +
                "        </R>\n" +
                "    </ResponseData>\n" +
                "    <ResponseResult>\n" +
                "        <ResponseSuccess>True</ResponseSuccess>\n" +
                "    </ResponseResult>\n" +
                "</Microvix>");
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
