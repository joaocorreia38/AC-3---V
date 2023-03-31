public class Show extends Evento {
     String artista;
     IngressoVIP ingressoVip;

     Show(String nome, String local, int capacidade, Ingresso ingresso, String artista, IngressoVIP ingressoVip) {
        super(nome, local, capacidade, ingresso);
        this.artista = artista;
        this.ingressoVip = ingressoVip;
    }
}