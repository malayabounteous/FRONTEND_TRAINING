package Day3Assignment;

import java.util.regex.*;

public class HtmlLink {
    public static void main(String[] args) {
        
        String html= "<a href=\"https://example.com\">Link</a>\n" +
                      "<a class=\"btn\" href=\"http://google.com\">Google</a>\n" +
                      "<a href=\"https://openai.com\">OpenAI</a>";

        String regex="<a\\s+[^>]*href=\"([^\"]*)\"";
        Pattern pattern=Pattern.compile(regex);

        Matcher matcher=pattern.matcher(html);
        while(matcher.find())
        {
            System.out.println(matcher.group(1));
        }
    }
}
