public class Main {
    public static void main(String[] args) {
        // Cria ingressos
        Ingresso ingresso = new Ingresso(30.0);
        IngressoVIP ingressoVIP = new IngressoVIP(50.0, 20.0);

        // Cria eventos
        Evento show = new Show("Tour Coldplay Brasil", "Engenhao", 1000, ingresso, "Coldplay", ingressoVIP);
        Evento filme = new Filme("Homem de Ferro", "Cinema", 200, ingresso, "Cinepolis", "Sala 1", "Ação");
        Evento teatro = new Teatro("Mama Mia", "Villaje mall", 500, ingresso);

        // Print eventos
        System.out.println(show.getNome());
        System.out.println("Receita total do show - " + show.calcularReceita());

        System.out.println(filme.getNome());
        System.out.println("Receita total do filme - " + filme.calcularReceita());

        System.out.println(teatro.getNome());
        System.out.println("Receita total do teatro - " + teatro.calcularReceita());
    }
}
