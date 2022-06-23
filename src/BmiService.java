public class BmiService {

    public int calculate(double cost) {
        double growth = 1.58;

        double imt = cost / (growth * growth);
        return (int) imt;

    }

}
