public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();
    double heightMeters = 1.75;
    int weightKg = 78;
    double bmiIndex = service.calculate(weightKg, heightMeters);

    System.out.println("Индекс массы тела: " + bmiIndex);

}
}
