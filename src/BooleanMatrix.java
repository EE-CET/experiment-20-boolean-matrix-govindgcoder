import java.util.Scanner;

public class BooleanMatrix {
    
    // TODO: Implement the function to modify the matrix
    
        // Logic: Check each row. If it contains a 1, set the whole row to 1.
    

    
        // TODO: Read m and n
        // TODO: Read the matrix elements
        // TODO: Call BooleanMatrixProblem(mat, m, n)
        // TODO: Print the modified matrix
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j = 0; j<n; j++) arr[i][j]=sc.nextInt();
        }
        for (int i=0; i<m; i++){
            Boolean flag = false;
            for (int j = 0; j<n; j++) {
                if(arr[i][j]==1 && !flag) {
                    flag=true;
                    j=0;
                }
                if(flag) arr[i][j]=1;
            }
        }
        for (int i=0; i<m; i++){
            for (int j = 0; j<n; j++) {
                System.out.print(arr[i][j]);
                if(j!=n-1) System.out.print(" ");
            }
            if (i!=m-1) System.out.print("\n");
        }
    }
}
