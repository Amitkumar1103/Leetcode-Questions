class Solution {
    public void moveZeroes(int[] arr) {
        int j =0;
        for(int i =0;i<arr.length;i++){
            if(0!=arr[i]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}