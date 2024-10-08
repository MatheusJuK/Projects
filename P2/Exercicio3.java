package P2;

public class Exercicio3 {
    public static void main(String[] args) {
        Calcular calcular = new Calcular();
        calcular.CalcularArea(5.5,1.9);
        calcular.CalcularArea(9.7);
    }
}
class Calcular{
    public void CalcularArea(double base,double altura){
        System.out.println(base * altura);
    }
    public void CalcularArea(double lado){
        System.out.println(lado * lado);
    }
}
