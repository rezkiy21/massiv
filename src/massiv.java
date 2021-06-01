import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class massiv {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длину массива");
        int count = scanner.nextInt(); // записываем данное значение с клавиатуры
        int mass[] = new int[count];


//        mass[0] = 4;
//        mass[1] = 2;
//        mass[2] = 7;
//        mass[3] = 1;
//        mass[4] = 3;

//        System.out.println(mass[0]);
//        System.out.println(mass[1]);
//        System.out.println(mass[2]);
//        System.out.println(mass[3]);
//        System.out.println(mass[4]);

        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(mass));

//        for (int i = 0; i < mass.length; i++){
//            if (mass[i] % 2 == 0){
//                mass[i] = mass[i] * 2;
//            } else{
//                mass[i] = mass[i] * 3;
//            }
//        }
//        System.out.println(Arrays.toString(mass));
          int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println(max);
    }
}
