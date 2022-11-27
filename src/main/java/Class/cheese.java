/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * Class cheeze (subclass dari class menu)
 * memiliki atribut cheese dan SubTotal
 */
public class cheese extends menu {
    private int cheese = 0;
    private int subTotal = 0;
    
    /**
    * memanggil constractor tanpa parameter
    */
    public cheese(){
        super();
    }
    
    /**
    * memanggil constractor dengan parameter
    * @param nama
    * @param harga
    */
    public cheese(String nama, int harga){
        super(nama,harga);
    }
    
    /**
    * method getter untuk mengakses nilai variable cheese
    * @return
    */
    public int getCheese(){
       return this.cheese;
    }
   
    /**
    * method setter untuk mengubah nilai variable cheese
    * @param jumlah
    */
    public void setCheese(int jumlah){
       this.cheese = jumlah;
    }
    
    /**
    * menambah jumlah cheese
    */
    public void addCheese(){
        this.cheese += 1;
    }
    
    /**
    * mengurangi jumlah cheese
    */
    public void minCheese(){
        this.cheese -= 1;
    }
    
    /**
    * mengembalikan nilai sub total
    * @return
    */
    public int getSubTotal(){
       return this.subTotal;
   }
    
    /**
    * mengubah nilai sub total
    * @param totalHarga
    */
   public void setSubTotal(int totalHarga){
       this.subTotal = totalHarga;
   }
    
    /**
    * mengembalikan harga sesuai dgn jumlah pesanan
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
