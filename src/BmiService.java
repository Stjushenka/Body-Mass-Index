public class BmiService {

    public float calculate(float weight, float hight) {
        float index;
        index = weight / (hight * hight);
        return index;
    }
}
