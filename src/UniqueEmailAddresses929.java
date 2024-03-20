import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailsReceived = new HashSet<>();
        int res = 0;
        for (String email : emails) {
            String[] parts = email.split("@");
            parts[0] = parts[0].replace(".", "");
            parts[0] = parts[0].split("\\+")[0];
            String emailRes = parts[0] + "@" + parts[1];
            if (!emailsReceived.contains(emailRes)) {
                emailsReceived.add(emailRes);
                res++;
            }
        }
        return res;
    }
}
