package Assignment4.namingConvention;

public class namingConvention {

    public namingConvention(){

    }

    public void name(){
        System.out.println("His name is Sadik");
    }

    public void gender(){

        System.out.println("His Gender is Male");
    }

    public void year(){

        int age = 24;
        System.out.println("His age is " + age);

    }

    public static void main(String[] args) {
        namingConvention namingConvention = new namingConvention();

        namingConvention.name();
        namingConvention.gender();
        namingConvention.year();
    }
}
