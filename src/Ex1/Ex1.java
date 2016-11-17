package Ex1;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
         outputArray(inputArray());
    }

    public static void outputArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] inputArray(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть розмір масиву >");
        int numberArray = scan.nextInt();
        int[] arr = new int[numberArray];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введіть число в масива >");
            arr[i] = scan.nextInt();
        }
        return arr;
    }
}
