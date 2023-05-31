import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsScraperRegex {
    public static void main(String[] args) {
        String url = "https://dantri.com.vn/the-gioi.htm";
        String html = getHtmlFromUrl(url);

        Pattern pattern = Pattern.compile("<div class=\"news-item\">.*?<h3 class=\"news-item__title\">.*?<a href=\"(.*?)\".*?>(.*?)</a>", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(html);

        while (matcher.find()) {
            String link = matcher.group(1);
            String title = matcher.group(2);
            System.out.println("Title: " + title);
            System.out.println("Link: " + link);
            System.out.println();
        }
    }

    public static String getHtmlFromUrl(String url) {
        StringBuilder sb = new StringBuilder();

        try {
            URL u = new URL(url);
            BufferedReader in = new BufferedReader(new InputStreamReader(u.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}