package P2.Sobrecarga;

public class Exercicio1 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(2,8);
        calculadora.somar(2,4,14);
    }
}
class Calculadora{
    public void somar(int a,int b){
        System.out.println(a + b);
    }

    public void somar(int a,int b,int c){
        System.out.println(a + b + c);
    }
}