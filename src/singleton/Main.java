package singleton;

public class Main {
    public static void main(String[] args) {
        Aircraft a1 = Aircraft.getInstance();
        Aircraft a2 = Aircraft.getInstance();

        System.out.println(a1.getName());
        System.out.println(a2.getName());

        a2.setName("TEST-897");


        System.out.println(a1.getName());
        System.out.println(a2.getName());


    }
}
