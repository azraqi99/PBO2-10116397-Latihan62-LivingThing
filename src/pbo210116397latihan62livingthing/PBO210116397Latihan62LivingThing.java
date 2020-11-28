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
public class PBO210116397Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human hm = new Human();
        hm.setNama("Muhammad Azraqi Saputra");
        hm.walk(hm.getNama());
        hm.breath(hm.getNama());
        hm.eat(hm.getNama());
    }
    
}
