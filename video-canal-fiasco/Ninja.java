public class Ninja {
    // antes do encapsulamento, os atributos eram públicos, ou seja, podiam ser acessados por qualquer classe
    // String nome;
    // String aldeia;
    // int idade ;

    // encapsulamento - os atributos ficam privados, ou seja, só podem ser acessados por métodos da própria classe
    private String nome;
    private String aldeia;
    private int idade;

    // getters e setters - métodos públicos que permitem acessar e modificar os atributos privados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia){
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void ataqueBase(){
        System.out.println("Eu vou tacar uma kinai em você, toma!");
    }
}
