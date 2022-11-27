/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USER DK
 */
public class cookies extends menu {
    private int cookies = 0;
    private int subTotal = 0;
    
    public cookies(){
        super();
    }
    
    public cookies(String nama, int harga){
        super(nama,harga);
    }
    
    public int getCookies(){
       return this.cookies;
    }
   
    public void setCookies(int jumlah){
       this.cookies = jumlah;
    }
    
    public void addCookies(){
        this.cookies += 1;
    }
    
    public void minCookies(){
        this.cookies -= 1;
    }
    
    public int getSubTotal(){
       return this.subTotal;
   }
   public void setSubTotal(int totalHarga){
       this.subTotal = totalHarga;
   }
    
    @Override
    public int getTotal(int jumlah, int harga){
        int temp = harga * jumlah;
        this.subTotal += temp;
        return temp;
    }
}
