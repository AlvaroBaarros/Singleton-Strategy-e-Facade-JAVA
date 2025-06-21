package facade;

public class PedidoFacade {
    private SistemaDePagamento pagamento = new SistemaDePagamento();
    private SistemaDeEstoque estoque = new SistemaDeEstoque();

    public void realizarPedido() {
        pagamento.processarPagamento();
        estoque.atualizarEstoque();
        System.out.println("Pedido realizado com sucesso!");
    }
}