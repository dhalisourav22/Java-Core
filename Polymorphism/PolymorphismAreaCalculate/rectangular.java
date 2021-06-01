package PolymorphismAreaCalculate;

public class rectangular extends shape {

    double x_axcis, y_axcis;

    public rectangular(double x_axcis, double y_axcis) {
        this.x_axcis = x_axcis;
        this.y_axcis = y_axcis;
    }

    @Override
    double area() {
        return x_axcis*y_axcis;
    }
}
