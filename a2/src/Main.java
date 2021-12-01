import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        Stack<Integer> pilhaNumeros = new Stack<>();
        Queue<Integer> filaNumeros = new LinkedList<>();
        int i;

        //Inserindo os números [1, 2, 3, 4 e 5] na lista
        for (i = 1; i <= 5; i++) {
            listaNumeros.add(i);

        }
        System.out.println("Número de elementos da lista: " + listaNumeros.size());
        System.out.println("Seguem os números na lista: ");
        while(!listaNumeros.isEmpty()){
            //Removendo o próximo elemento da lista e dando para uma variável temporário
            int elementoLista = listaNumeros.remove(0);
            //Imprimindo o número da lista na ordem
            System.out.printf("%d ", elementoLista);
            //Adicionando o elemento da lista à pilha na ordem
            pilhaNumeros.push(elementoLista);
        }

        if (listaNumeros.isEmpty()) {
            System.out.println("\nYay, minha lista está vazia!");
        } else {
            System.out.println("\nOops, deu algo errado, minha lista tinha que estar vazia.");
        }

        System.out.println("Número de elementos da pilha: " + pilhaNumeros.size());

        System.out.println("Seguem os números na pilha: ");
        while(!pilhaNumeros.isEmpty()) {
            //Removendo o elemento da pilha e dando para uma variável temporária
            int elementoPilha = pilhaNumeros.pop();
            //Imprimindo o número da pilha na ordem
            System.out.printf("%d ", elementoPilha);
            //Adicionando o número da piljha à fila na ordem
            filaNumeros.add(elementoPilha);
        }

        if (pilhaNumeros.isEmpty()) {
            System.out.println("\nYay, minha pilha está vazia!");
        } else {
            System.out.println("\nOops, deu algo errado, minha pilha tinha que estar vazia.");
        }
        //Verificando o número de elementos na Fila
        System.out.println("No momento tenho o seguinte número de elementos na minha fila: " + filaNumeros.size());
        System.out.println("Vamos ver quais são os elementos da minha fila e em que ordem estão?");

        for(Integer numeroFila: filaNumeros){
            System.out.printf("%d ", numeroFila);
        }

        //Repetindo passos 2 e 3 com os números [6, 7, 8, 9 e 10];
        //Inserindo os números [6, 7, 8, 9 e 10] na lista
        for (i = 6; i <= 10; i++) {
            listaNumeros.add(i);

        }
        System.out.println("\nNúmero de elementos da lista na segunda rodada de inserção: " + listaNumeros.size());
        System.out.println("Seguem os números na lista na segunda rodada: ");
        while(!listaNumeros.isEmpty()){
            //Removendo o próximo elemento da lista e dando para uma variável temporário
            int elementoLista = listaNumeros.remove(0);
            //Imprimindo o número da lista na ordem
            System.out.printf("%d ", elementoLista);
            //Adicionando o elemento da lista à pilha na ordem
            pilhaNumeros.push(elementoLista);
        }

        if (listaNumeros.isEmpty()) {
            System.out.println("\nYay, minha lista está vazia!");
        } else {
            System.out.println("\nOops, deu algo errado, minha lista tinha que estar vazia.");
        }

        System.out.println("Número de elementos da pilha: " + pilhaNumeros.size());
        System.out.println("Seguem os números na pilha na segunda rodada: ");
        while(!pilhaNumeros.isEmpty()) {
            //Removendo o elemento da pilha e dando para uma variável temporária
            int elementoPilha = pilhaNumeros.pop();
            //Imprimindo o número da pilha na ordem
            System.out.printf("%d ", elementoPilha);
            //Adicionando o número da piljha à fila na ordem
            filaNumeros.add(elementoPilha);
        }

        if (pilhaNumeros.isEmpty()) {
            System.out.println("\nYay, minha pilha está vazia!");
        } else {
            System.out.println("\nOops, deu algo errado, minha pilha tinha que estar vazia.");
        }

        //Imprimindo tamanho da Fila e os elementos da Fila
        System.out.println("O tamanho final da minha fila será de: " + filaNumeros.size());
        System.out.println("Seguem os números na fila em ordem depois de todas as inserões: ");
        for(Integer numeroFila : filaNumeros){
            System.out.printf("%d ", numeroFila);
        }

    }
}
