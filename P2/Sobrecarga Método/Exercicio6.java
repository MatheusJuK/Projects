package P2;

public class Exercicio6 {
    public static void main(String[] args) {
        Desconto desconto = new Desconto();
        desconto.calcularDesconto(100);
        desconto.calcularDesconto(100,0.5);
        desconto.calcularDesconto(100,0.5,20);
    }
}
class Desconto{
    double taxaFixa = 0.1;
    public void calcularDesconto(double valorTotal){
        System.out.println((1 - taxaFixa) * valorTotal);
    }
    public void calcularDesconto(double valorTotal,double taxa){
        System.out.println((1 - taxa) * valorTotal);
    }
    public void calcularDesconto(double valorTotal,double taxa,double extra){
        System.out.println(((1 - taxa) * valorTotal) - extra);
    }
}