public class Pattern1 {
    static void pattern1() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*"); // same line
            }
            System.out.println(); // new line
        }
    }

    static void pattern2() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*"); // same line
            }
            System.out.println(); // new line
        }
    }

    static void pattern3() {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" "); // same line
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*"); // new line
            }
            System.out.println();
        }
    }

    static void pattern4() {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(col==1 || col==n || row ==1 || row == n){
                    System.out.print("*"); // new line
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern5() {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" "); // same line
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* "); // new line
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();

    }

}
