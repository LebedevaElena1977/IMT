public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 65; // Вес, кг
        double height = 1.65; // Рост, м
        double index = service.calculate(weight, height);

        System.out.println("Индекс массы тела: " + index);
    }
}
