package P2.Sobrecarga;

public class Exercicio5 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.exibirInfo("Milho");
        produto.exibirInfo("Arroz",25.80);
    }
}
class Produto{
    public void exibirInfo(String nome){
        System.out.println(nome);
    }
    public void exibirInfo(String nome,double preco){
        System.out.println(nome);
        System.out.println(preco);
    }
}