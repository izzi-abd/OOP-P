/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PenjualanBarang;

/**
 *
 * @author 13.7454
 */
public class Barang {
    private String kode;
    private String nama;
    private double harga;
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }

    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }
    
    
    
}
