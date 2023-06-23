// String, Two Pointers
public class ValidPalindrome125 {
    /*
        Time complexity : O(n), in length n of the string.
        We need to iterate thrice through the string:
        When we filter out non-alphanumeric characters, and convert the remaining characters to lower-case.
        When we reverse the string.
        When we compare the original and the reversed strings.
        Each iteration runs linear in time
        (since each character operation completes in constant time).
        Thus, the effective run-time complexity is linear.

        Space complexity : O(n), in length n of the string.
        We need O(n) additional space to store the filtered string and the reversed string.
     */
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(new ValidPalindrome125().isPalindrome(s)); // true
    }
}
