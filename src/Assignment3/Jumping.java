package Assignment3;

public class Jumping {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            System.out.println("The value is " + i);
            if (i == 8)
                break;
        }

        System.out.println("============== continue ===============");

        for (int i = 0; i < 10; i++) {

            if (i == 8)

                continue;

            System.out.println("The value is " + i);

        }
    }
}
