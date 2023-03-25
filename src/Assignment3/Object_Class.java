package Assignment3;

public class Object_Class {

    public String language;

    public Object_Class(){   //constructor

    }

    public void programing(){  //method

        System.out.println("Write a "+ language + " program");
    }

    public static void main(String[] args) {
        Object_Class value = new Object_Class();

        value.language="Java";
        value.programing();
    }
}
