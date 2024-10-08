package P2;

public class Exercicio2 {
    public static void main(String[] args) {
        Concatenador concatenador = new Concatenador();
        concatenador.concatenar("Hello ","World");
        concatenador.concatenar("Hello ","World","!");
    }
}

class Concatenador{
    public void concatenar(String txt1,String txt2){
        System.out.println(txt1 + txt2);
    }
    public void concatenar(String txt1,String txt2, String txt3){
        System.out.println(txt1 + txt2 + txt3);
    }
}
