public class Main {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Ingresso(50.0);
        IngressoVIP ingressoVip = new IngressoVIP(50.0, 30.0);

        Evento eventoNormal = new Filme("Homem de ferro", "Barra Shopping", 100, ingressoNormal, "Cinemark", "Sala 1", "Ação");
        Evento eventoVip = new Show("Tour Coldplay", "Engenhao", 500, ingressoNormal, "Coldplay", ingressoVip);

        System.out.println("Evento normal - " + eventoNormal.getNome() + "- " + eventoNormal.calcularReceita() + " reais");
        System.out.println("Evento VIP - " + eventoVip.getNome() + "- " + eventoVip.calcularReceita() + " reais");

        double valorIngressoNormal = ingressoNormal.efetuarPagamento();
        double valorIngressoVip = ingressoVip.efetuarPagamento();

        System.out.println("Valor do ingresso normal com desconto de impostos - " + valorIngressoNormal);
        System.out.println("Valor do ingresso VIP com desconto de impostos - " + valorIngressoVip);
    }
}