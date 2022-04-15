public class Main {

    public static void main(String [] args){
        int [] test = {1,2,3,4,5,3};
     test = reverse(test);
     for(int i: test) {
         System.out.println(i);
     }
    }

    /*
    Shifting an array to the left:
        store index 0 into a temporary variable
        then for every value in the array:
            replace the current value with the value to the right
        when we reach the end the list, replace the current value with the one stored in the temp variable
     */

    public static int[] shiftLeft(int [] arr){
        int temp = arr[0];
        for(int i = 0; i < arr.length -1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        return arr;
    }

    /*
    for every value in the array:
        iterate through the array again to find if another value matches, and return what is needed.
     */

    public static int findDuplicates(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return j;
                }
            }
        }
        return -1;
    }

    /*
    create a temporary array with the same size as the original
    loop backwards through the original array;
    for every value, set the index of the new array, equal to the current length - the current index;
     */

    public static int[] reverse(int[]arr){
        int [] retArr = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
            retArr[(arr.length-1)-i] = arr[i];
        }

        return retArr;
    }

    public static int wordWithLetter(String[] arr, String letter){
        for(int i = 0; i < arr.length; i++){
            String temp = arr[i];
            if(temp.contains(letter)){
                return i;
            }
        }
        return -1;
    }
}