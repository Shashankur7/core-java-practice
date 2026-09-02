public class StudentDriver{
    public static void main(String[] args) {
        Student s1 = new Student("Raje", 23,"fc collage", "bca",4243,234545245452l,'A',3234);

        System.out.println(s1);
        System.out.println(s1.toString());

        Student s2 = new Student("rani",24,"jm collage", "bba ",3425,2134235124525l,'A',2424);
        Student s3 = new Student("Raje", 23,"fc collage", "bca",4243,234545245452l,'A',3234);

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}