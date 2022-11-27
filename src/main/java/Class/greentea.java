/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * Class greentea (subclass dari class menu)
 * memiliki atributgreentea dan subTotal
 * 
 */
public class greentea extends menu {
    private int greentea = 0;
    private int subTotal = 0;
    
    /**
    * Memanggil constractor tanpa parameter
    */
    public greentea(){
        super();
    }
    
    /**
    * memanggil constractor dgn parameter
    * @param nama
    * @param harga
    */
    public greentea(String nama, int harga){
        super(nama,harga);
    }
    
    /**
    * method getter untuk mengakses nilai variable greentea
    * @return
    */
    public int getGreentea(){
       return this.greentea;
    }
   
   /**
    * method setter untuk mengubah nilai variable greentea
    * @param jumlah
    */
    public void setGreentea(int jumlah){
       this.greentea = jumlah;
    }
    
    /**
    * menambah jumlah greentea
    */
    public void addGreentea(){
        this.greentea += 1;
    }
    
    /**
    * mengurangi jumlah greentea
    */
    public void minGreentea(){
        this.greentea -= 1;
    }
    
    /**
    * mengembalikan nilai sub total
    * @return
    */
    public int getSubTotal(){
       return this.subTotal;
   }
   
   /**
   * mengubah nilai sub Total
   * @param totalHarga
   */
   public void setSubTotal(int totalHarga){
       this.subTotal = totalHarga;
   }
    
    /**
    * mengembalikan harga sesuai dengan jumlah pesanan
    * @param jumlah
    * @param harga
    * @return
    * Override untuk menjalankan method abstrak
    */
    @Override
    public int getTotal(int jumlah, int harga){
        int temp = harga * jumlah;
        this.subTotal += temp;
        return temp;
    }
}
