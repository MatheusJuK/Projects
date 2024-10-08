package P2;

public class Exercicio4 {
    public static void main(String[] args) {
        Volume volume = new Volume();
        volume.CalcularVolume(7.5);
        volume.CalcularVolume(7.5,9.2,10.5);
        volume.CalcularVolume(5,8.5);
    }
}
class Volume{
    public void CalcularVolume(double lado){
        System.out.println(lado * lado * lado);
    }
    public void CalcularVolume(double comprimento,double largura,double altura){
        System.out.println(comprimento * largura * altura);
    }
    public void CalcularVolume(double raio,double altura){
        System.out.println(Math.PI * raio * raio * altura);
    }
}