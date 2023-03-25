package Assignment2.Modifier1;

public class PublicDataType1 {

    public String data;
    public String value;

    public PublicDataType1(){  //Constructor

    }

    public void Privatedata1(){
        System.out.println("Private data1 is printed successfully");

    }

    public void Privatevalue2(){
        System.out.println("Public value is printed successfully");
    }

    public static void main(String[] args) {
        PublicDataType1 privatedata1 = new PublicDataType1();
        privatedata1.data = "data is showing";
        privatedata1.value = "value is showing";
    }
}
