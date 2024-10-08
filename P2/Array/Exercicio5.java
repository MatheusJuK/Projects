package P2.Array;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.sort(Collections.reverseOrder());
        for (int i = 0; i < numeros.size();i++){
            System.out.println(numeros.get(i));
        }
    }
}
