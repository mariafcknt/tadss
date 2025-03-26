import java.util.Date;

public class Exercicio implements Runnable {

    @Override
    public void run() {
        Date date = new Date();
        System.out.printf("%s || %2$tH:%2$tM:%2$tS \n", Thread.currentThread().getName(), date);
    }

    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            Exercicio e = new Exercicio();
            Thread t = new Thread(e);
            t.start();
        }
    }
}