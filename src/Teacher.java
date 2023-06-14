public class Teacher extends School{


    public Integer rating;
    public Teacher(String staff, String name, int age, String sex, String address, String Subjects){
        super(staff, name, age, sex, address, Subjects);
        this.rating = rating;

    }
    public static void String(String[] args){
        Teacher Andrew = new Teacher("teacher", "Andrew",37, "male", "Awolowo Road Nigeria","English");
        System.out.println(Andrew.getName());
        System.out.println(Andrew.getAge());
        System.out.println(Andrew.getSex());
        System.out.println(Andrew.getAddress());












}
