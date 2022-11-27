/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USER DK
 */
public class blueberry extends menu {
    private int blueberry = 0;
    private int subTotal = 0;
    
    public blueberry(){
        super();
    }
    
    public blueberry(String nama, int harga){
        super(nama,harga);
    }
    
    public int getBlueberry(){
       return this.blueberry;
    }
   
    public void setBlueberry(int jumlah){
       this.blueberry = jumlah;
    }
    
    public void addBlueberry(){
        this.blueberry += 1;
    }
    
    public void minBlueberry(){
        this.blueberry -= 1;
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

