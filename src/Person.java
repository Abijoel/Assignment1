public class School {

    private String staff;
    private String name;
    private int age;
    private String sex;
    private String address;
    private String Subjects;



    public School(String staff, String name, int age, String sex, String address, String subjects) {

        this.staff = staff;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.Subjects = subjects;


    }
    public String getStaff(){
        return staff;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
    public String getSubject(){
        return Subjects;
    }
    public String getAddress(){
        return address;
    }

}