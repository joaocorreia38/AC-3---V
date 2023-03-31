public class IngressoVIP extends Ingresso {
    private double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double calcularValor() {
        return super.calcularValor() + valorAdicional;
    }

    @Override
    public double efetuarPagamento() {
        double valorDescontado = calcularValor() * 0.58; // 42% de impostos
        System.out.println("Valor a ser pago (VIP): R$ " + valorDescontado);
        return valorDescontado;
    }

    // getters e setters
}