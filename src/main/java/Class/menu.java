/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * 
 * @author USER DK
 */
public abstract class menu {
   private int jumlahPesan;
   private String nama;
   private int harga;
   
   
   public menu(){
    
   }
   public menu(String nama, int harga){
    this.nama = nama;
    this.harga = harga;
   }
   
   public int getJumlahPesan(){
       return this.jumlahPesan;
   }
   
   public void setJumlahPesan(int jumlah){
       this.jumlahPesan = jumlah;
   }
   
   public String getNama(){
       return this.nama;
   }
   
   public void setNama(String nama){
       this.nama = nama;
   }
   
   public int getHarga(){
       return this.harga;
   }
   
   public void setHarga(int harga){
       this.harga = harga;
   }
   
   abstract int getTotal(int harga, int jumlah);
   
   
   
   
  
   
}
