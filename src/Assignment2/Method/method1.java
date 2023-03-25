package Assignment2.Method;

public class method1 {

    private String person;

    private int age;

    public method1(String personName, int ageNo){
        this.person = personName;
        this.age = ageNo;

    }

    public void showingInfo(){

        System.out.println(person + " " + age);
    }

    public String printPersonDetails(){
        return person;

    }

    public int printageDetails(){
        return age;
    }

    public void summation(int value1, int value2){

        System.out.println("sum is :" + (value1 + value2));

    }

    public int multiplication(int value1, int value2){

        return value1 * value2;
    }
}
