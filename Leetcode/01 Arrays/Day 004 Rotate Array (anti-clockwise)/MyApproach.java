class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        for(int i=0;i<d;i++)                //To manage the place by which we have to rotate the array.
        {
            int temp=arr[0];                //To store the first element of the array.
            for(int j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;         //Placing the first element stored in the temp at the last element of the array.
        }
    }
}



// It time complexity is O(d*n) and space complexity is O(1).