package PolymorphismAreaCalculate;

public class traiangle extends shape {

    double height, base;

    public traiangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        return .5*height*base;
    }
}
