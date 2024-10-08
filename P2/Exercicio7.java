package P2;

public class Exercicio7 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.calcularTotal(100,5);
        pedido.calcularTotal(100,5,0.5);
        pedido.calcularTotal(100,5,0.5,25);
    }
}
class Pedido{
    public void calcularTotal(double valor,int quantidade){
        System.out.println(valor * quantidade);
    }
    public void calcularTotal(double valor,int quantidade,double desconto){
        System.out.println(valor * quantidade * (1 - desconto));
    }
    public void calcularTotal(double valor,int quantidade,double desconto,double imposto){
        System.out.println((valor * quantidade * (1 - desconto)) + imposto);
    }
}