import java.util.Arrays;

public class ConvertTheTemperature2469 {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.8 + 32};
    }

    public static void main(String[] args) {
        double celsius = 36.50;
        // [309.65, 97.7]
        System.out.println(Arrays.toString(new ConvertTheTemperature2469().convertTemperature(celsius)));
    }
}
