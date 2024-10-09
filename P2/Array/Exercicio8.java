package P2.Array;

import java.util.ArrayList;
public class Exercicio8 {
    public static void main(String[] args) {
        ArrayList<Animal> Animais = new ArrayList<>();
        Cachorro cachorro = new Cachorro("Scooby");
        Gato gato = new Gato("Garfield");

        Animais.add(cachorro);
        Animais.add(gato);
        for (int i = 0; i < Animais.size(); i++) {
            Animais.get(i).fazerSom();
        }
    }
}
class Animal {
    String nome;

    public void fazerSom(){
        System.out.println(nome + " esta produzindo sons!");
    }
}
class Cachorro extends Animal{
    @Override
    public void fazerSom(){
        System.out.println(nome + " esta latindo!");
    }
    public Cachorro(String nome){
        this.nome = nome;
    }
}
class Gato extends Animal{
    @Override
    public void fazerSom(){
        System.out.println(nome + " esta miando!");
    }
    public Gato(String nome){
        this.nome = nome;
    }
}
