package data_strucutres.arrays;

import java.util.Arrays;

public class MergeSortedArray {
    
    public static int[] mergeSortedArray(int[] arr1,int[] arr2){
        int[] finalArray = new int[arr1.length+arr2.length];
        int index1=0,index2=0;
        for (int i = 0; i < finalArray.length; i++) {
            if (index1==arr1.length && index2<arr2.length) {
                finalArray[i]=arr2[index2];
                index2++;
            } else if (index1<arr1.length && index2==arr2.length){
                finalArray[i]=arr1[index1];
                index1++;
            }
            else if (arr1[index1]<=arr2[index2]) {
                finalArray[i]=arr1[index1];
                index1++;
            } else {
                finalArray[i]=arr2[index2];
                index2++;
            }
        }
        return finalArray;
    }

    public static void main(String[] args) {
        int[] mergedArray = mergeSortedArray(new int[]{0,3,4,31}, new int[]{4,6,30});
        System.out.println(Arrays.toString(mergedArray));
    }
}
