package Assignment2;

public class Operators {

    public static void main(String[] args) {

        System.out.println("========================Unary Operator====================");

        //Unary Operator
        int value = 50;

        System.out.println("++value is : " + ++value); //1+50=51
        System.out.println("value++ is : " + value++); //print 51+1=52
        System.out.println("value is : " + value); //52

        System.out.println("--value is : " + --value); //52-1=51
        System.out.println("value-- is : " + value--); //print 5111=50
        System.out.println("value is : " + value); //50


        System.out.println("========================Arithmetic Operator====================");

        //Arithmetic Operator
        int value2 = 100, value3 = 200, Summation,Extraction,Multiplication,Division;

        Summation = value2 + value3;
        Extraction = value3 - value2;
        Multiplication = value2 * value3;
        Division = value3 / value2;


        System.out.println("Summation is : " +Summation);
        System.out.println("Extraction is : " +Extraction);
        System.out.println("Multiplication is : " +Multiplication);
        System.out.println("Division is : " +Division);

        System.out.println("========================Ternary Operator====================");

        //Ternary Operator

        int number1 = 10, number2 = 20;

        int Maxnumber= (number1 < number2) ? number1 : number2;
        System.out.println("The value is : " + Maxnumber);

        //Relational Operator

        System.out.println("number1 < number2 is : " + (number1 < number2));  //true
        System.out.println("number1 > number2 is : " + (number1 > number2));  //false
        System.out.println("number1 <= number2 is : " + (number1 <= number2));  //true
        System.out.println("number1 >= number2 is : " + (number1 >= number2));  //false
        System.out.println("number1 == number2 is : " + (number1 == number2));  //false
        System.out.println("number1 != number2 is : " + (number1 != number2));  //true


        System.out.println("========================Logical Operator====================");


        //Logical Operator
        System.out.println("The value is : " + ((number1 > number2) && (number1 < number2)));  //false
        System.out.println("The value is : " + ((number1 < number2) || (number1 < number2)));  //true
        System.out.println("The value is : " + ((number1 == number2) && (number1 > number2)));  //false
        System.out.println("The value is : " + ((number1 > number2) || (number1 <= number2)));  //true
    }

    public static class PrimitiveDataType {

        public static void main(String[] args) {


            int myInt = 10; // integer example
            boolean myBoolean = true; // boolean example
            char myChar = 'a'; // character example
            float myFloat = 3.14f; // floating-point example
            byte myByte = 127; // byte example
            short myShort = 32767; // short example
            long myLong = 9223372036854775807L; // long example
            double myDouble = 3.14159265358979323846; // double example

            System.out.println("myInt = " + myInt);
            System.out.println("myBoolean = " + myBoolean);
            System.out.println("myChar = " + myChar);
            System.out.println("myFloat = " + myFloat);
            System.out.println("myByte = " + myByte);
            System.out.println("myShort = " + myShort);
            System.out.println("myLong = " + myLong);
            System.out.println("myDouble = " + myDouble);
        }
    }
}

