package P2.Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Notificacao sms = new SMS();
        Notificacao email = new Email();
        Notificacao push = new Push();

        ArrayList<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(sms);
        notificacoes.add(email);
        notificacoes.add(push);

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviarMensagem("Olá, mundo!");
        }

        input.nextLine();
        System.out.println("Pressione ENTER para sair...");
        input.close();
    }

    interface Notificacao {
        void enviarMensagem(String mensagem);
    }

    static class SMS implements Notificacao {
        Scanner input = new Scanner(System.in);

        @Override
        public void enviarMensagem(String mensagem) {
            System.out.println("Insura o número de telefone: ");
            String numero = input.nextLine();

            System.out.printf("Enviando SMS para: %s - %s\n", numero, mensagem);
        }

    }

    static class Email implements Notificacao {
        Scanner input = new Scanner(System.in);

        @Override
        public void enviarMensagem(String mensagem) {
            System.out.println("Insira o email do destinatário: ");
            String email = input.nextLine();
            System.out.printf("Enviando email para: %s - %s\n", email, mensagem);
        }
    }

    static class Push implements Notificacao {
        Scanner input = new Scanner(System.in);

        @Override
        public void enviarMensagem(String mensagem) {
            System.out.println("Insira o token do dispositivo: ");
            String token = input.nextLine();
            System.out.printf("Enviando push para: %s - %s\n", token, mensagem);
        }
    }
}