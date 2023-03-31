public abstract class Evento {
     String nome;
     String local;
     int capacidade;
     Ingresso ingresso;

     Evento(String nome, String local, int capacidade, Ingresso ingresso) {
        this.nome = nome;
        this.local = local;
        this.capacidade = capacidade;
        this.ingresso = ingresso;
    }

    public String getNome() {
        return nome;
    }

    public double calcularReceita() {
        return capacidade * ingresso.calcularValor();
    }
}