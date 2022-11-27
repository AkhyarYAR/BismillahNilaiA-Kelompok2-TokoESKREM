/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USER DK
 */
public class greentea extends menu {
    private int greentea = 0;
    private int subTotal = 0;
    
    public greentea(){
        super();
    }
    
    public greentea(String nama, int harga){
        super(nama,harga);
    }
    
    public int getGreentea(){
       return this.greentea;
    }
   
    public void setGreentea(int jumlah){
       this.greentea = jumlah;
    }
    
    public void addGreentea(){
        this.greentea += 1;
    }
    
    public void minGreentea(){
        this.greentea -= 1;
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
