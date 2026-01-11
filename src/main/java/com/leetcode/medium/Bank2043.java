// Tags: Array, Design
package com.leetcode.medium;

public class Bank2043 {
    private final long[] accounts;

    public Bank2043(long[] balance) {
        accounts = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 > accounts.length || account2 > accounts.length) {
            return false;
        }
        if (accounts[account1 - 1] < money) {
            return false;
        }
        accounts[account1 - 1] -= money;
        accounts[account2 - 1] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (account > accounts.length) {
            return false;
        }
        accounts[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account > accounts.length) {
            return false;
        }
        if (accounts[account - 1] < money) {
            return false;
        }
        accounts[account - 1] -= money;
        return true;
    }
}
