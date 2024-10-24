
public class Main {

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        Manusia m1 = new Manusia("Kak Gem", "Kasi Paham", 32, "Bernafas");
        Manusia m2 = new Manusia("Vadel", "Dance Geter", 19, "Dance");
        Manusia m3 = new Manusia("Loli", "ATM Berjalan", 16, "Liat Vadel");
        Manusia m4 = new Manusia("Agus", "Agus Sakit   ", 35, "Donasi");
        Manusia m5 = new Manusia("Fufu Fafa", "Roasting", 30, "Buka Kaskus");

        System.out.println("Menambahkan data Manusia Viral");
        list.addFirst(m1);
        list.addLast(m2);
        list.addLast(m3);
        list.addLast(m4);
        list.addLast(m5);
        list.displayList();

        System.out.println("Menghapus Fufu Fafa dari Daftar");
        list.DeleteLast();
        list.displayList();

        System.out.println("Menghapus Kak Gem Dari Daftar");
        list.deleteFirst(m1);
        list.displayList();

    }
}
