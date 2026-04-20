public class Main{
    //  ---------- Tipos de dados e etc
    // public static void main(String[] args) {

        /* Tipos primitivos */
        // int idade = 32; // 32 bits
        // double altura = 1.83; // 16 bits
        // char letra = 'a'; //16 bits
        // Long numerosGrandes = 9999L; // 64 bits

        // // Tipos não primitivos - Pode ser um objeto que pode receber atributos
        // String nome = "Debora S"; // é uma espécie de vetor de char
        // String nomeUpperCase = nome.toUpperCase(); 
        // nome.charAt(3); // retorna b
        // System.out.println(nomeUpperCase);
        // System.out.println("Mostrando para o usuário: ");
        
        // mostrarMeuNome(nome, idade);
        // ou
        //  mostrarMeuNome("Débora", 11);

    //      for(int i = 0; i <10; i++){
    //         mostrarMeuNome("Débora", 11+i);
    //      }

    // }

    // private static void  mostrarMeuNome(String nome, int idade){
    //     System.out.println("Meu nome é "+nome+", pô. Eu tenho "+ idade + " anos!!");
    // }


    // ---------------- Orientação a Objetos
    public static void main(String[] args){
        // Obj 1
        Ninja naruto = new Ninja();
        naruto.nome = "Narutinho Uzumaki";

        // Obj 2
        Uchiha sasuke = new Uchiha();
        sasuke.nivelDoSharingan = "três";
        sasuke.nome = "Sasuke Uchiha";
        sasuke.sharinganAtivado();
    }
}