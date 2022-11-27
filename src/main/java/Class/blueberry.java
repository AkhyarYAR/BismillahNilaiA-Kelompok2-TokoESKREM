/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * Class blueberry (subclassdari class menu)
 * memiliki atribut blueberry dan saubTotal
 * 
 */
public class blueberry extends menu {
    private int blueberry = 0;
    private int subTotal = 0;
    
    /**
    * Memanggil constractor tanpa parameter
    */
    public blueberry(){
        super();
    }
    
    /**
    * memanggil constractor dgn parameter
    * @param nama
    * @param harga
    */
    public blueberry(String nama, int harga){
        super(nama,harga);
    }
    
    /**
    * method getter untuk mengakses nilai variable blueberry
    * @return
    */
    public int getBlueberry(){
       return this.blueberry;
    }
   
    /**
    * method setter untuk mengubah nilai variable blueberry
    * @param jumlah
    */
    public void setBlueberry(int jumlah){
       this.blueberry = jumlah;
    }
    
    /**
    * menambah jumlah es krim rasa blueberry
    */
    public void addBlueberry(){
        this.blueberry += 1;
    }
    
    /**
    * mengurangi jumlah es krim blueberry
    */
    public void minBlueberry(){
        this.blueberry -= 1;
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

