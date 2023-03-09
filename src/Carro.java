public class Carro {
    String cor;
    String marca;
    String modelo;
    double velocidadeMaxima;
    double velocidadeAtual;

    void ligar() {
        System.out.println("O carro ligou");
    }

    void acelerar() {
        if(velocidadeAtual + 1 > velocidadeMaxima) {
            System.out.println("Estamos em velocidade máxima");
            return;
        }

        velocidadeAtual += 1;
    }

    void mostraInfo() {
        System.out.printf("\nCARRO:\nCor: %s\nMarca: %s\nModelo: %s\nVelocidade Máxima: %.1f km/h\nVelocidade Atual: %.1f km/h\n\n",
                cor, marca, modelo, velocidadeMaxima, velocidadeAtual);
    }
}
