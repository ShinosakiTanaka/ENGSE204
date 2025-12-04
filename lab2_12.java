package lab2_12;

class Course {
    private String courseId;
    private String courseName;

    public Course(String id, String name) {
        courseId = id;
        courseName = name;
    }

    public String getCourseInfo() {
        return courseId + ": " + courseName;
    }
}

class Student {
    private String studentName;
    private Course enrolledCourse;

    public Student(String name, Course course) {
        studentName = name;
        enrolledCourse = course;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
    }
}

import java.util.Scanner;

public class lab2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String courseId = sc.nextLine().trim();
        String courseName = sc.nextLine().trim();
        Course course = new Course(courseId, courseName);


        String studentName = sc.nextLine().trim();


        Student stu = new Student(studentName, course);
        stu.displayEnrollment();
    }
}
