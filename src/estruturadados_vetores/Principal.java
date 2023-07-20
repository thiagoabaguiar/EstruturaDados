package estruturadados_vetores;

public class Principal {

    public static void main(String[] args) {

        // instanciando os elementos
        Aluno a1 = new Aluno("Thiago Aguiar");
        Aluno a2 = new Aluno("Filipe Augusto");
        Aluno a3 = new Aluno("Jéssica Rânelli");

        // instanciando um vetor de Aluno com 3 posições
        Aluno[] turmaA = new Aluno[3];

        // inserindo cada elemento em sua posição        
        turmaA[0] = a1;
        turmaA[1] = a2;
        turmaA[2] = a3;

        // instanciando um vetor customizado que terá métodos próprios
        VetorCustomizado meuVetor = new VetorCustomizado();

        // instanciando um vetor para testar os métodos da classe vetor customizado
        Object[] meuPerfil = new Object[4];
        meuPerfil[0] = "Thiago";
        meuPerfil[1] = 37;
        meuPerfil[2] = false;
        meuPerfil[3] = 101.3f;

        // testando o método localiza do vetor customizado
        int posicao = meuVetor.localiza(meuPerfil, 101.3f);
        System.out.println("Está na posição: " + posicao);

        // testando o método tamanho do vetor customizado
        // atenção que todo vetor quando instanciado tem todas as suas posições
        // preenchidas com valores (String = "", int = 0, boolean = false, Object = null)
        // dessa forma, o método tamanho irá considerar a qtd de posições, e não
        // a qtd de posições com valores definidos pelo programador
        int tamanho = meuVetor.tamanho(meuPerfil);
        System.out.println("Tamanho do vetor: " + tamanho);
        
        // testando o método de adição de elemento ao final do vetor
        // o retorno é um novo vetor
        System.out.println(meuVetor.exibe(meuPerfil));
        String naturalidade = "Cuiabá-MT";
        System.out.println(meuVetor.exibe(meuVetor.adiciona(meuPerfil, naturalidade)));

        // testando o método de exclusão de uma posição do vetor
        // o retorno é um novo vetor sem a posição que foi excluída
        Object[] meuPerfilNovo = meuVetor.exclui(meuPerfil, 1);
        System.out.println(meuVetor.exibe(meuPerfilNovo));

//        System.out.println(meuVetor.exibe(turmaA));
//        Object[] minhaFicha = new Object[5];
//        
//        minhaFicha[0] = "Thiago";
//        minhaFicha[1] = 37;
//        minhaFicha[2] = false;
//        minhaFicha[3] = 101.2f;
//        minhaFicha[4] = turmaA;       
//        
//        for(Object atributo : minhaFicha){
//            System.out.println(atributo);
//        }
    }

}
