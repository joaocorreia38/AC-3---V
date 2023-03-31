public class Teatro extends Evento implements Pagamento {
     String local;

     Teatro(String nome, String local, int capacidade, Ingresso ingresso) {
        super(nome, local, capacidade, ingresso);
    }
    
    @Override
    public double efetuarPagamento() {
        double valorIngresso = ingresso.calcularValor();
        return valorIngresso;
    }
}
