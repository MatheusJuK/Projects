package P2.Heranca;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pagavel pagavel = new pagavel(10.0);
        Presente presente = new Presente(20.0);
        if (pagavel instanceof Pagavel) {
            pagavel.pagar();
        }

    }
}

class Item {
    double preco;

    Item(double preco){
        this.preco = preco;
    }

}
class pagavel extends Item implements Pagavel{
    pagavel(double preco){
        super(preco);
    }
    @Override
    public void pagar(){
        System.out.println("Pagando item de preço: " + preco);
    }
}
class Presente extends Item{
    Presente(double preco){
        super(preco);
    }

}
interface Pagavel {
    public void pagar();
}