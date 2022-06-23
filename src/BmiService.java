public class BmiService {

    public double calculate(double growth, double weight) {
        double imt = weight / (growth * growth);
        return imt;

    }

}
