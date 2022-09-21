public class Shap {
   private double width;
    private double hight;

    public Shap(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public double getHight() {
        return hight;
    }

    public double getArea(){
        return width*hight;
    }
}
