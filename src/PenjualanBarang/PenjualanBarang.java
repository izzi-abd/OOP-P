/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PenjualanBarang;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
/**
 *
 * @author 13.7454
 */
public class PenjualanBarang {
    static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Barang> ListProduk = new ArrayList<Barang>();
        String jawaban;
        
        do {
            System.out.println("Jenis barang (1 (Produk Kaleng)/2 (Produk Kemasan Plastik)) : ");
            int jenis = Integer.parseInt(in.nextLine());
            
            if(jenis==1) {
                ProdukKaleng pk = new ProdukKaleng();
                ListProduk.add(pk);
                System.out.print("Kode Barang : ");
                pk.setKode(in.nextLine());
                System.out.print("Nama : ");
                pk.setNama(in.nextLine());
                System.out.print("Harga : ");
                pk.setHarga(Double.parseDouble(in.nextLine()));
                System.out.print("Berat : ");
                pk.setBerat(Double.parseDouble(in.nextLine()));
                System.out.print("Kadaluarsa : ");
                try{
                    pk.setKadaluarsa(new SimpleDateFormat("dd/MM/yyyy").parse(in.nextLine()));
                } catch(ParseException ex) {
                    System.out.println("Tanggal salah");
                }
            } else if(jenis==2) {
                ProdukKemasanPlastik pkp = new ProdukKemasanPlastik();
                ListProduk.add(pkp);
                System.out.print("Kode Barang : ");
                pkp.setKode(in.nextLine());
                System.out.print("Nama : ");
                pkp.setNama(in.nextLine());
                System.out.print("Harga : ");
                pkp.setHarga(Double.parseDouble(in.nextLine()));
                System.out.print("Kadaluarsa : ");
                try{
                    pkp.setKadaluarsa(new SimpleDateFormat("dd/MM/yyyy").parse(in.nextLine()));
                } catch(ParseException ex) {
                    System.out.println("Tanggal salah");
                }    
            } else {
                System.out.println("Input jenis barang yang dimasukkan salah! Hanya menerima angka 1 atau 2");
            }
            
                System.out.print("Masukkan lagi (y/n)? : ");
                jawaban = in.nextLine();
        } while(jawaban.equals("y"));
        
        //print entire ArrayList
        for(Barang item : ListProduk) {
        if(item instanceof ProdukKaleng) {
            ProdukKaleng pk = (ProdukKaleng) item;
            System.out.println();
            System.out.println("Kode : " +pk.getKode());
            System.out.println("Nama : " +pk.getNama());
            System.out.println("Harga : " +pk.getHarga());
            System.out.println("Berat : " +pk.getBerat());
            System.out.println("Kadaluarsa : " +pk.getKadaluarsa());
        } else if(item instanceof ProdukKemasanPlastik) {
            ProdukKemasanPlastik pkp = (ProdukKemasanPlastik) item;
            System.out.println();
            System.out.println("Kode : " +pkp.getKode());
            System.out.println("Nama : " +pkp.getNama());
            System.out.println("Harga : " +pkp.getHarga());
        }   
        }
        
    }
    
    
}
