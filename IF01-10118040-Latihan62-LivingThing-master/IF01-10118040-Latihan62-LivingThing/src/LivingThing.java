/*
 * NAMA              : Moch Yudha Rusdian   
 * KELAS             : IF-01
 * NIM               : 10118040
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan cara kerja abstract class dan abstract method    
 */

/**
 *
 * @author Fatahillah Seno
 */
public abstract class LivingThing {

    public abstract void walk(String nama);

    public void breath(String nama) {
        System.out.println(nama + " Bernafas");
    }

    public void eat(String nama) {
        System.out.println(nama + " Makan");
    }
}
