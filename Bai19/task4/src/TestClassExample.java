public class TestClassExample {
    public static final String[] vildClass = new String[] {"C0323H1", "C0423H44"};
    public static final String[] invalidClass = new String[] {"M0318G76", "P0323A3"};

    public static void main(String[] args) {
        ClassExample classExample = new ClassExample();
        for (String class1 : vildClass) {
            boolean isvalid = classExample.validate(class1);
            System.out.println("Class is " + class1 + " is valid " + isvalid);
        }
        for (String class2 : invalidClass) {
            boolean isvalid = classExample.validate(class2);
            System.out.println("Class is " + class2 + " is valid " + isvalid);
        }
    }
}
