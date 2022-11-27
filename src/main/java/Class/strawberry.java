/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * Class strawberry (subclass dari class menu)
 * memiliki atribut strawberry dan subTotal
 * 
 */
public class strawberry extends menu {
    private int strawberry = 0;
    private int subTotal = 0;
    
    /**
    * Memanggil constractor tanpa parameter
    */
    public strawberry(){
        super();
    }
    
    /**
    * memanggil constractor dgn parameter
    * @param nama
    * @param harga
    */
    public strawberry(String nama, int harga){
        super(nama,harga);
    }
    
    /**
    * method getter untuk mengakses nilai variable strawberry
    * @return
    */
    public int getStrawberry(){
       return this.strawberry;
    }
   
   /**
    * method setter untuk mengubah nilai variable strawberry
    * @param jumlah
    */
    public void setStrawberry(int jumlah){
       this.strawberry = jumlah;
    }
    
    /**
    * menambah jumlah strawberry
    */
    public void addStrawberry(){
        this.strawberry += 1;
    }
    
    /**
    * mengurangi jumlah strawberry
    */
    public void minStrawberry(){
        this.strawberry -= 1;
    }
    
    **
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
