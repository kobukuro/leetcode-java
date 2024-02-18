import java.util.ArrayList;
import java.util.List;

public class BrowserHistory1472 {
    private List<String> historyStamps;
    private int currentStep;

    public BrowserHistory1472(String homepage) {
        this.historyStamps = new ArrayList<>();
        this.historyStamps.add(homepage);
        this.currentStep = 0;
    }

    public void visit(String url) {
        this.historyStamps.subList(this.currentStep + 1, this.historyStamps.size()).clear();
        this.historyStamps.add(url);
        this.currentStep++;
    }

    public String back(int steps) {
        int stepsToTake = Math.min(steps, this.currentStep);
        this.currentStep -= stepsToTake;
        return this.historyStamps.get(this.currentStep);
    }

    public String forward(int steps) {
        int stepsToTake = Math.min(steps, this.historyStamps.size() - 1 - this.currentStep);
        this.currentStep += stepsToTake;
        return this.historyStamps.get(this.currentStep);
    }
}
