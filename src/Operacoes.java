import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Operacoes {

    private OperacoesDoistipos <Integer>
            multiplicacao = (a,b) ->{return a*b;};



    private  OperacoesUmtipo <Integer,Boolean> ehprimo = numero ->{
        if(numero<=1 ){
            return false;
        }
        for (int i=2; i*i <=numero;i++){
            if (numero%i==0){
                return false;
            }
        }
        return true;
    };

    private OperacoesUmtipo <String,String> convertString =
            nome -> nome = nome.toUpperCase();



    private OperacoesUmtipo <String,Boolean> palindromo =
            str -> str.equals(new StringBuilder(str).reverse().toString());


    private OperacoesUmtipo <List <Integer>, List<Integer>>
            listaMultiplicada = lista ->
    {
       List<Integer> novaLista = new ArrayList<>(lista);
       novaLista.replaceAll(num -> num *3);
       return novaLista;
    };

    private OperacoesUmtipo<List<String>, List<String>> listaOrdenada = lista -> {lista.sort(String::compareTo);
    return lista;};

    private OperacoesDoistipos<Double>

        dividirnumeros = (a, b) -> {
        if(a==0 || b==0){
            throw new ArithmeticException("Nao é possivel fazer divição por zero");
        }

        return a/b;
    };












    public Integer multiplicar(Integer a, Integer b){

        return multiplicacao.calcular(a,b);
    }


    public boolean verificarNumeroPrimo(Integer numero){

        return ehprimo.calcular(numero);
    }

    public String converteString(String nome){

        return convertString.calcular(nome);
    }

    public boolean verificarPalindromo(String palindromo){

        return  this.palindromo.calcular(palindromo);
    }

    public List <Integer> multiplicalista(List<Integer> listainteiro){
        return listaMultiplicada.calcular(listainteiro);
    }

    public List<String> listaOrdenada(List<String> lista){
        return listaOrdenada.calcular(lista);
    }


    public Double dividirnumeros(Double a, Double b){

        return dividirnumeros.calcular(a,b);

    }
}
