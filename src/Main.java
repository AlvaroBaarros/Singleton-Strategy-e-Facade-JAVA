import singleton.Configuracao;
import strategy.*;
import facade.PedidoFacade;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Configuracao config = Configuracao.getInstancia();

        // Strategy
        Calculadora calc = new Calculadora();
        calc.setOperacao(new Soma());
        System.out.println("Soma: " + calc.calcular(5, 3));
        calc.setOperacao(new Subtracao());
        System.out.println("Subtração: " + calc.calcular(5, 3));

        // Facade
        PedidoFacade pedido = new PedidoFacade();
        pedido.realizarPedido();
    }
}