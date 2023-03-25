package Assignment2.Modifier1;

public class PrivateDataType1 {
    private String data;
    public String value;

    public PrivateDataType1(){  //Constructor

    }

    private void Privatedata1(){
        System.out.println("Private data1 is printed successfully");

    }

    public void Privatevalue2(){
        System.out.println("Public value is printed successfully");
    }

    public static void main(String[] args) {
        PrivateDataType1 privatedata1 = new PrivateDataType1();
        privatedata1.data = "data is showing";
        privatedata1.value = "value is showing";
    }

}
