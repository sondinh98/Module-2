import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static Pattern pattern;
    private static final String PHONE_REGEX = "^\\([0-9]{2}\\)-\\([0][0-9]{9}\\)$";
    public PhoneExample() {
        pattern = Pattern.compile(PHONE_REGEX);
    }
    public boolean valiphone (String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
