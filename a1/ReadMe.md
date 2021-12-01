# Estrutura de Dados - Atividade 1 - Universidade Anhembi Morumbi - Nota recebida: 9
## Enunciado



Implemente um programa para cadastro de alunos de uma disciplina utilizando a linguagem Java, seguindo os seguintes critérios: 

Criar uma estrutura heterogênea (array) do tipo string para cadastrar o nome de 25 alunos; 
Garantir que a estrutura seja totalmente preenchida. 

Após implementar o programa e preencher o array com o nome dos alunos, cadastre mais 5 novos alunos.  

Qual a dificuldade de inserir os novos alunos nessa estrutura de dados? Justifique a sua resposta direcionando aos conceitos de gerenciamento de memória. 

## Resposta à pergunta dissertativa:

O array é uma estrutura de dados estática com tamanhos fixo, ou seja, uma quantidade fixa de elementos com um tamanho fixo na memória, portanto, se eu crio um array de Strings com 25 elementos não poderei adicionar mais elementos pois ele reservou exatamente a memória que precisava para 25 Strings. Vou me deparar com o seguinte erro de Run Time ao tentar continuar a colocar alunos depois de preencher os 25 espaços:

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
Index 25 out of bounds for length 25
at Main.funcaoQueVaiDarErro(Main.java:41)
at Main.main(Main.java:21)
```

Index 25 out of bounds: ou seja, eu não tenho elementos após o índice 24 e o índice 25 está fora do endereço de memória desse array. Portanto esse código não me deixaria colocar mais elementos. Para ter elementos flexíveis precisaria usar uma estrutura de dados dinâmica como uma Lista, por exemplo, pois a estrutura de dados dinâmica não tem tamanho fixo e aloca memória à medida que vai precisando, e seu limite é a memória do próprio computador.

Para exemplificar os problemas criei duas funções, deixando a função que dá erro comentada para que o professor possa descomentar ela e testar. Na função chamada funcaoQueVaiDarErro() criei um array com 25 elementos e 4 loops. 
- 1 para adicionar 25 elementos, 
- 1 para exibi-los, 
- 1 para adicionar mais 5 elementos, 
- e o último para exibir novamente o array. 

Ao rodar essa função tenho um erro de Run Time que vai parar de executar o programa devido ao Index out of bound no terceiro loop.

Na segunda função funcaoQueVaiFuncionar(). Também fiz 4 loops. 
- 1 para pedir os primeiros 25 elementos, 
- 1 imprimir os elementos, 
- 1 para pedir mais 5 elementos 
- e mais 1 para novamente imprimir os elementos. 

Mas ao invés de um array usei uma coleção List, ArrayList. O que me permitiu ter um número variável de elementos. Neste caso não ocorre um erro de Run time no terceiro loop e ele me permite adicionar mais 5 elementos já que a alocação de memória ocorre de maneira dinâmica pelo Java pelo tipo de estrutura escolhida.

É uma maneira mais eficiente, a meu ver, de gerenciamento de memória quando se usará elementos variáveis. O array é mais adequado para quando eu sei exatamente o número de elementos que irei ter no meu array e realmente irei usar todos os elementos, ou estarei desperdiçando memória com o chamado lixo de memória.
