package javajava;

class PkgTest1 {
    public static void main(String[] args) {
        var o2 = new javajava.pkgA.PkgTest2();
        var o3 = new javajava.pkgA.pkgB.PkgTest3();
        o2.test();
        o3.test();
    }
}