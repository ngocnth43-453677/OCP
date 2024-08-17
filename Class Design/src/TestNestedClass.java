public class TestNestedClass {
    public static void main(String args[]) {
        Outer out = new Outer();
        System.out.println(out.getInner().getOi());
        System.out.println(Outer.Inner.getOi());
        new Outer.Inner();
    }
}

class Outer {
    private int oi = 20;

    static class Inner {
        private static int oi = 30;
        static int getOi() {
            return oi;
        }
    }



    Inner getInner() {
        return new Inner();
    }
}
