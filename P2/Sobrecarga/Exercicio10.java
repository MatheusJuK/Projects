package P2.Sobrecarga;

public class Exercicio10 {
    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria();
        conta.depositar(1000);
        conta.depositar(1000,0.1);
        conta.depositar(1000,0.1,0.5);
    }
}
class contaBancaria{
    double saldo = 10000;
    public void depositar(double valor){
        System.out.println(valor + " foi depositado com sucesso");
        saldo -= valor;
    }
    public void depositar(double valor, double taxa){
        System.out.println(valor - valor*taxa +" foi depositado com sucesso");
        saldo -= valor - valor*taxa;
    }
    public void depositar(double valor,double taxa,double bonificação){
        System.out.println((valor - valor*taxa) + (valor - valor*taxa)*bonificação +" foi depositado com sucesso");
        saldo -= (valor - valor*taxa)*bonificação;
    }
}
