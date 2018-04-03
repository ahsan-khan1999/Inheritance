public class Student extends Person{

   private String id;
   private double gpa;

   public Student(String name, String email, String address, int phoneNmber, String id, double gpa)
   {
    super(name,address ,email, phoneNmber);
    this.gpa=gpa;
    this.id=id;

   }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
