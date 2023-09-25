import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Tenis> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Tenis tenis) {
        itens.add(tenis);
    }

    public void mostrarDetalhes() {
        System.out.println("Pedido para o cliente: " + cliente.getNome());
        System.out.println("Endereço de entrega: " + cliente.getEndereco());
        System.out.println("Itens no pedido:");

        double total = 0;
        for (Tenis tenis : itens) {
            System.out.println("- " + tenis.getNome() + " (" + tenis.getTamanho() + ", " + tenis.getCor() + "): $" + tenis.getPreco());
            total += tenis.getPreco();
        }

        System.out.println("Total do pedido: $" + total);
    }
}
