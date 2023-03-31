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

     String getNome() {
        return nome;
    }

     void setNome(String nome) {
        this.nome = nome;
    }

     String getLocal() {
        return local;
    }

     void setLocal(String local) {
        this.local = local;
    }

     int getCapacidade() {
        return capacidade;
    }

     void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

     Ingresso getIngresso() {
        return ingresso;
    }

     void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

     double calcularReceita() {
        return capacidade * ingresso.calcularValor();
    }
}