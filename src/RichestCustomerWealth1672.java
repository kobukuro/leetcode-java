public class RichestCustomerWealth1672 {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int r = 0; r < accounts.length; r++) {
            int personWealth = 0;
            for (int c = 0; c < accounts[0].length; c++) {
                personWealth += accounts[r][c];
            }
            res = Math.max(res, personWealth);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(new RichestCustomerWealth1672().maximumWealth(accounts)); // 6
    }
}
