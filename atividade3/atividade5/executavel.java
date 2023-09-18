// Classe base Veiculo
class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int velocidade;

    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidade = 0;
    }

    public void acelerar(int aumentoVelocidade) {
        this.velocidade += aumentoVelocidade;
        System.out.println("Acelerando para " + this.velocidade + " km/h");
    }

    public void frear(int reducaoVelocidade) {
        this.velocidade -= reducaoVelocidade;
        System.out.println("Freando para " + this.velocidade + " km/h");
    }
}

// Subclasse Carro
class Carro extends Veiculo {
    public Carro(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void ligarFarol() {
        System.out.println("Farol do carro ligado");
    }
}

// Subclasse Moto
class Moto extends Veiculo {
    public Moto(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void empinar() {
        System.out.println("Moto empinando!");
    }
}

// Subclasse Bicicleta
class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void pedalar() {
        System.out.println("Bicicleta pedalando!");
    }
}

// Classe Executavel
public class Executavel {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022);
        Moto moto = new Moto("Honda", "CBR600RR", 2023);
        Bicicleta bicicleta = new Bicicleta("Caloi", "Mountain Bike", 2021);

        carro.acelerar(60);
        moto.acelerar(80);
        bicicleta.acelerar(20);

        carro.frear(10);
        moto.frear(15);
        bicicleta.frear(5);

        carro.ligarFarol();
        moto.empinar();
        bicicleta.pedalar();
    }
}
