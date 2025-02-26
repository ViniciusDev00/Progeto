// Classe Main (teste o código aqui!)
public class Main {
    public static void main(String[] args) {
        GatewayPagamento gateway = new GatewayCartao();
        Pagamento pagamento = gateway.criarPagamento();
        pagamento.processar(); // Saída: "Pagamento com cartão processado!"

        gateway = new GatewayPix();
        pagamento = gateway.criarPagamento();
        pagamento.processar(); // Saída: "Pagamento com Pix processado!"
    }
}