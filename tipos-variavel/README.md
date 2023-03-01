# Java - Tipos primitivos

### Variáveis

​        Uma variável é um objeto normalmente localizado na memória utilizado para representar valores, quando declaramos uma variável estamos associando seu nome (identificador) ao local da memória onde está armazenado sua informação, as variáveis em Java podem ser do tipo primitivo ou objeto:

Variáveis primitivas: podem ser do tipo byte, short, int, long, float, double, char ou boolean.

Variáveis de referência: usada para referenciar um objeto. Quando usamos uma variável de referência definimos qual o tipo do objeto ou um subtipo do tipo do objeto (veremos isso mais para frente).

Quando declaramos uma variável primitiva, estamos associando está a um espaço na memória que vai guardar o seu valor. No caso da variável de referência, podemos tê-la apontando para algum lugar vazio (null) ou para algum espaço da memória que guarda os dados de um objeto.

As variáveis primitivas e de referência são guardadas em locais diferentes da memória. Variáveis primitivas ficam em um local chamado stack e as variáveis de referência ficam em um local chamado heap.

### Tipos primitivos

A linguagem Java não é totalmente Orientada a Objetos, e isto se deve principalmente aos atributos do tipo primitivo, pois são tipos de dados que não representam classes, mas sim valores básicos.

Os tipos primitivos, assim como em várias outras linguagens tais como o C, existem para representar os tipos mais simples de dados, sendo eles dados numérico, booleano e caractere. 



### Tipos de variáveis padrões no Java

Por padrão, o Java possui em sua biblioteca padrão alguns tipos:

• **Byte:** um inteiro com valor 8 bits, onde seu intervalo de valores vai do -128 até o 127. É um dado leve, que ocupa pouco espaço em memória;

• **Char:** trata-se de um único caractere unicode de 16 bits. Seu intervalo de valores vai do ‘\u0000’ ou 0 até o valor máximo ‘\uffff’ ou 65535. É utilizado para armazenar caracteres de maneira isolada;

• **Short:** trata-se de um valor inteiro de 16 bits. Seu intervalo de valores vai do -32.768 até o 32.767;

• **Int:** trata-se de um valor inteiro de 32 bits. Suporta valores de -2.147.483.648 a 2.147.483.647;

• **Long:** define um valor inteiro de 64 bits. Suporta valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807;

• **Boolean:** é um dos tipos de dados mais simples, pois ele pode armazenar apenas dois valores: true (verdadeiro) ou false (falso). É empregado para realizar testes lógicos, dentro de estruturas de decisão e repetição, por exemplo.

• **Float:** trata-se de um tipo de dado de ponto flutuante de 32 bits. Isso quer dizer que ele permite armazenar valores decimais entre 6 e 7 casas. Porém, o armazenamento em memória pode não representar necessariamente o valor repassado. Por exemplo, um float definido com “0,001” pode acabar sendo armazenado como “0,00100001”, e isso não somente no Java, já que isso é decorrência dos pontos flutuantes em geral. Por isso, o tipo float não deve ser usado para operações que precisam passar por várias operações aritméticas, como no caso de sistemas financeiros. Isso porque, a primeira vista, essa imprecisão pode não impactar, mas na sequência de operações realizadas, estas imprecisões podem começar a aparecer nos resultados;