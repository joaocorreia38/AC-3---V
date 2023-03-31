public class Ingresso implements Pagamento {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double calcularValor() {
        return valor;
    }

    @Override
    public double efetuarPagamento() {
        double valorDescontado = valor * 0.58; // 42% de impostos
        System.out.println("Valor a ser pago: R$ " + valorDescontado);
        return valorDescontado;
    }

    // getters e setters
}