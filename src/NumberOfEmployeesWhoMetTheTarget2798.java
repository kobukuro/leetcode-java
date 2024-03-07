public class NumberOfEmployeesWhoMetTheTarget2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for (int hour : hours) {
            if (hour >= target) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] hours = {0, 1, 2, 3, 4};
        int target = 2;
        assert 3 == new NumberOfEmployeesWhoMetTheTarget2798().numberOfEmployeesWhoMetTarget(hours, target);
    }
}
