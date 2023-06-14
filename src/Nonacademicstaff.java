import javax.security.auth.Subject;

public class Nonacademicstaff extends School{

    public Integer rating;

    public Nonacademicstaff(String staff, String name, int age, String sex, String address, String Subjects) {
        super(staff, name, age, sex, address, Subjects);
        this.rating = rating;
    }
    //override

    public String toString(){
        return ("position of the nonacademicstaff " + this.getStaff() +
                ", name is : " + this.getName() +
                ", age is : " + this.getAge() +
                ", sex : " + this.getSex() +
                ", address is " + this.getAddress());
    }
    public static void String(String[] args){
        Nonacademicstaff Francis = new Nonacademicstaff("non teaching staff", "Francis",36, "male", "Awolowo Road Nigeria");
        System.out.println(Francis.getName());
        System.out.println(Francis.getAge());
        System.out.println(Francis.getSex());
        System.out.println(Francis.getAddress());
    }


}
