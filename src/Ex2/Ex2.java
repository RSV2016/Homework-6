package Ex2;


import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Rectangle square = createRec();
    }

    private static Rectangle createRec() {
        Scanner scn = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        int exit = 20;
        do {
            System.out.println("Вести данні - 1");
            System.out.println("Обрахувати - 2");
            System.out.println("Вихід - 0");
            System.out.print("Ваш вибір >");
            exit = scn.nextInt();
            if (exit == 1) {
                System.out.print("Введіть висоту >");
                rec.height = scn.nextDouble();
                System.out.print("Введіть ширину >");
                rec.width = scn.nextDouble();
            }
            if (exit == 2) {
                System.out.println("Area = " + rec.getArea());
            }
        } while (exit > 0);
        return rec;
    }
}
