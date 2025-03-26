package ex4;

//Faça um programa que crie uma lista (ArrayList) e manipule ela com as seguintes threads:

//Duas threads incluindo valores aleatórios na lista.
//Uma thread removendo o primeiro valor da lista.
//Uma thread imprimindo a cada segundo os valores existentes.

import java.util.Random;

public class Exercicio {

    public static void main(String[] args) {

        int[] lista = new int[10];
        Random r = new Random();
        for (int i = 0; i <= lista.length; i++) {
            lista[i] = r.nextInt(100);
            System.out.println(lista[i]);
        }

        Thread[] threads = new Thread[2];
        
    }
    

}
