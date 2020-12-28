import java.util.concurrent.atomic.AtomicInteger;

public class CASTest implements Runnable {
    int current = 0;
    int next = 0;
    AtomicInteger ai = new AtomicInteger(0);

    public static void main(String[] args) {
        CASTest casTest = new CASTest();
        for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(casTest);
            Thread t2 = new Thread(casTest);
            t1.start();
            t2.start();
        }


    }

    @Override
    public void run() {
        do {
            current = ai.get();
            next = current >= 214700000 ? 0 : current + 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("current:" + current + "/t" + "next" + next);
        }
        while (!ai.compareAndSet(current, next));
        System.out.println("成功");
    }
}
