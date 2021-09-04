class Sync {
    static Counter counter = new Counter();
    public static void main(String[] args) {
        var threads = new MyThread[1000];
        for (int i = 0; i < 1000; ++i) {
            threads[i] = new MyThread();
            threads[i].start();
        }

        for (int i = 0; i < 1000; ++i) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println(Sync.counter.count);
    }
}

class MyThread extends Thread {
    public void run() {
        Sync.counter.countUp();
    }
}

class Grobal {
    static Object lock = new Object();
}

class Counter {
    int count;
    Counter() { count = 0; }
    void countUp() {
        synchronized (Grobal.lock) {
            System.out.print("[");
            int n = count;
            System.out.print(".");
            count = n + 1;
            System.out.print("]");
        }
    }
}