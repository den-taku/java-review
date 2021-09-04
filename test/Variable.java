class Variable {
    public static final double PI = 3.14159263538979323846;

    public static void main(String[] args) {
        System.out.println(Variable.PI);

        int[] xx = new int[3];
        xx[0] = 100;
        xx[1] = 200;
        xx[2] = 300;
        System.out.println(xx);

        int[] yy = { 100, 200, 300 };
        System.out.println(yy);

        // yy[3] = 100;

        ClassA[] aa = new ClassA[3];
        aa[0] = new ClassA();
        aa[1] = new ClassA();
        aa[2] = new ClassA();
        System.out.println(aa[0]);
    }
}

class ClassA {
    //
}