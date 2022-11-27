/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USER DK
 */
public class vanilla extends menu {
    private int vanilla = 0;
    private int subTotal = 0;
    
    public vanilla(){
        super();
    }
    
    public vanilla(String nama, int harga){
        super(nama,harga);
    }
    
    public int getVanilla(){
       return this.vanilla;
    }
   
    public void setVanilla(int jumlah){
       this.vanilla = jumlah;
    }
    
    public void addVanilla(){
        this.vanilla += 1;
    }
    
    public void minVanilla(){
        this.vanilla -= 1;
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

