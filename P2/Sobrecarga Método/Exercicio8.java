package P2;



public class Exercicio8 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.calcularSalario(8,50);
        funcionario.calcularSalario(8,50,100);
        funcionario.calcularSalario(8,50,100,0.1);
    }
}
class Funcionario{
    public void calcularSalario(double horas, double valorphr){
        System.out.println(horas * valorphr);
    }
    public void calcularSalario(double horas, double valorphr,int bonus){
        System.out.println(horas * valorphr + bonus);
    }
    public void calcularSalario(double horas, double valorphr,int bonus,double comissaopercent){
        System.out.println((horas * valorphr + bonus) +(horas * valorphr + bonus)*comissaopercent);
    }
}
