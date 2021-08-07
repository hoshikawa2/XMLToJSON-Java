# XMLToJSON-Java
Convert XML Malformed to JSON

### Descrição

Projeto: https://github.com/hoshikawa2/XMLToJSON-Java

Este código em Java permite converter XML para JSON de arquivos malformados.
Muitas vezes, não conseguimos utilizar recursos conhecidos como:

* Javascript MS
* ActiveX
* DOMParser - Não faz parte do Javascript (é Mozila)
* NodeJS
* JQuery

O DOMParser é um recurso exclusivo de browsers e não é um código disponível em Javascript. Portanto só vai funcionar em casos restritos.

ActiveX e Javascript MS são recursos exclusivos de tecnologias da Microsoft e também é bem restrito.

NodeJS e JQuery são frameworks também que restrigem seu o uso. Somente funcionará se seu código permitir incorporar esses frameworks.

Portato, este código em Java permite a conversão caso você esteja restrito a estes problemas acima descritos por se tratar de código Java puro.

Alguns exemplos:

    <root>
     <element>...</element>
     <element>...</element>
    </root>
    
    ou
    
    <root>
     <element index="1">...</element>
     <element index="2">...</element>
    </root>
    
    Neste exemplo:
    <a><b type='1'>teste1</b><b type='2'>teste2></b></a>
    
    A conversão resultaria em:
    {"a":{"b":"teste1","b":"teste2"}}}
    
### Utilização em OIC e Oracle SOA SUITE

Você pode utilizar este código em Java em projetos SOA SUITE, bastando fazer o embedded deste código para a conversão.

Para utilização com o Oracle Integration (OIC), você pode utilizar o mesmo código, porém em Javascript que se encontra em: https://github.com/hoshikawa2/js-xml-to-json

IMPORTANTE: O código-fonte deve ser utilizado por conta e risco. Não há suporte e/ou vínculo com qualquer empresa. O código-fonte é livre para modificações e foi construído apenas com a finalidade de ajudar a comunidade pois foi difícil encontrar algo que pudesse ser útil em casos bem específicos. O código-fonte possui limitações de parsing, portanto, se encontrar algo, reporte na página porém não espere por correções. Em alguns casos, não é mesmo a intenção de ter pré-tratamentos de validação do XML.
