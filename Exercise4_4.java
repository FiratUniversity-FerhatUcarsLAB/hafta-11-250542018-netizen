public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
/* 1. Kod çalışır, hata vermez; ancak metottan dönen sonuç bir değişkene atanmadığı için o veri havaya uçar (kaybolur).
   2. Derleme hatası (compile error) alırız; çünkü void metot geriye bir değer döndürmez, "yokluk" ile toplama işlemi yapılamaz
*/