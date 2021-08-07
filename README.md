# XMLToJSON-Java
Convert XML Malformed to JSON

### Descrição

Este código em Java permite converter XML para JSON de arquivos malformados.
Muitas vezes, não conseguimos utilizar recursos conhecidos como:

* Javascript MS
* ActiveX
* DOMParser - Não faz parte do Javascript (é Mozila)
* NodeJS
* JQuery

O DOMParser é um recurso exclusivo de browsers e não é um código disponível em Javascript. Portanto só vai funcionar em casos restritos.
ActiveX e Javascript MS são recursos exclusivos de tecnologias da Microsoft e também é bem restrito.
NodeJS e JQuery são frameworks também que restrigem ao uso se seu código permitir incorporar esses componentes.

Portato, este código em Java permite a conversão caso você esteja restrito a estes problemas acima descritos.

