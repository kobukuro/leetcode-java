import java.util.ArrayList;
import java.util.List;

public class CustomStack1381 {
    private List<Integer> stack;
    private int maxSize;

    public CustomStack1381(int maxSize) {
        this.stack = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (this.stack.size() < this.maxSize) {
            this.stack.add(x);
        }
    }

    public int pop() {
        if (!this.stack.isEmpty()) {
            return this.stack.remove(this.stack.size() - 1);
        }
        return -1;
    }

    public void increment(int k, int val) {
        int end = Math.min(this.stack.size(), k);
        for (int i = 0; i < end; i++) {
            this.stack.set(i, this.stack.get(i) + val);
        }
    }
}
