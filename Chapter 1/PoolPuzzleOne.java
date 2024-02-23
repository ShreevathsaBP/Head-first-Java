// The output should be :
/*  a noise
    annoys
    an oyster
 */

/* class PoolPuzzleOne {
    public static void main(String [] args) {
        int x = 0;
        while ( __________ ) {
            _____________________________
            if ( x < 1 ) {
                ___________________________
            }
            _____________________________
            if ( __________ ) {
                ____________________________
                        ___________
            }
            if ( x == 1 ) {
                ____________________________
            }
            if ( ___________ ) {
                ____________________________
            }
            System.out.println();
            ____________
        }
    }
}
 */

// Snippets that can be used // note: Each snippet can be used only once
/*
x > 0                        x = x + 1;
x < 1                        x = x + 2;
x > 1                        x = x - 2;
x > 3                        x = x - 1;
x < 4

System.out.print(" ");       System.out.print("noys ");
System.out.print("a");       System.out.print("oise ");
System.out.print("n");       System.out.print(" oyster ");
System.out.print("an");      System.out.print("annoys");
                             System.out.print("noise");

 */

// Solution
public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x < 1) {
                System.out.print("oise ");
            }
            System.out.println();
            x = x + 1;
        }
    }

}
