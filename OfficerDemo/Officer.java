package OfficerDemo;

public class Officer {
    private  String name;
    private  double sallary1, sallary2, sallary3, sumOfSallary, averageOfSallary;
    
//    public Officer(String name, double sallary1, double sallary2, double sallary3, double sumOfSallary, double averageOfSallary) {
//        this.name = name;
//        this.sallary1 = sallary1;
//        this.sallary2 = sallary2;
//        this.sallary3 = sallary3;
//        this.sumOfSallary = sumOfSallary;
//        this.averageOfSallary = averageOfSallary;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSallary1(double sallary1) {
        this.sallary1 = sallary1;
    }

    public void setSallary2(double sallary2) {
        this.sallary2 = sallary2;
    }

    public void setSallary3(double sallary3) {
        this.sallary3 = sallary3;
    }

    public void setSumOfSallary(double sumOfSallary) {
        this.sumOfSallary = sumOfSallary;
    }

    public void setAverageOfSallary(double averageOfSallary) {
        this.averageOfSallary = averageOfSallary;
    }
    
    void display(){
        System.out.println("\nName is : "+this.name);
        System.out.println("Total Sallary : "+this.sumOfSallary);
        System.out.println("Average Sallary : "+this.averageOfSallary);        
    }    
}
