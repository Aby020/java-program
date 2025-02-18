import java.util.*;

class Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Get dimensions for matrices
        System.out.println("Enter the no of rows of first matrix:");
        int r = sc.nextInt();
        System.out.println("Enter the no of coloums of first matrix:");
        int c = sc.nextInt();
        
        // Initialize matrices
        int[][] m1 = new int[r][c];
        int[][] m2 = new int[r][c];
        int[][] sum = new int[r][c];
        
        // Input for first matrix
        System.out.println("Enter the first matrix:");
        inputMatrix(m1, r, c, sc);
        
        // Input for second matrix
        System.out.println("Enter the second matrix:");
        inputMatrix(m2, r, c, sc);
        
        // Display matrices
        System.out.println("matrix elements are:");
        displayMatrix(m1, r, c);
        System.out.println("");
        displayMatrix(m2, r, c);
        
        // Calculate and display sum
        System.out.println("Sum of matrices:");
        addMatrices(m1, m2, sum, r, c);
        System.out.println("");
        displayMatrix(sum, r, c);
        
        sc.close();
    }
    
    // Function to input matrix elements
    private static void inputMatrix(int[][] matrix, int rows, int cols, Scanner sc) {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    
    // Function to display matrix elements
    private static void displayMatrix(int[][] matrix, int rows, int cols) {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    // Function to add matrices
    private static void addMatrices(int[][] m1, int[][] m2, int[][] result, int rows, int cols) {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
    }
}
