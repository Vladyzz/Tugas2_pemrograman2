import java.util.Scanner;

public class soal_2 {


        public static void main(String args[]){

            int input,  i;
            Scanner angka = new Scanner(System.in);

            System.out.println("Nama : Aditya Bintang Pradana");
            System.out.println("NPM :  202143501613");
            System.out.println("Soal 2");
            System.out.println("==============================");

            System.out.print("Input Angka : ");
            input = angka.nextInt();
            System.out.print("Bilangan yang merupakan kelipatan 3 atau 5 adalah ");

            i = 1;
            do {
                if (i % 3 == 0 || i % 5 == 0)  {
                    System.out.print( i );
                    System.out.print(" ");
                }
                i ++;
            } while (i <= input);

        }

}
