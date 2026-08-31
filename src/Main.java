import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Operacoes operacoes = new Operacoes();

        System.out.printf
                ("Resultado multiplicação:%d", operacoes.multiplicar(33,44));

        System.out.println("\nNumero primo:"+ operacoes.verificarNumeroPrimo(3));

        System.out.println("Nome convertido:"+ operacoes.converteString("laura"));


        System.out.println("Verificar polindorma:" + operacoes.verificarPalindromo("arara"));

        List <Integer> listadeinteiros = new ArrayList<>();
        listadeinteiros.add(1);
        listadeinteiros.add(2);
        listadeinteiros.add(3);

        System.out.println("Lista multiplicada por 3:" +  operacoes.multiplicalista(listadeinteiros));

        List <String> listaNomes = new ArrayList<>();
        listaNomes.add("joao");
        listaNomes.add("cleber");
        listaNomes.add("adriana");

        System.out.println("Lista de nome ordenada"+ operacoes.listaOrdenada(listaNomes));


        System.out.println("Divição de numeros:" + operacoes.dividirnumeros(50.4,7.0));
    }
}
