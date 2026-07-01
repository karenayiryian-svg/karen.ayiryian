package practice14;

public class MultithreadingDemo {
    public static void main(String[] args) {
        Thread numberThread = new Thread(new NumberTask(), "NumberThread");
        Thread letterThread = new Thread(new LetterTask(), "LetterThread");

        numberThread.start();
        letterThread.start();

        try {
            numberThread.join();
            letterThread.join();
        } catch (InterruptedException e) {
            System.out.println("Основной поток был прерван.");
            Thread.currentThread().interrupt();
        }

        System.out.println("Обе задачи завершены.");
    }
}

class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Число: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Поток чисел был прерван.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

class LetterTask implements Runnable {
    @Override
    public void run() {
        for (char letter = 'A'; letter <= 'E'; letter++) {
            System.out.println("Буква: " + letter);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Поток букв был прерван.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
