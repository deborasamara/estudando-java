public class Uchiha extends Ninja { // Herança
    String nivelDoSharingan;

    public void sharinganAtivado(){
        System.out.println("sharin ativadooooooo");
    }
    // sobrescrita de método
    @Override
    public void ataqueBase(){
        System.out.println("Eu vou tacar uma kinai do elemento fogo em você, toma!");
    }

     public void ataqueBase(int nivelDeChacra){
        if(nivelDeChacra > 20){
            System.out.println("Susado ativado!!");
        }else if (nivelDeChacra < 1){
            System.out.println("Eu só consegui ativar isso aí, brow, o sharingan");
        }else{
            System.out.println("Eu to sem chacra.");
        }
    }
}
