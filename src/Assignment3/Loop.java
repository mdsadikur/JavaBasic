package Assignment3;

public class Loop {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            System.out.println("The value is " + i);
        }
        System.out.println("================== while loop ====================");

        int j = 1;
        while (j < 15) {

            System.out.println("while value is " + j + " showing");
            j++;
        }

        System.out.println("================== do while loop ====================");

        int k = 1;
        do{
            System.out.println("do while value is "+k);
            k++;
        }while (k <= 5);

        //Java for-each loop: for(data_type var : array_name/collection_name)
        System.out.println("================== for-each loop ====================");

        String[] number = {"value1","value2"};

        for (String new1:number){
            System.out.println(new1);
        }

    }
}
