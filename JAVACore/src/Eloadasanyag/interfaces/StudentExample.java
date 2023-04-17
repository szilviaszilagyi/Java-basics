package Eloadasanyag.interfaces;

public class StudentExample {
    public static void main(String[] args) {
        StudentFileOperation saveStudentOne = new StudentFileOperation();
        saveStudentOne.save("Tóth Béla - 5c");
        System.out.println(saveStudentOne.read());
    }
}
