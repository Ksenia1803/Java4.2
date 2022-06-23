public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double growth = 1.58;
        double weight = 41.5;
        double imt = service.calculate(weight, growth);
        System.out.println(" Индекс массы тела = " + imt);
    }

}
