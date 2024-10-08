package P2.Array;

public class Exercicio2 {
    public static void main(String[] args) {
        String[] frutas = {"maçã","banana","laranja","uva"};
        for (int i = 0; i < frutas.length;i++){
            if (i % 2 != 0){
                System.out.println(frutas[i]);
            }
        }
    }
}
