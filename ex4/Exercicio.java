package ex4;

//Faça um programa que crie uma lista (ArrayList) e manipule ela com as seguintes threads:

//Duas threads incluindo valores aleatórios na lista.
//Uma thread removendo o primeiro valor da lista.
//Uma thread imprimindo a cada segundo os valores existentes.

import java.util.Random;

public class Exercicio implements Runnable{

    public static void main(String[] args) {

        Thread[] threads = new Thread[2];
        //int numThread = 0;
        for (int i = 0; i < threads.length; i++) {
            if (i == 0) {
                threads[i] = Thread.ofPlatform().start(new Exercicio());

            }

        }
        
    }

    @Override
    public void run() {
        gerarLista();
    }

    public static void gerarLista(){
        System.out.println(Thread.currentThread().getName());
        int[] lista = new int[10];
        Random r = new Random();
        for (int i = 0; i < lista.length; i++) {
            lista[i] = r.nextInt(100);
            System.out.println(lista[i]);
        }
    }


    public static void removerPosicaoLista(int[] listaOriginal){
        int[] listaNova = new int[10];
        for (int i = 0; i < listaOriginal.length; i++ ){
            if (i != 0) {
                listaNova[i] = listaOriginal[i];
                System.out.println(listaNova[i]);
            }
        }

    }
    

}
