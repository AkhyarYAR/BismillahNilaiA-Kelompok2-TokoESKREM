/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * Class chocolate (subclass dari class menu)
 * memiliki atribut chocolate dan subTotal
 * 
 */
public class chocolate extends menu {
    private int chocolate = 0;
    private int subTotal = 0;
    
    /**
    * Memanggil constractor tanpa parameter
    */
    public chocolate(){
        super();
    }
    
    **
    * memanggil constractor dgn parameter
    * @param nama
    * @param harga
    */
    public chocolate(String nama, int harga){
        super(nama,harga);
    }
    
    /**
    * method getter untuk mengakses nilai variable Chocolate
    * @return
    */
    public int getChocolate(){
       return this.chocolate;
    }
   
   /**
    * method setter untuk mengubah nilai variable Chocolate
    * @param jumlah
    */
    public void setChocolate(int jumlah){
       this.chocolate = jumlah;
    }
    
    /**
    * menambah jumlah Chocolate
    */
    public void addChocolate(){
        this.chocolate += 1;
    }
    
    /**
    * mengurangi jumlah Chocolate
    */
    public void minChocolate(){
        this.chocolate -= 1;
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

