/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USER DK
 */
public class cheese extends menu {
    private int cheese = 0;
    private int subTotal = 0;
    
    public cheese(){
        super();
    }
    
    public cheese(String nama, int harga){
        super(nama,harga);
    }
    
    public int getCheese(){
       return this.cheese;
    }
   
    public void setCheese(int jumlah){
       this.cheese = jumlah;
    }
    
    public void addCheese(){
        this.cheese += 1;
    }
    
    public void minCheese(){
        this.cheese -= 1;
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