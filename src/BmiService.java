public class BmiService {
    public float weight;
    public float hight;
        public float calculate( float weight, float hight) {
        this.weight = weight;
        this.hight = hight;
        float index;
        index = weight / (hight * hight);
        return index;
    }
}
