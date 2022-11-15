import java.util.Scanner;

public class MatrixSub {
    public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);
        
        // getting row and column of first matrix
        System.out.println("\n ENTER NUMBER OF ROWS IN FIRST MATRIX : ");
        int r1 = sc.nextInt();
        System.out.println("\n ENTER NUMBER OF COLUMNS IN FIRST MATRIX : ");
        int c1 = sc.nextInt();
        
        //creating matrix 1
        int first[][] = new int[r1][c1];

        //reading elements in first matrix
        System.out.println("\n ENTER ELEMENTS IN FIRST MATRIX : ");
        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c1; j++){
                first[i][j] = sc.nextInt();
            }
        }
        
        // print 1st matrix 
        System.out.println("FISRT MATRIX AS NOW : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) { 
                System.out.print(first[i][j] + " ");
            }
            System.out.println();
        }
        //getting row and column of second matrix          
        System.out.println("\n ENTER NUMBER OF ROWS IN SECOND MATRIX : ");
        int r2 = sc.nextInt();
        System.out.println("\n ENTER NUMBER OF COLUMNS IN SECOND MATRIX : ");
        int c2 = sc.nextInt();
        
        //creating matrix 2
        int second[][] = new int[r2][c2];
        
        //reading elements in second matrix
        System.out.println("\n ENTER ELEMENTS IN SECOND MATRIX : ");
        for (int i = 0; i < r2; i++){
            for (int j = 0; j < c2; j++){
                second[i][j] = sc.nextInt();
            }
        }
        
        // print 2nd matrix 

        System.out.println("SECOND MATRIX AS NOW : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) { 
                System.out.print(second[i][j] + " ");
            }
            System.out.println();
        }                    
        // creating another matrix to store the difference of two matrices
        int diff[][] = new int[r1][c1]; 

        // adding and printing addition of 2 matrices

        System.out.println("THE FINAL  MATRIX AS SUM : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                diff[i][j] = first[i][j] + second[i][j]; 
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }
    }
}