package P2.Array;

import java.util.ArrayList;
public class Exercicio7 {
    public static void main(String[] args) {
        ArrayList<Contato> Agenda = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Joao","123456789","Joaozin");
        Empresa empresa1 = new Empresa("Twitter","987654321","twitter@twitter.com");

        Agenda.add(pessoa1);
        Agenda.add(empresa1);
        for (int i = 0; i < Agenda.size(); i++) {
            Agenda.get(i).exibirInformacoes();
        }
    }
}

class Contato{
    private String nome;
    private String numero;

    public String getNome(){
        return nome;
    }
    public String getNumero(){
        return numero;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Numero: " + getNumero());
    }

    public Contato(String nome,String numero){
        this.nome = nome;
        this.numero = numero;
    }
}
class Pessoa extends Contato{
    private String Linkedin;

    public Pessoa(String nome,String numero,String Linkedin){
        super(nome,numero);
        this.Linkedin = Linkedin;
    }
    public String getLinkedin(){
        return Linkedin;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Numero: " + getNumero());
        System.out.println("LinkedIn: " + getLinkedin());
    }
}
class Empresa extends Contato{
    private String Email;

    public Empresa(String nome,String numero,String Email){
        super(nome,numero);
        this.Email = Email;
    }
    public String getEmail(){
        return Email;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Numero: " + getNumero());
        System.out.println("E-mail: " + getEmail());
    }
}