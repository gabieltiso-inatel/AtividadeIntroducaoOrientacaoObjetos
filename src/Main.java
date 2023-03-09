public class Main {
    public static void main(String[] args) {
        Motor mFerrari = new Motor();
        mFerrari.potencia = 100;
        mFerrari.tipo = "V8";
        mFerrari.carro.cor = "Vermelho";
        mFerrari.carro.marca = "Ferrari";
        mFerrari.carro.modelo = "458";
        mFerrari.carro.velocidadeMaxima = 345;
        mFerrari.carro.velocidadeAtual = 100;

        mFerrari.carro.ligar();
        for(int i = 0; i < 10; i++) {
            mFerrari.carro.acelerar();
        }
        mFerrari.mostraInfo();

        Motor mLambo = new Motor();
        mLambo.potencia = 80;
        mLambo.tipo = "V8";
        mLambo.carro.cor = "Verde";
        mLambo.carro.marca = "Lamborghini";
        mLambo.carro.modelo = "Aventador";
        mLambo.carro.velocidadeMaxima = 328;
        mLambo.carro.velocidadeAtual = 80;

        mLambo.carro.ligar();
        for(int i = 0; i < 40; i++) {
            mLambo.carro.acelerar();
        }
        mLambo.mostraInfo();
    }
}
