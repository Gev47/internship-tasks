package two_pointers;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 3, 4, 4, 4, 4, 4, 5, 5, 8};
        int size = removeDuplicates(arr);
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int j = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }
}