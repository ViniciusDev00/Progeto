// Interface do Produto
interface Pagamento {
    void processar();
}

// Produto Concreto: Pagamento com Cartão
class PagamentoCartao implements Pagamento {
    @Override
    public void processar() {
        System.out.println("Pagamento com cartão processado!");
    }
}

// Produto Concreto: Pagamento com Pix
class PagamentoPix implements Pagamento {
    @Override
    public void processar() {
        System.out.println("Pagamento com Pix processado!");
    }
}

// Criador Abstrato
abstract class GatewayPagamento {
    public abstract Pagamento criarPagamento();
}

// Criador Concreto: Gateway para Cartão
class GatewayCartao extends GatewayPagamento {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCartao();
    }
}

// Criador Concreto: Gateway para Pix
class GatewayPix extends GatewayPagamento {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPix();
    }
}

