package EmployeeDetails;

public class Employee implements Comparable<Employee>{
    //Variable Which We Need.
    private String name, id, address, depertment_name, birthday;
    private int depertment_id, gread;
    private double salary;

       
    //All Seter Geter.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepertment_name() {
        return depertment_name;
    }

    public void setDepertment_name(String depertment_name) {
        this.depertment_name = depertment_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getDepertment_id() {
        return depertment_id;
    }

    public void setDepertment_id(int depertment_id) {
        this.depertment_id = depertment_id;
    }

    public int getGread() {
        return gread;
    }

    public void setGread(int gread) {
        this.gread = gread;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void display(){
        System.out.println("\tID : "+this.getId());
        System.out.println("\tName : "+this.getName());
        System.out.println("\tDepertment ID : "+this.getDepertment_id());
        System.out.println("\tDepertment Name : "+this.getDepertment_name());
        System.out.println("\tAdress : "+this.getAddress());
        System.out.println("\tSallary : "+this.getSalary());
        System.out.println("\tGread : "+this.getGread());
        System.out.println("\tBirthday : "+this.getBirthday());
    }    

    //For Grouping By Depertment.
    @Override
    public int compareTo(Employee t) {
        if(this.getDepertment_id() < t.getDepertment_id()){
            return -1;
        }
        else{
            return 1;
        }
    }
}
