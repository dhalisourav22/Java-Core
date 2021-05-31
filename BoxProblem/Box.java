package BoxProblem;

public class Box {

    double height, depth, width;

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void display() {
        double vol = height * width * depth;
        System.out.println("voloum is : " + vol);
    }

    public static void main(String[] args) {
        Box b = new Box(10, 20, 30);
        b.display();
    }
}
