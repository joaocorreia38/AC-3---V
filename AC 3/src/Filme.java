public class Filme extends Evento {
     String cinema;
     String sala;
     String genero;

     Filme(String nome, String local, int capacidade, Ingresso ingresso, String cinema, String sala, String genero) {
        super(nome, local, capacidade, ingresso);
        this.cinema = cinema;
        this.sala = sala;
        this.genero = genero;
    }

}
