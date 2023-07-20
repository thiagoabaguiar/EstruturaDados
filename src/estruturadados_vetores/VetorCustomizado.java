package estruturadados_vetores;

//Classe para prover métodos próprios para manipulação de arrays
//Não prevê métodos para manipulação individual do dado; foco no array (adicionar elemento, remover elemento, length, etc)
//Essa classe é similar a ArrayList<T>, onde <T> seria uma classe Aluno (por ex), ficando VetorCustomizado<Aluno>, ou qualquer outra classe,
//ficando VetorCustomizado(Object).
public class VetorCustomizado {

    //TODO descrição
    public String exibe(Object[] vetor) {

        String resultado = "";

        if (vetor == null) {
            resultado = "ERRO - VETOR NULO";
        } else {
            for (Object elemento : vetor) {
                resultado += elemento;
                resultado += " | ";
            }
        }

        return resultado;
    }

    //TODO descrição
    public Object[] adiciona(Object[] vetor, Object elemento) {

        Object[] novoVetor = new Object[this.tamanho(vetor) + 1];

        for (int i = 0; i < this.tamanho(vetor); i++) {
            novoVetor[i] = vetor[i];
        }

        novoVetor[this.tamanho(novoVetor) - 1] = elemento;

        return novoVetor;

    }

    //TODO descrição
    public Object[] adiciona(Object[] vetor, Object elemento, int posicao) {

        if (posicao < 0 || posicao > this.tamanho(vetor)) {
            return null;
        } else {
            Object[] novoVetor = new Object[this.tamanho(vetor) + 1];

            for (int i = 0; i < posicao; i++) {
                novoVetor[i] = vetor[i];
            }

            for (int i = posicao; i < this.tamanho(vetor); i++) {
                novoVetor[i + 1] = vetor[i];
            }

            novoVetor[posicao] = elemento;

            return novoVetor;
        }
    }

    //TODO descrição
    public Object[] exclui(Object[] vetorOriginal, int posicao) {

        // criando um novo vetor com uma posição a menos do que o vetor original
        Object[] novoVetor = new Object[this.tamanho(vetorOriginal) - 1];

        // validando se a posição informada existe no vetor original
        if (posicao < 0 || posicao > this.tamanho(vetorOriginal)) {
            novoVetor = null;
        } else {
            // transferindo os dados do vetor original para o novo vetor, exceto
            // o dado na posição indicada para exclusão
            int j = 0;
            for (int i = 0; i < this.tamanho(vetorOriginal); i++) {
                if (i != posicao) {
                    novoVetor[j] = vetorOriginal[i];
                    j++;
                }
            }
        }

        return novoVetor;
    }

    //TODO descrição
    public int localiza(Object[] vetor, Object elemento) {
        int posicao = -1;

        for (int i = 0; i < this.tamanho(vetor); i++) {
            if (vetor[i].equals(elemento)) {
                posicao = i;
                break;
            };
        }

        return posicao;
    }

    //TODO descrição
    public Object localiza(Object[] vetor, int posicao) {
        Object elemento;

        if (posicao < 0 || posicao > this.tamanho(vetor)) {
            elemento = null;
        } else {
            elemento = vetor[posicao];
        }

        return elemento;
    }

    //TODO descrição
    public int tamanho(Object[] vetor) {
        int tamanho = 0;

        for (Object e : vetor) {
            tamanho++;
        }

        return tamanho;
    }

}
