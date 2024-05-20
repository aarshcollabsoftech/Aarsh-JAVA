public class ArrayPrac {
    public static void main(String[] args) {

        // ---Q1

        // float [] marks = {45.7f,67.5f,78.3f,99.2f,100.0f};
        // float sum =0;
        // for (float f : marks) {
        // sum = sum+f;
        // }
        // System.out.println("Value of sum of marks is "+sum);

        // ---Q2

        // float [] marks = {45.7f,67.5f,78.3f,99.2f,100.0f};
        // float num =45.7f;
        // boolean isinArray = false;
        // for (float f : marks) {
        // if(num == f){
        // isinArray = true;
        // break;
        // }
        // }
        // if(isinArray){
        // System.out.println(num + " value is present in array ");
        // }
        // else{
        // System.out.println(num +" value is not present in array ");

        // }

        // ---Q3

        // float [] marks = {45.7f,67.5f,78.3f,99.2f,100.0f};
        // float sum =0;
        // float avg =0;
        // for (float f : marks) {
        // sum =sum+f;
        // avg = (sum+f)/marks.length;
        // }
        // System.out.println("Avg of marks is "+avg);

        // ---Q4

        // Add 2 matrix of 2 x 3
        // int [][] matrix1 = { {1,2,3},
        // {4,5,6}};
        // int [][] matrix2 = { {1,2,3},
        // {4,5,6}};
        // int [][] result = { {0,0,0},
        // {0,0,0}};

        // for(int i=0;i<matrix1.length;i++){
        // for(int j=0;j<matrix1[i].length;j++){
        // result[i][j] = matrix1[i][j]+matrix2[i][j];
        // }
        // } 

        // for(int i=0;i<matrix1.length;i++){
        // for(int j=0;j<matrix1[i].length;j++){
        // System.out.print(result[i][j] + " ") ;

        // }    
        // System.out .println(" ");
        // }

        // ---Q5

        // Reverse an Array
        // int [] arr = {1,2,3,4,5,6};
        // int temp;
        // int l = arr.length;
        // int n = Math.floorDiv(l,2);
        // System.out.println("Previous Array");
        // for (int previousArr : arr) {
        // System.out.print(previousArr +" ");
        // }
        // for(int i=0;i<n;i++){
        // temp = arr[i];
        // arr[i] = arr[l-1-i];
        // arr[l-1-i]=temp;
        // }
        // System.out.println("\nReverse Array");
        // for (int i : arr) {
        // System.out.print(i +" ");
        // }

        // ---Q6

        // Maxm in array

        // int[] arr = { 1,2,3,4,5,6 };
        // int max = arr[0];

        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }
        // System.out.println("Maximum number is: " + max);

        // ---Q7

        // Minm in Array

        // int [] arr ={1,2,3,4,5,6};
        // int min =Integer.MAX_VALUE;
        // for (int e : arr) {
        // if(e<min){
        // min = e;
        // }
        // }
        // System.out.println("Minimum is "+min);

        // ---Q8

        int [] arr = {1,12,52,85,64,21,05};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            };
        }
        if(isSorted){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }

    }
}
