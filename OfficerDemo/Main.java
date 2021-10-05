package OfficerDemo;

public class Main {
    public static void main(String[] args) {
        String name;
        double sallary1, sallary2, sallary3, sumOfSallary, averageOfSallary;
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter The Total Number Of Officer : ");
        int totalNumberOfOfficer = input.nextInt();

        Officer[] k = new Officer[totalNumberOfOfficer];
        for (int i = 0; i < totalNumberOfOfficer; i++) {
            k[i] = new Officer();
            System.out.print("\nEnter " + (i + 1) + " Person Name : ");
            name = input.next();
            k[i].setName(name);
            System.out.print("Enter " + (i + 1) + " Person 1st Month Sallary : ");
            sallary1 = input.nextDouble();
            k[i].setSallary1(sallary1);
            System.out.print("Enter " + (i + 1) + " Person 2nd Month Sallary : ");
            sallary2 = input.nextDouble();
            k[i].setSallary2(sallary2);
            System.out.print("Enter " + (i + 1) + " Person 3rd Month Sallary : ");
            sallary3 = input.nextDouble();
            k[i].setSallary3(sallary3);
            sumOfSallary = sallary1 + sallary2 + sallary3;
            k[i].setSumOfSallary(sumOfSallary);
            averageOfSallary = sumOfSallary / 3;
            k[i].setAverageOfSallary(averageOfSallary);
        }

//        for (int i = 0; i < totalNumberOfOfficer; i++) {
//            System.out.print("\nEnter " + (i + 1) + " Person Name : ");
//            name = input.next();            
//            System.out.print("Enter " + (i + 1) + " Person 1st Month Sallary : ");
//            sallary1 = input.nextDouble();            
//            System.out.print("Enter " + (i + 1) + " Person 2nd Month Sallary : ");
//            sallary2 = input.nextDouble();            
//            System.out.print("Enter " + (i + 1) + " Person 3rd Month Sallary : ");
//            sallary3 = input.nextDouble();            
//            sumOfSallary = sallary1 + sallary2 + sallary3;            
//            averageOfSallary = sumOfSallary / 3;            
//            k[i] = new Officer (name,sallary1, sallary2, sallary3, sumOfSallary, averageOfSallary);
//        }
        
        for (int i = 0; i < totalNumberOfOfficer; i++) {
            k[i].display();
        }
    }
}
