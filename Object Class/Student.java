public class Student{
    String name;
    int age;
    String call;
    String depa;
    double per;
    long phno;
    char grade;
    int prn;

    private Student(){
    }
    public Student(String name , int age, String call, String depa, double per, long phno, char grade, int prn) {
        super();
        this.name = name;
        this.age = age;
        this.call = call;
        this.depa = depa;
        this.per = per;
        this.phno = phno;
        this.grade = grade;
        this.prn = prn;
    }
    public String toString() {

        return "[Name :" + name + "Age :" + age +"call :"+call+ "depa :" + depa + "per : " + per + "phno :" + phno + "Grade :" + grade + "prn :" + prn + "]";
    }
        public boolean equals(Object o){
            Student s =(Student) o;
            if(this.name == s.name && this.age == s.age && this.call == s.call && this.depa == s.depa && this.per == s.per && this.phno == s.phno && this.grade == s.grade && this.prn == s.prn)
                {
                    return true;
                }
                return false;
        }
}