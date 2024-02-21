public class CheckIfAllAsAppearsBeforeAllBs2124 {
    public boolean checkString(String s) {
        boolean isBappear = false;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == 'b') {
                isBappear = true;
            } else {
                if (isBappear) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aaabbb";
        // true
        System.out.println(new CheckIfAllAsAppearsBeforeAllBs2124().checkString(s));
    }
}
