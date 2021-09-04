class Threads {
    public static void main(String[] args) {
        var rtt = new RunnableTestThread();
        var t = new Thread(rtt);
        t.start();

        var ttt = new ThreadTestThread();
        ttt.start();

        for (int i = 0; i < 1000; ++i) {
            System.out.println('.');
        }
    }
}

class ThreadTestThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; ++i) {
            System.out.println('o');
        }
    }
}

class RunnableTestThread implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; ++i) {
            System.out.println('x');
        }
    }
}