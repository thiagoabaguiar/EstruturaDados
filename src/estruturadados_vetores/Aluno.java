package estruturadados_vetores;

//Classe que determina o tipo de dado, com seus respectivos atributos e métodos.
//Aqui não se prevê métodos para manipulação de arrays. Abstração a nível granular, foco no elemento individual.
//Essa classe é similar a String, Integer, Float, etc.
public class Aluno {

    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + '}';
    }

}
