public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 70.0f;
        float hight = 2.0f;
        float index = service.calculate(weight, hight);
        System.out.println(index);
    }
}
