public class Modifier4 extends Modifier {
    public static void main(String[] args) {
        Modifier4 o = new Modifier4();
        System.out.println(o.norValue);

        Modifier5 o2 = new Modifier5();
    }

    Modifier4() {
        this.pubValue = 1;
        this.proValue = 2;
        this.norValue = 3;
        // this.priValue = 4;
    }
}

class Modifier5 {
    Modifier5() {
        Modifier o = new Modifier();
        o.pubValue = 1;
        o.proValue = 2;
        o.norValue = 3;
        // o.priValue = 4;
        System.out.println(o.norValue);
    }
}