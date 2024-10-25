public class Lab {
    private Student[] students;
    private String teachername;
    private String dayOfweek;
    private int maxsize;
    private int currentsize;
    private double avGrade;
    public Lab(String teachername, String dayOfweek, int maxsize) {
        this.teachername = teachername;
        this.dayOfweek = dayOfweek;
        this.maxsize = maxsize;
        this.currentsize = 0;
        this.avGrade = 0.0;
        this.students = new Student[maxsize];
    }
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public String getTeachername() {
        return teachername;
    }
    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }
    public String getDayOfweek() {
        return dayOfweek;
    }
    public void setDayOfweek(String dayOfweek) {
        this.dayOfweek = dayOfweek;
    }
    public int getMaxsize() {
        return maxsize;
    }
    public void setMaxsize(int maxsize) {
        this.maxsize = maxsize;
    }
    public int getCurrentsize() {
        return currentsize;
    }
    public void setCurrentsize(int currentsize) {
        this.currentsize = currentsize;
    }
    public double getAvGrade() {
        return avGrade;
    }
    public void setAvGrade(double avGrade) {
        this.avGrade = avGrade;
    }
    public void printLabInfo(String teachername, String dayOfweek, int maxsize){
        System.out.println("Student Name: " + teachername);
        System.out.println("Day Of Week: " + dayOfweek);
        System.out.println("Max Size: " + maxsize);
        System.out.println("Current Size: " + this.currentsize);
        System.out.println("Avg Grade: " + this.avGrade);
    }
}

