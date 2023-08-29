//Question 3 :Write a program to Find Transpose of a 2*3 Matrix.


package Arrays_in_2D;

public class ques3 {
    public static void Printmatrix(int arr[][]){
        System.out.println("The matrix is : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        int row=2;
        int column = 3;
        int arr[][] = {{1,2,3},{4,5,6}};
        Printmatrix(arr);


        int transpose[][] = new int[column][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                transpose[j][i]=arr[i][j];

            }

        }
        Printmatrix(transpose);
    }
    
}
