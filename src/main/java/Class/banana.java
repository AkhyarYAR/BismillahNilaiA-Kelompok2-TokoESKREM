/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * Class banana (subclass dari clas menu)
 * memiliki atribut banana dan subTotal
 * 
 */
public class banana extends menu {
    private int banana = 0;
    private int subTotal = 0;
    
    /**
     * memanggil konstaktor tanpa parameter
     */
    public banana(){
        super();
    }
    
    /**
     * memanggil konstaktor dgn parameter
     * @param nama
     * @param harga
     */
    public banana(String nama, int harga){
        super(nama,harga);
    }
    
    /**
     * method getter untuk mengakses nilai variable banana
     * @return
     */
    public int getBanana(){
       return this.banana;
    }
   
    /**
     * method setter untuk mengubah nilai variable banana
     * @param jumlah
     */
    public void setBanana(int jumlah){
       this.banana = jumlah;
    }
    
    /**
     * menambah jumlah es krim rasa banana
     */
    public void addBanana(){
        this.banana += 1;
    }
    
    /**
     * mengurangi jumlah es krim banana
     */
    public void minBanana(){
        this.banana -= 1;
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
