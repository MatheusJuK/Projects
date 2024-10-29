package P2.Interface;
import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(10));
        formas.add(new Retangulo(10, 3));
        formas.add(new Triangulo(5, 10));

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
            forma.desenhar();
        }

    }


    interface Forma {
        double calcularArea();

        void desenhar();
    }

    static class Circulo implements Forma {
        private double raio;

        public Circulo(double raio) {
            this.raio = raio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * Math.pow(raio, 2);
        }

        @Override
        public void desenhar() {
            System.out.println("Desenhando um círculo");
        }
    }

    static class Retangulo implements Forma {
        private double largura;
        private double altura;

        public Retangulo(double largura, double altura) {
            this.largura = largura;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return largura * altura;
        }

        @Override
        public void desenhar() {
            System.out.println("Desenhando um Retângulo \n");

            for (int i = 0; i < altura; i++) {
                if (i != 0 && i != altura - 1) {
                    System.out.print("*");
                    for (int j = 0; j < largura - 2; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                } else {
                    for (int j = 0; j < largura; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
    static class Triangulo implements Forma {
        private double base;
        private double altura;

        public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return (base * altura) / 2;
        }

        @Override
        public void desenhar() {
            System.out.println("Desenhando um triângulo");
        }
    }
}