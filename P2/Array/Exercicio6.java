package P2.Array;

public class Exercicio6 {
    public static void main(String[] args) {
        int cont = 0;
        String[] nomes = {"JOAO","MARIA","THIAGO","MATHEUS","SAVIO","ultramicroscopicossilicovulcanoconiótico"};
        for (int i = 0; i < nomes.length;i++){
            if (nomes[i].length() > 5 ){
                cont++;
                System.out.println(nomes[i]);
            }
        }
        System.out.println(cont);
    }
}
