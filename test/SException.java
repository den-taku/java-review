import java.io.*;

class SException {
    public static void main(String[] args) {
        try {
            var in = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("final");
        }

        System.out.println("(1)");
        try {
            System.out.println("(2)");
            FileReader in = new FileReader("data.txt");
            System.out.println("(3)");
        } catch (FileNotFoundException e) {
            System.out.println("(4)");
        } finally {
            System.out.println("(5)");
        }
        System.out.println("(6)");

        try {
            methodA();
        } catch (MyException e) {
            System.out.println(e);
        }
    }

    static void methodA() throws MyException {
        var e = new MyException("Error happened!");
        throw e;
    }
}

class MyException extends Exception {
    String errMsg;
    MyException(String msg) {
        super(msg);
        errMsg = msg;
    }
}