public class EqualsContract {
    public static void main(String[] args) {
        reflexivity();
        symmetric();
        transitive();
        consistent();
        nonNull();
    }

    private static void reflexivity() {
//        a.equals(a) == true
        Integer a = 5;
        System.out.println("reflexivity: 'a.equals(a) == true' =>" + a.equals(5) + System.lineSeparator());
    }

    private static void symmetric() {
//        a.equals(b) & b.equals(a)
        Integer a = 5;
        Integer b = 5;
        System.out.println("symmetric: 'a.equals(b) & b.equals(a)' =>" + a.equals(b) + "\t" + b.equals(a) + System.lineSeparator());
    }

    private static void transitive() {
//        a.equals(b) & b.equals(c) => a.equals(c)
        Integer a = 5;
        Integer b = 5;
        Integer c = 5;
        System.out.println("transitive: 'a.equals(b) & b.equals(c) => a.equals(c)' =>" + a.equals(b) + "\t" + b.equals(c) + "\t" + System.lineSeparator());
    }

    private static void consistent() {
//        a.equals(b) => make some operation with a & b => a.equals(b)
        Integer a = 5;
        Integer b = 5;
        System.out.println("before =>" + a.equals(b));
        int c = a + b;
        System.out.println("after =>" + a.equals(b) + System.lineSeparator());
    }

    private static void nonNull() {
//       a.equals(null) == null
        Integer a = 5;
        System.out.println("non null: 'a.equals(null) == null' =>" + a.equals(null) + System.lineSeparator());
    }
}