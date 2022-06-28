package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Trabalhador trabalhador1 = new Trabalhador("João", 7.6, 120);
        Trabalhador trabalhador2 = new Trabalhador("Pedro", 10.7, 180);
        Trabalhador trabalhador3 = new Trabalhador("Marcia", 5.5, 136);
        Trabalhador trabalhador4 = new Trabalhador("Danilo", 8.2, 140);
        Trabalhador trabalhador5 = new Trabalhador("Mariana", 9.6, 155);



        System.out.println(trabalhador1.getSalarioTotal());
        System.out.println(trabalhador2.getSalarioTotal());
        System.out.println(trabalhador3.getSalarioTotal());
        System.out.println(trabalhador4.getSalarioTotal());
        System.out.println(trabalhador5.getSalarioTotal());


    }
}
