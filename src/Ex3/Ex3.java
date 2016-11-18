package Ex3;


import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Human hum = new Human();
        int index = 20;
        System.out.print("Введіть і'мя >");
        hum.name = scan.nextLine();
        System.out.print("Введіть фамілію >");
        hum.secondName = scan.nextLine();
        System.out.print("Введіть вік >");
        hum.age = scan.nextInt();
        hum.printOut(hum.name,hum.secondName,hum.age);
    }
}
