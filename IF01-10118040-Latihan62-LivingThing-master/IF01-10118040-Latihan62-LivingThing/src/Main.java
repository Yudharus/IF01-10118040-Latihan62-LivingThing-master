/*
 * NAMA              : Moch Yudha Rusdian
 * KELAS             : IF-01
 * NIM               : 10118040
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan cara kerja abstract class dan abstract method  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Rizki Adam Kurniawan");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
        System.out.println("Developed By Moch Yudha Rusdian");

    }

}
