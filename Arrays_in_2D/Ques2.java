//Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.
//Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//Output - 18

package Arrays_in_2D;

public class Ques2 {
    public static void main(String[] args) {
        int[][] nums = { {1,4,9},
                         {11,4,3},
                         {2,2,3} };

        int sum =0;
      
        for(int j=0;j<nums[0].length;j++){
            sum+= nums[1][j];
            

        }
       
        System.out.println("Sum of 1st column row elements is = "+sum);
        
    }
    
}




