public class Modifier {
    public int pubValue;
    protected int proValue;
    int norValue;
    private int priValue;

    public static void main(String[] args) {
        var x = java.lang.Math.sin(3.0);
        System.out.println(x);

        // AbstractClass a = new AbstractClass();
        ConcreteClass c = new ConcreteClass();
        c.greet();

        IFClass ifc = new IFClass();
        ifc.test();

        Single s = new Single();
        s.sync();
        s.sync2();

        VolatileClass v = new VolatileClass();
        v.count += 1;
        System.out.println(v.count);

        ClassA.print(3.1415926535F * 2.0F);
    }

    public Modifier() {
        this.pubValue = 1;
        this.proValue = 2;
        this.norValue = 3;
        this.priValue = 4;
    }
}

strictfp class ClassA {
    static void print(float v) {
        System.out.println(java.lang.Math.sin(v));
    }
}

class VolatileClass {
    volatile int count;
    VolatileClass() {
        this.count = 0;
    }
}

class NotSirialize {
    transient String tmp;
}

class Single {
    synchronized void sync() {
        System.out.println("Synchronized!");
    }

    void sync2() {
        synchronized (this) {
            System.out.println("Synchronized!2");
        }
    }
}

class NativeClass {
    public native void call(int a);
}

class IFClass implements InterfaceClass {
    public void test() {
        System.out.println("Hay");
    }
}

interface InterfaceClass {
    void test();
}

abstract class AbstractClass {
    abstract void greet();
}

class ConcreteClass extends AbstractClass {
    void greet() {
        System.out.println("HeyHeyHey");
    }
}

class Modifier2 extends Modifier {
    Modifier2() {
        this.pubValue = 1;
        this.proValue = 2;
        this.norValue = 3;
        // this.priValue = 4;
    }
}

class Modifier3 {
    Modifier3() {
        Modifier o = new Modifier();
        o.pubValue = 1;
        o.proValue = 2;
        o.norValue = 3;
        // o.priValue = 4;
    }
}

final class FinalClass {}

// class MoreFinalClass extends FinalClass {}

class FinalMethod {
    final void hey() {
        System.out.println("Hey");
    }
}

// class MoreFinalMethod extends FinalMethod {
//     void hey() {
//         System.out.println("HeyHey");
//     }
// }