package P2;

public class Exercicio9 {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        calc.calcular(5);
        calc.calcular(5,10);
        calc.calcular(5.0,2.0);
    }
}
class CalculadoraCientifica{
    public void calcular(int a,int b){
        System.out.println(a + b);
    }
    public void calcular(double a,double b){
        System.out.println(Math.pow(a,b));
    }
    public void calcular(int a){
        int fatorial = a;
        for (int i = a - 1; i > 0;i--){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
    }
}
