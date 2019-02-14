package importants;

public class lutron {

    private static void lutron() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Lutron");
            } else if (i % 3 == 0) {
                System.out.println("Lu");
            } else if (i % 5 == 0) {
                System.out.println("Tron");
            } else {
                System.out.println(i);
            }
        }
    }

    private static void recursiveLutron(int a, int b) {

        if (a <= b) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("Lutron");
            } else if (a % 3 == 0) {
                System.out.println("Lu");
            } else if (a % 5 == 0) {
                System.out.println("Tron");
            } else {
                System.out.println(a);
            }
            recursiveLutron(++a, b);

        }
//        else {
//            System.exit(0);
//        }
    }


    private static void recursiveLutron1(int b) {

        if (b >= 1) {
            recursiveLutron1(--b);
            if (b % 3 == 0 && b % 5 == 0) {
                System.out.println("Lutron");
            } else if (b % 3 == 0) {
                System.out.println("Lu");
            } else if (b % 5 == 0) {
                System.out.println("Tron");
            } else {
                System.out.println(b);
            }
        }
//        else {
//            System.exit(0);
//        }
    }

}
