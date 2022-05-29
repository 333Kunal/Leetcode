public class Reversethestring {
    //Fuction to reverse arr[] from start to end
    static void reverseArray(int arr[], int start, int end){
        int temp;
        while(start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    //Utility that prints out an array on a line
    static void printArray(int arr[], int size)
    {
        for(int i=0; i<size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    //Driver code
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        printArray(arr, 6);
        reverseArray(arr,0,5);
        System.out.print("Reversesd array is \n");
        printArray(arr,6);
    }
}
