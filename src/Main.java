public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 41;
        double imt = service.calculate(weight);
        System.out.println(imt);
    }

}
