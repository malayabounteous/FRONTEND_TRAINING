package Day3Assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogExtractor {
    public static void main(String[] args) {
        
        String[] logs = {
            "[2023-10-27 14:32:01] [ERROR] User login failed for IP: 192.168.0.155 - Timeout",
            "[2023-10-27 14:33:10] [INFO] User login success for IP: 192.168.0.101",
            "[2023-10-27 14:35:22] [ERROR] Database timeout for IP: 192.168.0.155",
            "[2023-10-27 14:36:45] [WARN] Disk almost full for IP: 192.168.0.200",
            "[2023-10-27 14:40:00] [ERROR] API failure for IP: 10.0.0.1"
        };

        String regex="\\[(.*?)\\]\\s+\\[(INFO|ERROR|WARN)\\].*?IP:\\s+(\\d+\\.\\d+\\.\\d+\\.\\d+)";
        Pattern pattern=Pattern.compile(regex);
        
        for(String log:logs)
        {
            Matcher matcher=pattern.matcher(log);
            if(matcher.find())
            {
                String date=matcher.group(1);
                String err=matcher.group(2);
                String ip=matcher.group(3);

                System.out.println("date :"+date+" error code:"+err+" ip"+ip);
            }
        }
    }
    
}
