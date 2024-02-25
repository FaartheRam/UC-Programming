public class GettingLoopy {
    public static void main(String[] args) {

        for (int cnt = 0; cnt <= 30; cnt++) { //start at 0 count by 1
            System.out.println(cnt);
        }


        for (int cnt = 30; cnt >= 0; cnt--) { //start at 30 reduce by 1
            System.out.println(cnt);
        }

        for (int cnt = 0; cnt <= 18; cnt = cnt + 3) { //start at 0 count by 3
            System.out.println(cnt);
        }

        for (int cnt = 10; cnt >= 0; cnt = cnt - 2) { //start at 10 reduce by 2
            System.out.println(cnt);
        }

        for (int i = 1; i <= 5; i++) { //increment by 1 to 5
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) { //reduce by 5 to 1
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();

        }

        for (int i = 1; i <= 5; i++) { //box pattern
            for (int j = 1; j <= 5; j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i = 0; i < 3; i++) { //letter J
            for(int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("       * * *");
        }
        for(int i = 0; i < 3; i++) {
            System.out.println(" * *   * * *");
        }
        System.out.println("   * * * * ");
    }
}