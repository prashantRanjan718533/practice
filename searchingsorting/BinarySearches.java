package searchingsorting;

import java.util.Arrays;

public class BinarySearches {
    public static void main(String[] args) {
        int[] data = { 1,10, 11, 23, 111 };
        int res = 10;
        int start =0;
        int end = data.length-1;


        while (start<=end){
            int mid = start+(end-start)/2;
            if (res>data[mid]){
                start = mid+1;
            }
            else if(res<data[mid]){
                end = mid-1;
            }
            else {
                System.out.println("yes");
                break;
            }
        }
    }
}
