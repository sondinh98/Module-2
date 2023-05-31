public class PhoneExampleTest {
    public static final String[] valiPhone = new String[]{"(84)-(0978489648)"};
    public static final String[] invaliPhone = new String[]{" (a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        PhoneExample phoneExample = new PhoneExample();
        for (String phone : valiPhone) {
            boolean isvalid = phoneExample.valiphone(phone);
            System.out.println("Phone is " + phone + " is valid " + isvalid);
        }
        for (String phone : invaliPhone) {
            boolean isvalid = phoneExample.valiphone(phone);
            System.out.println("Phone is " + phone + " is valid " + isvalid);
        }
    }
}
