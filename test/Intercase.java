
class Intercase implements InterfaceA {
    public static void main(String[] args) {
        Intercase o = new Intercase();
        o.methodA("ABC");
        o.methodB(123);
    }

    public void methodA(String msg) {
        System.out.println(msg);
    }

    public void methodB(int x) {
        System.out.println(x);
    }
}

interface InterfaceA {
    public abstract void methodA(String msg);
    public abstract void methodB(int x);
}
