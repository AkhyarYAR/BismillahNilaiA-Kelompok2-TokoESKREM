/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USER DK
 */
public class chocolate extends menu {
    private int chocolate = 0;
    private int subTotal = 0;
    
    public chocolate(){
        super();
    }
    
    public chocolate(String nama, int harga){
        super(nama,harga);
    }
    
    public int getChocolate(){
       return this.chocolate;
    }
   
    public void setChocolate(int jumlah){
       this.chocolate = jumlah;
    }
    
    public void addChocolate(){
        this.chocolate += 1;
    }
    
    public void minChocolate(){
        this.chocolate -= 1;
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

