/*
 * Ad Soyad: Akın Ağaçbacak
 * Ogrenci No: 250542018
 * Tarih: 03/12/2025
 * Aciklama: Exercise 4_2
 *
 */

public class Exercise4_2 {

    public static void main(String[] args) {
        zippo("rattle", 13); // 1. Başlangıç: zippo metodu çağrılır (quince="rattle", flag=13).
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);      // 5. Ekrana "rattle" yazılır.
        zippo("ping", -5);              // 6. zippo tekrar çağrılır (quince="ping", flag=-5).
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {                 // 2. Kontrol (13 < 0 mı? Hayır). | 7. Kontrol (-5 < 0 mı? Evet).
            System.out.println(quince + " zoop"); // 8. Ekrana "ping zoop" yazılır.
        } else {
            System.out.println("ik");             // 3. Ekrana "ik" yazılır.
            baffle(quince);                       // 4. baffle metodu çağrılır (blimp="rattle").
            System.out.println("boo-wa-ha-ha");   // 9. baffle bitti, buraya dönüldü. Ekrana "boo-wa-ha-ha" yazılır.
        }
    }
}
