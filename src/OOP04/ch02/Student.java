package OOP04.ch02;

public class Student {

    private int StudentNum;
    private String studentName;

    public Student (int studentNum, String studentName) {
        this.StudentNum = studentNum;
        this.studentName = studentName;
    }

    public String toString() {
        return StudentNum + "," + studentName;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Student) {

            Student std = (Student) obj;

            if (this.StudentNum == std.StudentNum) {

                return true;

            } else {

                return false;

            }
        }
        return false;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
