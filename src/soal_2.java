import java.util.Scanner;

public class soal_2 {


        public static void main(String args[]){

            int input,i,j;
            Scanner angka = new Scanner(System.in);

            System.out.println("Nama : Aditya Bintang Pradana");
            System.out.println("NPM :  202143501613");
            System.out.println("Soal 2");
            System.out.println("==============================");

            System.out.print("Input Angka : ");
            input = angka.nextInt();
            System.out.print("Bilangan yang kurang dari 10 adalah ");

            i = 1;
            j = 0;
            do {
                if (i % 2 != 0)  {
                    System.out.print( i );
                    System.out.print(" ");
                    j = j + i;
                }
                i ++;
            } while (i <= input);
            System.out.println(" ");
            System.out.println("Jumlah seluruh bilangan adalah : "+ j);
        }

}
