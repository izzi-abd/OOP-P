/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PenjualanBarang;
import java.util.Date;
/**
 *
 * @author 13.7454
 */
public class ProdukMakanan extends Barang {
    private Date kadaluarsa;

    /**
     * @return the kadaluarsa
     */
    public Date getKadaluarsa() {
        return kadaluarsa;
    }

    /**
     * @param kadaluarsa the kadaluarsa to set
     */
    public void setKadaluarsa(Date kadaluarsa) {
        this.kadaluarsa = kadaluarsa;
    }
    
}
