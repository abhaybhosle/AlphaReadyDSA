package Arrays;

public class Binary_search_Arrays {
    public static int Binarysearch(int numbers[],int key){
        int start=0, end = numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            if (numbers[mid]==key){
                return mid;

            }
            if (numbers[mid]>key){ //left
                return end = mid-1;

            }
            else{
                return start = mid+1;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        int key = 2;
        System.out.println("The index of the key is : "+Binarysearch(numbers,key));
    }
    
}

