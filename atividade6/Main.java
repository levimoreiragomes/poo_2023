public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("---------------------------------------");
        System.out.println("Bem-vindo ao Sistema de Vendas de Tênis!");
        System.out.println("---------------------------------------");

        Cliente joao = new Cliente("João", "Rua Principal, 123");
        Pedido pedidoJoao = new Pedido(joao);
        Tenis tenis1 = new Tenis("Nike Air Max", 150.0, "42", "Azul");
        Tenis tenis2 = new Tenis("Adidas Superstar", 120.0, "40", "Branco");

        pedidoJoao.adicionarItem(tenis1);
        pedidoJoao.adicionarItem(tenis2);

        System.out.println("\nDetalhes do Pedido de João:");
        pedidoJoao.mostrarDetalhes();

        System.out.println("\n---------------------------------------");

        Cliente maria = new Cliente("Maria", "Avenida Secundária, 456");
        Pedido pedidoMaria = new Pedido(maria);
        Tenis tenis3 = new Tenis("Puma Suede", 90.0, "38", "Vermelho");
        Tenis tenis4 = new Tenis("Reebok Classic", 110.0, "39", "Preto");

        pedidoMaria.adicionarItem(tenis3);
        pedidoMaria.adicionarItem(tenis4);

        System.out.println("\nDetalhes do Pedido de Maria:");
        pedidoMaria.mostrarDetalhes();

        System.out.println("\n---------------------------------------");
    }
}
