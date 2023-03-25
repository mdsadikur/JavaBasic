package Assignment3;

public class Constructor {

    public String position;

    public Constructor(){

    }

    public Constructor(String position){

        this.position= position;

    }

    public void Designation(){

        System.out.println("My position is " + position);

    }

    public static void main(String[] args) {

        System.out.println("================== no-arg constructor =========================");

        Constructor value = new Constructor();
        value.position="SQA Engineer";
        value.Designation();

        System.out.println("================== parameterized constructor =========================");

        Constructor value2 = new Constructor(" SQA Engineer");
        value2.Designation();
    }
}
