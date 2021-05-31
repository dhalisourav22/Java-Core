package InneClass;

public class Test {
    public static void main(String[] args) {
        OuterClass Out = new OuterClass();
        System.out.println("Outer is : "+Out.outerX);
        OuterClass.InnerClass Inn1 = Out.new InnerClass();
        System.out.println("First Inner : "+Inn1.innerX);
        OuterClass.InnerClass.InnerClass2 Inn2 = Inn1.new InnerClass2();
        System.out.println("Second Inner : "+Inn2.innerX2);
    }
}
