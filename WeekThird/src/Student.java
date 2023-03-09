import java.util.Scanner;

public class Student {
    int rollNumber;
    String name;
    String course;
    int marks1,marks2,marks3;
    int total;
    float average;

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    void calculateTotal() {
        total = marks1+marks2+marks3;
        System.out.println("Total Marks : " + total);
    }

    void calculateAverage() {
        average = (float)total/3;
        System.out.println("Average Marks = " + average);
    }

    void calculateGrade() {
        if(average>=90) {
            System.out.println("Grade = A");
        } else if(average >=80 && average<90) {
            System.out.println("Grade = B");
        } else if(average >=70 && average<80) {
            System.out.println("Grade = C");
        } else if(average >=60 && average<70) {
            System.out.println("Grade = D");
        } else if(average >=50 && average<60) {
            System.out.println("Grade = E");
        } else {
            System.out.println("Grade = F");
        }
    }

    @Override
    public String toString() {
        return this.getRollNumber()+" "+this.getName()+" "+this.getCourse()+" "+this.getMarks1()+" "+this.getMarks2()+" "+this.getMarks3();
    }

}

class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Students ? ");
        int n = sc.nextInt();
        while (n!=0){
            Student student = new Student();

            System.out.println("Enter the Roll Number of Student : ");
            int rollNumber = sc.nextInt();
            student.setRollNumber(rollNumber);

            System.out.println("Enter the Name of the Student : ");
            String name = sc.next();
            student.setName(name);

            System.out.println("Enter the Course for the Student : ");
            String course = sc.next();
            student.setCourse(course);

            System.out.println("Enter marks1 of Student : ");
            int marks1 = sc.nextInt();
            student.setMarks1(marks1);

            System.out.println("Enter marks2 of Student : ");
            int marks2 = sc.nextInt();
            student.setMarks2(marks2);

            System.out.println("Enter marks3 of Student : ");
            int marks3 = sc.nextInt();
            student.setMarks3(marks3);

            //Displaying details of the students
            System.out.println("Student details are : ");
            System.out.println(student);           student.calculateTotal();
            student.calculateAverage();
            student.calculateGrade();

            n--;
        }

    }
}
