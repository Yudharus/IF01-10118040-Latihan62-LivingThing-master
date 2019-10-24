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
public class Human extends LivingThing {

    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void walk(String nama) {
        System.out.println(nama + " Sedang berjalan");
    }

}
