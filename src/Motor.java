public class Motor {
    int potencia;
    String tipo;
    Carro carro;

    public Motor() {
       carro = new Carro(); 
    }

    void mostraInfo() {
        System.out.printf("MOTOR:\nPotência: %d\nTipo: %s\n", potencia, tipo);
        carro.mostraInfo();
    }
}
