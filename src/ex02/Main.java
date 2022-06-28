package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Promissorias p1 = new Promissorias();
        System.out.println("Digite o prazo do titulo: ");
        p1.setPrazo(sc.nextInt());
        System.out.println("Digite o valor a ser recebido");
        p1.calcularValorRecebido(sc.nextInt());

        Cheques c1 = new Cheques();
        System.out.println("Digite o prazo do titulo: ");
        c1.setPrazo(sc.nextInt());
        System.out.println("Digite o valor a ser recebido");
        c1.calcularValorRecebido(sc.nextInt());

        TitulosDoGoverno t1 = new TitulosDoGoverno();
        System.out.println("Digite o prazo do titulo: ");
        t1.setPrazo(sc.nextInt());
        System.out.println("Digite o valor a ser recebido");
        t1.calcularValorRecebido(sc.nextInt());



    }
}
