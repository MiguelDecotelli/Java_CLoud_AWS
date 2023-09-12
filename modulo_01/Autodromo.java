

public class Autodromo {
    public static void main(String[] args) {
        Carro mercedes = new Carro();
        mercedes.setChassi("3459876");
        mercedes.ligar();

        Moto kawasaki = new Moto();
        kawasaki.setChassi("1236789");
        kawasaki.ligar();
    }
}
