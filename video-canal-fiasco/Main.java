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
        Usumake Naruto = new Usumake();
        // Naruto.nome = "Naruto uzumake";
        // Naruto.idade = 16;
        Naruto.setNome("Naruto uzumake");
        Naruto.setIdade(16);
        Naruto.temBiju = true;
        Naruto.ataqueBase();


        // Obj 2
        Uchiha sasuke = new Uchiha();
        sasuke.nivelDoSharingan = "três";
        // sasuke.nome = "Sasuke Uchiha";
        sasuke.setNome("Sasuke Uchiha");
        System.out.println("nome do sasuke: "+sasuke.getNome());
        sasuke.sharinganAtivado();
        sasuke.ataqueBase(30);

        // polimorfismo - o mesmo método, mas com comportamentos diferentes
         Naruto.ataqueBase();
         sasuke.ataqueBase();
    }

    
}