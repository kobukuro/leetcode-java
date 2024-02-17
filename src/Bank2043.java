public class Bank2043 {
    private long[] balance;

    public Bank2043(long[] balance) {
        this.balance = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (this.balance.length < account1 || this.balance.length < account2) {
            return false;
        }
        if (this.balance[account1 - 1] < money) {
            return false;
        }
        this.balance[account1 - 1] -= money;
        this.balance[account2 - 1] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (this.balance.length < account) {
            return false;
        }
        this.balance[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (this.balance.length < account) {
            return false;
        }
        if (this.balance[account - 1] < money) {
            return false;
        }
        this.balance[account - 1] -= money;
        return true;
    }
}
