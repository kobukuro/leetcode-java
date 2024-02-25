public class DefangingAnIPAddress1108 {
    public String defangIPaddr(String address) {
        char[] chars = address.toCharArray();
        String res = "";
        for (char c : chars) {
            if (c == '.') {
                res += "[.]";
            } else {
                res += c;
            }
        }
        return res;
    }
}
