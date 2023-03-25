package Assignment2.Modifier1;

public class ProtectedDataType1 {


    protected String data;
    public String value;

    public ProtectedDataType1(){  //Constructor

    }

    protected void Privatedata1(){
        System.out.println("Private data1 is printed successfully");

    }

    public void Privatevalue2(){
        System.out.println("Public value is printed successfully");
    }

    public static void main(String[] args) {
        ProtectedDataType1 privatedata1 = new ProtectedDataType1();
        privatedata1.data = "data is showing";
        privatedata1.value = "value is showing";
    }
}
