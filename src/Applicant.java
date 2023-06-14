public class Applicant {
    private String name;
    private int age;
    private String sex;
    private String address;


    public Applicant(String name, int age, String sex, String address) {

        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;


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
    public String getAddress() {
        return address;
    }

    //@override
    public String toString(){
        return ("student name is " + this.getName() +
                ", age is :" + this.getAge() +
                ", sex is :" + this.getSex() +
                ", address is :" + this.getAddress());

    }
    public static void String(String[] args){
        Applicant Ade = new Applicant("Ade", 25,"male", "Royal pine estate");
        System.out.println(Ade.getName());
        System.out.println(Ade.getAge());
        System.out.println(Ade.getSex());
        System.out.println(Ade.getAddress());
    }

}