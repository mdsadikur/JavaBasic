package Assignment3;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        System.out.println("============== if statement ===============");

        String vowel = "aeiou";

        if(vowel=="aeiou"){

            System.out.println("Letters are vowel");
        }

        System.out.println("============== if-else statement ===============");

        String vowel2 = "aeiou";

        if(vowel2=="aeiou"){

            System.out.println("Letters are vowel");
        }

        else{
            System.out.println("Letters are consonant");
        }

        System.out.println("==============  if-else-if ladder ===============");

        int mark = 50;

        if(mark>=40 && mark>=60){
            System.out.println("Grade B-");
        }

        else if (mark>=80 && mark>=100) {
            System.out.println("Grade A+");
        }

        else if (mark>=40 && mark>=50) {
            System.out.println("Grade D");
        }

        else {
            System.out.println("Fail");
        }

        System.out.println("==============   Nested if-statement ===============");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your letter: ");
        String input = scanner.nextLine().toLowerCase();

        boolean Vowel = true;

        int i = 0;
        char ch = input.charAt(i);
        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
            Vowel = false;

        }

        if (Vowel) {
            System.out.println("The letter is vowel");
        } else {
            System.out.println("The letter is Consonant");
        }
   }
}


