import java.util.Scanner;

public class PatternProgram {

    public static void main(String[] args) {
        showPatternMenu(); 
    }

    static void showPatternMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println();
            System.out.println("       PATTERN PROGRAM MENU    ");
            System.out.println();
            System.out.println("1. Right-Aligned Inverted Triangle");
            System.out.println("2. Diamond-Like Expanding Pattern");
            System.out.println("3. X Shape Pattern");
            System.out.println("4. Number Triangle");
            System.out.println("5. Number Pyramid");
            System.out.println("6. Number X Pattern");
            System.out.println("7. Hollow Square with Border");
            System.out.println("8. Indented Number-Star Pattern");
            System.out.println("9. Alternating Star and Line Pattern");
            System.out.println("10. Repeated Number-Star Triangle");
            System.out.print("Enter your choice:");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pattern1();
                    break;
                case 2:
                    pattern2();
                    break;
                case 3:
                    pattern3();
                    break;
                case 4:
                    pattern4();
                    break;
                case 5:
                    pattern5();
                    break;
                case 6:
                    pattern6();
                    break;
                case 7:
                    pattern7();
                    break;
                case 8:
                    pattern8();
                    break;
                case 9:
                    pattern9();
                    break;
                case 10:
                    pattern10();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 10.");
            }

            System.out.print("\nDo you want to continue? (Press 1 for Yes, any other number to exit): ");
            int repeat = sc.nextInt();

            if (repeat != 1) {
                System.out.println("\nThank you! Program ended.");
                break;
            }
        }
    }

    static void pattern1() {
        System.out.println("\nPattern 1: Right-Aligned Inverted Triangle");
        int i , j , k;
        for ( i=1; i<=5; i++){
            for ( j=2; j<=i; j++){
                System.out.print(" ");
            }
            for( k=5; k>=i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    } 

    static void pattern2() {
        System.out.println("\nPattern 2: Diamond-Like Expanding Pattern");
        int i, N=7;
        for( i=1; i<N+N; i++){ 
            System.out.println((i<=N)? "*".repeat(i):"*".repeat(N-(i-N))); 
        }
    }

    static void pattern3() {
        System.out.println("\nPattern 3: X Shape Pattern");
        int i, j;
        for ( i=0; i<5; i++) {
            for( j=0; j<5; j++) {
                if( i==j || i+j==5-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern4() {
        System.out.println("\nPattern 4: Number Triangle");
        int i, j;
        for ( i=1; i<=5; i++) {
            for( j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern5() {
        System.out.println("\nPattern 5: Number Pyramid");
        int i, j, k;
        for ( i=1; i<=5; i++) {
            for ( j=1; j<=i; j++) {
                System.out.print( j+" ");
            }
            for ( k=i-1; k>=1; k--) {
                System.out.print( k+" ");
            }
            System.out.println();
        }
    }

    static void pattern6() {
        System.out.println("\nPattern 6: Number X Pattern");
        int i, j;
        for ( i=0; i<7; i++) {
            for( j=0; j<7; j++) {
                if( i==j || i+j==7-1) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern7() {
        System.out.println("\nPattern 7: Hollow Square with Border");
        int i, j;
        for ( i=1; i<=5; i++) {
            for( j=1; j<=5; j++) {
                if ( i>=1 && j>=2 && i<=4 && j<=4) {
                    System.out.print("  ");
                } else {
                    System.out.print(" x");
                }
            }
            System.out.println();
        }
    }

    static void pattern8() {
        System.out.println("\nPattern 8: Indented Number-Star Pattern");
        int i;
        for ( i=0; i<=9; i++) {
            System.out.println( i + " ".repeat(i) + " *");
        }
    }

    static void pattern9() {
        System.out.println("\nPattern 9: Alternating Star and Line Pattern");
        int i;
        for( i=1; i<10; i++) {
            System.out.println((i%2==0) ? " ------" : "*********");
        }
    }

    static void pattern10() {
        System.out.println("\nPattern 10: Repeated Number-Star Triangle");
        int i , j;
        for ( i=1; i<=5; i++) {
            for( j=1; j<=i; j++){
                System.out.print( i + " * ");
            }
            System.out.println();
        }
    }
}
