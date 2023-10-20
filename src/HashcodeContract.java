public class HashcodeContract {
    public static void main(String[] args) {
        firstContract();
        secondContract();
        thirdContract();
    }

    private static void firstContract() {
//        1 and more times use hashcode() on one object and  an object don't change
        Object obj = new Object();
        Integer a = obj.hashCode();
        Integer b = obj.hashCode();
        System.out.println("1 time " + "\t" + obj.hashCode());
        System.out.println("2 times " + "\t" + obj.hashCode());
        System.out.println(a.equals(b) + System.lineSeparator());
    }

    private static void secondContract() {
//        object.hashcode() equals other object.hashcode() => true
        Object obj_1 = new Object();
        Object obj_2 = obj_1;
        Integer a = obj_1.hashCode();
        Integer b = obj_2.hashCode();
        System.out.println("obj_1.hashCode() => " + "\t" + obj_1.hashCode());
        System.out.println("obj_2.hashCode() => " + "\t" + obj_2.hashCode());
        System.out.println("object_1.hashcode() == object_2.hashcode() => true " + "\t" + a.equals(b) + System.lineSeparator());
    }

    private static void thirdContract() {
//        object.hashcode() not equals other object.hashcode() => false
        Object obj_1 = new Object();
        Object obj_2 = new Object();
        System.out.println("obj_1.hashCode() => " + "\t" + obj_1.hashCode());
        System.out.println("obj_2.hashCode() => " + "\t" + obj_2.hashCode());
        System.out.println("object_1.hashcode() != object_2.hashcode() => false " + "\t" + obj_1.equals(obj_2));
    }
}