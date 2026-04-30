import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {

        // Numeros inteiros 
            // byte => 8 bits => -128 a 127
            // short => 16 bits => -32.768 a 32.767
            // int => 32 bits => -2.147.483.648 a 2.147.483.647
            // long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        
        // Numeros decimais
            // float => 32 bits => 6 a 7 digitos decimais => precisão simples
            // double => 64 bits => 15 a 16 digitos decimais

        // Letras e palavras 
            // String => representar palavras e frases 
            // char => 16 bits => representar um unico caractere => a, b, c, d
        
        // Booleanos
            // boolean => 1 bit => true ou false

        // tipos primitivos em Java

        // byte b = 100; 
        // short s = 10000;
        // int i = 100000;
        // long l = 10000000000L; // O 'L' é necessário para indicar que é um literal do tipo long
        // float f = 3.14f; // O 'f' é necessário para indicar que é um literal do tipo float
        // double d = 3.141592653589793;
        // char c = 'A';
        // boolean bool = true;

        // tipos não primitivos. É uma classe 

        // String str = "Olá, mundo!";


        // Condicionais 
        // if(str.equals("Olá, mundo!")){
        //     System.out.println("A condição é verdadeira");
        // }else{
        //     System.out.println("A condição é falsa");
        // }

        // if(str.equals("Olá, mundo!")){
        //     System.out.println("A condição é verdadeira");
        // }else if(str.equals("Oi, mundo!")){
        //     System.out.println("A condição é verdadeira");
        // }else{
        //     System.out.println("A condição é falsa");
        // }

        // Vetores - estrutura de dados que a gente usa para armazenar uma coleção de dados do mesmo tipo. Array Multidimensional - matriz
        // int [] numeros = {1, 2, 3, 4, 5}; ;// forma 1 de declarar um array - vetor unidimensional
        // System.out.println(numeros[0]); // Acessando o primeiro elemento do vetor
        // System.out.println(numeros.length); // Acessando o tamanho do vetor

        // int [] numeros2 = new int[5]; // forma 2 de declarar um array - vetor unidimensional

        // Classe no Java que vai nos permitir criar uma lista dinâmica de elementos do mesmo tipo. não precisa declarar o tamanho da lista, ela vai crescendo conforme a gente for adicionando elementos. A classe ArrayList é parte da biblioteca de coleções do Java, que oferece uma variedade de classes para trabalhar com diferentes tipos de coleções, como listas, conjuntos e mapas.
        // ArrayList<String> lista = new ArrayList<>(); // Criando uma lista de Strings
        // lista.add("Oiii"); // Adicionando um elemento à lista
        // lista.add("Tudo bem?"); // Adicionando outro elemento à lista
        // System.out.println(lista.get(0)); // Acessando o primeiro elemento da lista
        // lista.remove(0); // Removendo o primeiro elemento da lista
        // lista.remove("Tudo bem?"); // Removendo o elemento "Tudo bem?" da lista
    }

}