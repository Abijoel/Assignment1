public class Student {
    private String name;
    private int age;
    private String sex;
    private String address;
    private String studentcourse;


    public Student(String name, int age, String sex, String address, String studentcourse) {

        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.studentcourse = studentcourse;


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
    public String getaddress() {
        return address;
    }
    public String getStudentcourse() {
        return studentcourse;
    }
    //@override
    public String toString(){
        return ("student name is " + this.getName() +
                ", age is :" + this.getAge() +
                ", sex is :" + this.getSex() +
                ", address is :" + this.getaddress() +
                ", address is :" + this.getStudentcourse());

    }
    public static void String(String[] args){
        Student john = new Student("john", 25 ,"male", "Royal pine estate","English");
        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getSex());
        System.out.println(john.getaddress());
        System.out.println(john.getStudentcourse());
    }












}
