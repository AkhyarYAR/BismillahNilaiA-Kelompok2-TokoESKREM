/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USER DK
 */
public class strawberry extends menu {
    private int strawberry = 0;
    private int subTotal = 0;
    
    public strawberry(){
        super();
    }
    
    public strawberry(String nama, int harga){
        super(nama,harga);
    }
    
    public int getStrawberry(){
       return this.strawberry;
    }
   
    public void setStrawberry(int jumlah){
       this.strawberry = jumlah;
    }
    
    public void addStrawberry(){
        this.strawberry += 1;
    }
    
    public void minStrawberry(){
        this.strawberry -= 1;
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