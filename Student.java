public class Student {
    private String firstname;
    private String lastname;
    //Student's Id contains at least 7 digits: e.g:9931024
    private String Id;
    private double grade;
    public Student() {
        this.firstname = firstname;
        this.lastname = lastname;
        this.Id = Id;
        //assuming that the student's grade is zero
        grade=0;
    }
    public Student(String firstname, String lastname, String Id, double grade) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.Id = Id;
        this.grade = grade;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        if(Id.length()==7){
            this.Id = Id;
        }
        else{
            System.out.println("Invalid ID");
        }

    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void printStudentInfo(){
        System.out.println( firstname + ""+lastname +"\nID:"+ Id+ "\nGrade:"+ grade);

    }

}
