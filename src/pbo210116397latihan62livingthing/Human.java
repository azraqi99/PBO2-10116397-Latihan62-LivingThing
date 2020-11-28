/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Living Thing
 */
package pbo210116397latihan62livingthing;

/**
 *
 * @author Zetro
 */
public class Human extends LivingThing{
    
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void walk(String nama) {
        System.out.println(nama + " sedang berjalan ");
    }
    
}
