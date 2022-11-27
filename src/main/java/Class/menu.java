/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * Class menu (merupakan class abstrak)
 * memiliki atribut jumlahPesanan, nama, dan harga
 */
public abstract class menu {
   private int jumlahPesan;
   private String nama;
   private int harga;
   
   /**
   * memanggil constractor tanpa parameter
   */
   public menu(){
    
   }
   
   /**
   * memanggil constractor dgn parameter
   * @param nama
   * @param harga
   */
   public menu(String nama, int harga){
    this.nama = nama;
    this.harga = harga;
   }
   
   /**
   * method getter untuk mengakses nilai variable jumlah pesanan
   */
   public int getJumlahPesan(){
       return this.jumlahPesan;
   }
   
   /**
   * method setter untuk mengubah nilai variable jumlah pesanan
   * @param jumlah
   */
   public void setJumlahPesan(int jumlah){
       this.jumlahPesan = jumlah;
   }
   
   /**
   * method getter untuk mengakses isi string nama
   */
   public String getNama(){
       return this.nama;
   }
   
   /**
   * method setter untuk mengubah isi string nama
   * @param nama
   */
   public void setNama(String nama){
       this.nama = nama;
   }
   
   /**
   * method getter harga untuk mengakses nilai variable harga
   * @return
   */
   public int getHarga(){
       return this.harga;
   }
   
   /**
   * method setter harga untuk mengubah nilai variable harga
   * @param harga
   */
   public void setHarga(int harga){
       this.harga = harga;
   }
   
   /**
   * method abstrak
   * mengembalikan nilai harga sesuai dengan jumlah pesanan
   * @param harga
   * @param jumlah
   */
   abstract int getTotal(int harga, int jumlah);
   
   
   
   
  
   
}
