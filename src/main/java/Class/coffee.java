/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USER DK
 */
public class coffee extends menu {
    private int coffee = 0;
    private int subTotal = 0;
    
    public coffee(){
        super();
    }
    public coffee(String nama, int harga){
        super(nama,harga);
    }
    
    public int getCoffee(){
       return this.coffee;
    }
   
    public void setCoffee(int jumlah){
       this.coffee = jumlah;
    }
    
    public void addCoffee(){
        this.coffee += 1;
    }
    
    public void minCoffee(){
        this.coffee -= 1;
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
