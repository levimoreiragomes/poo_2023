public class Tenis extends Produto {
    private String tamanho;
    private String cor;

    public Tenis(String nome, double preco, String tamanho, String cor) {
        super(nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }
}
