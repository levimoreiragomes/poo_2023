import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Item {
    private String nome;
    private int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

class Estoque {
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(String nome) {
        Iterator<Item> iterator = itens.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getNome().equals(nome)) {
                iterator.remove();
                break;
            }
        }
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (Item item : itens) {
            if (item.getNome().equals(nome)) {
                item.setQuantidade(novaQuantidade);
                break;
            }
        }
    }

    public void listarItens() {
        System.out.println("Itens em estoque:");
        for (Item item : itens) {
            System.out.println("Nome: " + item.getNome() + ", Quantidade: " + item.getQuantidade());
        }
    }
}

public class GerenciamentoEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Atualizar quantidade");
            System.out.println("4. Listar itens");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a entrada numérica

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String nomeItem = scanner.nextLine();
                    System.out.print("Digite a quantidade do item: ");
                    int quantidadeItem = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha após a entrada numérica
                    estoque.adicionarItem(new Item(nomeItem, quantidadeItem));
                    break;
                case 2:
                    System.out.print("Digite o nome do item a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    estoque.removerItem(nomeRemover);
                    break;
                case 3:
                    System.out.print("Digite o nome do item a ser atualizado: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha após a entrada numérica
                    estoque.atualizarQuantidade(nomeAtualizar, novaQuantidade);
                    break;
                case 4:
                    estoque.listarItens();
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida! Digite um número de 1 a 5.");
            }
        }
    }
}
