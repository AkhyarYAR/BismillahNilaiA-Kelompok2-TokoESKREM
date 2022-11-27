/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * Class cookies (subclass dari class menu)
 * memiliki atribut cookies dan subTotal
 * 
 */
public class cookies extends menu {
    private int cookies = 0;
    private int subTotal = 0;
    
    /**
    * Memanggil constractor tanpa parameter
    */
    public cookies(){
        super();
    }
    
     /**
    * memanggil constractor dgn parameter
    * @param nama
    * @param harga
    */
    public cookies(String nama, int harga){
        super(nama,harga);
    }
    
    /**
    * method getter untuk mengakses nilai variable Cookies
    * @return
    */
    public int getCookies(){
       return this.cookies;
    }
    
    /**
    * method setter untuk mengubah nilai variable Cookies
    * @param jumlah
    */
    public void setCookies(int jumlah){
       this.cookies = jumlah;
    }
    
    /**
    * menambah jumlah Cookies
    */
    public void addCookies(){
        this.cookies += 1;
    }
    
    /**
    * mengurangi jumlah Cookies
    */
    public void minCookies(){
        this.cookies -= 1;
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
