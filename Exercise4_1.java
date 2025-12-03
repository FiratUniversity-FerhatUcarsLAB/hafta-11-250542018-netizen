/*
 * Ad Soyad: Akın Ağaçbacak
 * Ogrenci No: 250542018
 * Tarih: 03/12/2025
 * Aciklama: Exercise 4_1
 *
 *Girilen tarihleri American ve europan olarak farkı şekillerde ekrana yazdırır
 */


import java.util.Scanner;

public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.printf("%s, %s %d, %d\n",day,month,date,year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.printf("%d %s %d, %s\n",date,month,year,day);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



         String day = " ";
         String month = " ";
         int date ;
         int year ;

         System.out.print("Gün adını Giriniz:");
         day = input.nextLine();
         System.out.print("Ay Adını Giriniz:");
         month = input.nextLine();
         System.out.print("Gün tarihni Giriniz:");
         date = input.nextInt();
         System.out.print("Yıl giriniz:");
         year= input.nextInt();

         printAmerican ( day , date , month , year ) ;
         printEuropean ( day , date , month , year ) ;

        input.close();
    }
}
