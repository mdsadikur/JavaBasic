package Assignment1;

public class Veriable_Constructor_Object {

    String studentName;

    static int classRoom1;

    public Veriable_Constructor_Object(){

    }

    public void nameOfStudent(){

        System.out.println("Student Name is : " + studentName);
    }

    public void showingDetails(){

        String schoolName = "ABC International School";
        System.out.println("School Name is : "+ schoolName);
    }

    public static void main(String[] args) {

        Veriable_Constructor_Object.classRoom1 = 101;
        System.out.println("Class Room Number is : "+ classRoom1);


        Veriable_Constructor_Object new_name = new Veriable_Constructor_Object();
        new_name.studentName = "Smith";
        new_name.nameOfStudent();
        new_name.showingDetails();
    }
}
