package P2.Array;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] idades = {15,22,18,25,30};
        Scanner input = new Scanner(System.in);
        System.out.print("Insira uma idade para conferir se ele esta no array: ");
        int numero = input.nextInt();
        input.nextLine();
        for (int i = 0; i < idades.length;i++){
            if (idades[i] == numero){
                System.out.println(idades[i]);
                System.out.println("Está no indice " + i);
            }
        }
    }
}
