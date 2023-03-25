package Assignment2.Method;

public class method2 {

    public static void main(String[] args) {
        method1 value = new method1("ABC" , 40);

        value.summation(20, 30);
        value.showingInfo();

        System.out.println("details1 : " + value.printageDetails());
        System.out.println("details2 : " + value.printPersonDetails());
        System.out.println("multiplication is : " + value.multiplication(20,10));

    }
}
