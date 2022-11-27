/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * Class coffee (subclass dari class menu)
 * memiliki atribut coffee dan subTotal
 * 
 */
public class coffee extends menu {
    private int coffee = 0;
    private int subTotal = 0;
    
    /**
    * Memanggil constractor tanpa parameter
    */
    public coffee(){
        super();
    }
    
    /**
    * memanggil constractor dgn parameter
    * @param nama
    * @param harga
    */
    public coffee(String nama, int harga){
        super(nama,harga);
    }
    
    /**
    * method getter untuk mengakses nilai variable Coffee
    * @return
    */
    public int getCoffee(){
       return this.coffee;
    }
   
    /**
    * method setter untuk mengubah nilai variable Coffee
    * @param jumlah
    */
    public void setCoffee(int jumlah){
       this.coffee = jumlah;
    }
    
    /**
    * menambah jumlah Coffee
    */
    public void addCoffee(){
        this.coffee += 1;
    }
    
    /**
    * mengurangi jumlah Coffee
    */
    public void minCoffee(){
        this.coffee -= 1;
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
