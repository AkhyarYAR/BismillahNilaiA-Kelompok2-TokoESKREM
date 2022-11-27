/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Class.banana;
import Class.blueberry;
import Class.cheese;
import Class.chocolate;
import Class.coffee;
import Class.cookies;
import Class.greentea;
import Class.strawberry;
import Class.vanilla;

/**
 *
 * @author USER DK
 */
public class Struk extends javax.swing.JFrame {
    
    private static int total;
    private static banana b;
    private static blueberry bl;
    private static cheese cis;
    private static chocolate choc;
    private static coffee cf;
    private static cookies ck;
    private static greentea gt;
    private static strawberry st;
    private static vanilla van;
    
    /**
     * Creates new form Struk
     */
    public Struk(banana b, blueberry bl, cheese cis, chocolate choc, coffee cf, cookies ck, greentea gt, strawberry st, vanilla van,int total) {
        initComponents();
        this.total = total;
        this.b = b;
        this.bl = bl;
        this.cis = cis;
        this.choc = choc;
        this.cf = cf;
        this.ck = ck;
        this.gt = gt;
        this.st = st;
        this.van = van;
        cetakStruk();
        totalharga.setText(String.valueOf(this.total));
    }
    private void cetakStruk(){
        if (b.getBanana() > 0 || bl.getBlueberry() > 0 || cis.getCheese() > 0 || choc.getChocolate() > 0 || cf.getCoffee() > 0 || ck.getCookies() > 0 || gt.getGreentea() > 0 || st.getStrawberry() > 0 || van.getVanilla() > 0) {
            if(this.b.getBanana() > 0 || bl.getBlueberry() > 0 || cis.getCheese() > 0 || choc.getChocolate() > 0 || cf.getCoffee() > 0 || ck.getCookies() > 0 || gt.getGreentea() > 0 || st.getStrawberry() > 0 || van.getVanilla() > 0){
                if(b.getBanana() <= 0){
                    item1.setText("");
                    q1.setText("");
                    h1.setText("");
                } else if (b.getBanana() > 0) {
                    item1.setText(b.getNama());
                    q1.setText(String.valueOf(b.getBanana()));
                    h1.setText(String.valueOf(b.getSubTotal()));
                }
                
                item2.setText("");
                q2.setText("");
                h2.setText("");

                item3.setText("");
                q3.setText("");
                h3.setText("");

                item4.setText("");
                q4.setText("");
                h4.setText("");

                item5.setText("");
                q5.setText("");
                h5.setText("");

                item6.setText("");
                q6.setText("");
                h6.setText("");

                item7.setText("");
                q7.setText("");
                h7.setText("");

                item8.setText("");
                q8.setText("");
                h8.setText("");

                item9.setText("");
                q9.setText("");
                h9.setText("");
                if(this.bl.getBlueberry() > 0){
                    item2.setText(bl.getNama());
                    q2.setText(String.valueOf(bl.getBlueberry()));
                    h2.setText(String.valueOf(bl.getSubTotal()));
                    if(this.van.getVanilla() > 0){
                        item3.setText(van.getNama());
                        q3.setText(String.valueOf(van.getVanilla()));
                        h3.setText(String.valueOf(van.getSubTotal()));
                        if(this.choc.getChocolate() > 0){
                            item4.setText(choc.getNama());
                            q4.setText(String.valueOf(choc.getChocolate()));
                            h4.setText(String.valueOf(choc.getSubTotal()));
                            if(this.gt.getGreentea() > 0){
                                item5.setText(gt.getNama());
                                q5.setText(String.valueOf(gt.getGreentea()));
                                h5.setText(String.valueOf(gt.getSubTotal()));
                                if(this.st.getStrawberry() > 0){
                                    item6.setText(st.getNama());
                                    q6.setText(String.valueOf(st.getStrawberry()));
                                    h6.setText(String.valueOf(st.getSubTotal()));
                                } else {
                                    item6.setText("");
                                    q6.setText("");
                                    h6.setText("");
                                }
                                if(this.cis.getCheese() > 0){
                                    item7.setText(cis.getNama());
                                    q7.setText(String.valueOf(cis.getCheese()));
                                    h7.setText(String.valueOf(cis.getSubTotal()));
                                    if(this.cf.getCoffee() > 0){
                                        item8.setText(cf.getNama());
                                        q8.setText(String.valueOf(cf.getCoffee()));
                                        h8.setText(String.valueOf(cf.getSubTotal()));
                                        if(this.ck.getCookies() > 0){
                                            item9.setText(ck.getNama());
                                            q9.setText(String.valueOf(ck.getCookies()));
                                            h9.setText(String.valueOf(ck.getSubTotal()));
                                        } else {
                                            item9.setText("");
                                            q9.setText("");
                                            h9.setText("");
                                        }
                                    } else if(this.ck.getCookies() > 0){
                                        item8.setText(ck.getNama());
                                        q8.setText(String.valueOf(ck.getCookies()));
                                        h8.setText(String.valueOf(ck.getSubTotal()));
                                    } else{
                                        item8.setText("");
                                        q8.setText("");
                                        h8.setText("");
                                    }
                                }else if(this.cf.getCoffee() > 0){
                                    item7.setText(cf.getNama());
                                    q7.setText(String.valueOf(cf.getCoffee()));
                                    h7.setText(String.valueOf(cf.getSubTotal()));
                                    if(this.ck.getCookies() > 0){
                                        item8.setText(ck.getNama());
                                        q8.setText(String.valueOf(ck.getCookies()));
                                        h8.setText(String.valueOf(ck.getSubTotal()));
                                    } else{
                                        item8.setText("");
                                        q8.setText("");
                                        h8.setText("");
                                    }
                                } else if(this.ck.getCookies() > 0){
                                    item7.setText(ck.getNama());
                                    q7.setText(String.valueOf(ck.getCookies()));
                                    h7.setText(String.valueOf(ck.getSubTotal()));
                                } else{
                                    item7.setText("");
                                    q7.setText("");
                                    h7.setText("");
                                }  
                            } else if(this.st.getStrawberry() > 0){
                                item5.setText(st.getNama());
                                q5.setText(String.valueOf(st.getStrawberry()));
                                h5.setText(String.valueOf(st.getSubTotal()));
                            } else {
                                item5.setText("");
                                q5.setText("");
                                h5.setText("");
                            }
                            if(this.cis.getCheese() > 0){
                                item6.setText(cis.getNama());
                                q6.setText(String.valueOf(cis.getCheese()));
                                h6.setText(String.valueOf(cis.getSubTotal()));
                                if(this.cf.getCoffee() > 0){
                                    item7.setText(cf.getNama());
                                    q7.setText(String.valueOf(cf.getCoffee()));
                                    h7.setText(String.valueOf(cf.getSubTotal()));
                                    if(this.ck.getCookies() > 0){
                                        item8.setText(ck.getNama());
                                        q8.setText(String.valueOf(ck.getCookies()));
                                        h8.setText(String.valueOf(ck.getSubTotal()));
                                    } else {
                                        item8.setText("");
                                        q8.setText("");
                                        h8.setText("");
                                    }
                                } else if(this.ck.getCookies() > 0){
                                    item7.setText(ck.getNama());
                                    q7.setText(String.valueOf(ck.getCookies()));
                                    h7.setText(String.valueOf(ck.getSubTotal()));
                                } else{
                                    item7.setText("");
                                    q7.setText("");
                                    h7.setText("");
                                }
                            }else if(this.cf.getCoffee() > 0){
                                item6.setText(cf.getNama());
                                q6.setText(String.valueOf(cf.getCoffee()));
                                h6.setText(String.valueOf(cf.getSubTotal()));
                                if(this.ck.getCookies() > 0){
                                    item7.setText(ck.getNama());
                                    q7.setText(String.valueOf(ck.getCookies()));
                                    h7.setText(String.valueOf(ck.getSubTotal()));
                                } else{
                                    item7.setText("");
                                    q7.setText("");
                                    h7.setText("");
                                }
                            } else if(this.ck.getCookies() > 0){
                                item6.setText(ck.getNama());
                                q6.setText(String.valueOf(ck.getCookies()));
                                h6.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }
                            
                        } else if(this.gt.getGreentea() > 0){
                            item5.setText(st.getNama());
                            q5.setText(String.valueOf(gt.getGreentea()));
                            h5.setText(String.valueOf(gt.getSubTotal()));
                            if(this.st.getStrawberry() > 0){
                                item6.setText(st.getNama());
                                q6.setText(String.valueOf(st.getStrawberry()));
                                h6.setText(String.valueOf(st.getSubTotal()));
                            } else {
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }
                            
                            if(this.cis.getCheese() > 0){
                                item7.setText(cis.getNama());
                                q7.setText(String.valueOf(cis.getCheese()));
                                h7.setText(String.valueOf(cis.getSubTotal()));
                                if(this.cf.getCoffee() > 0){
                                    item8.setText(cf.getNama());
                                    q8.setText(String.valueOf(cf.getCoffee()));
                                    h8.setText(String.valueOf(cf.getSubTotal()));
                                    if(this.ck.getCookies() > 0){
                                        item9.setText(ck.getNama());
                                        q9.setText(String.valueOf(ck.getCookies()));
                                        h9.setText(String.valueOf(ck.getSubTotal()));
                                    } else {
                                        item9.setText("");
                                        q9.setText("");
                                        h9.setText("");
                                    }
                                } else if(this.ck.getCookies() > 0){
                                    item8.setText(ck.getNama());
                                    q8.setText(String.valueOf(ck.getCookies()));
                                    h8.setText(String.valueOf(ck.getSubTotal()));
                                } else{
                                    item8.setText("");
                                    q8.setText("");
                                    h8.setText("");
                                }
                            }else if(this.cf.getCoffee() > 0){
                                item7.setText(cf.getNama());
                                q7.setText(String.valueOf(cf.getCoffee()));
                                h7.setText(String.valueOf(cf.getSubTotal()));
                                if(this.ck.getCookies() > 0){
                                    item8.setText(ck.getNama());
                                    q8.setText(String.valueOf(ck.getCookies()));
                                    h8.setText(String.valueOf(ck.getSubTotal()));
                                } else{
                                    item8.setText("");
                                    q8.setText("");
                                    h8.setText("");
                                }
                            } else if(this.ck.getCookies() > 0){
                                item7.setText(ck.getNama());
                                q7.setText(String.valueOf(ck.getCookies()));
                                h7.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item7.setText("");
                                q6.setText("");
                                h6.setText("");
                            }
                          
                        } else if(this.st.getStrawberry() > 0){
                            item5.setText(st.getNama());
                            q5.setText(String.valueOf(st.getStrawberry()));
                            h5.setText(String.valueOf(st.getSubTotal()));
                        } else {
                            item5.setText("");
                            q5.setText("");
                            h5.setText("");
                        }
                        if(this.cis.getCheese() > 0){
                            item6.setText(cis.getNama());
                            q6.setText(String.valueOf(cis.getCheese()));
                            h6.setText(String.valueOf(cis.getSubTotal()));
                            if(this.cf.getCoffee() > 0){
                                item7.setText(cf.getNama());
                                q7.setText(String.valueOf(cf.getCoffee()));
                                h7.setText(String.valueOf(cf.getSubTotal()));
                                if(this.ck.getCookies() > 0){
                                    item8.setText(ck.getNama());
                                    q8.setText(String.valueOf(ck.getCookies()));
                                    h8.setText(String.valueOf(ck.getSubTotal()));
                                } else {
                                    item8.setText("");
                                    q8.setText("");
                                    h8.setText("");
                                }
                            } else if(this.ck.getCookies() > 0){
                                item7.setText(ck.getNama());
                                q7.setText(String.valueOf(ck.getCookies()));
                                h7.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item7.setText("");
                                q7.setText("");
                                h7.setText("");
                            }
                        }else if(this.cf.getCoffee() > 0){
                            item6.setText(cf.getNama());
                            q6.setText(String.valueOf(cf.getCoffee()));
                            h6.setText(String.valueOf(cf.getSubTotal()));
                            if(this.ck.getCookies() > 0){
                                item7.setText(ck.getNama());
                                q7.setText(String.valueOf(ck.getCookies()));
                                h7.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item7.setText("");
                                q7.setText("");
                                h7.setText("");
                            }
                        } else if(this.ck.getCookies() > 0){
                            item6.setText(ck.getNama());
                            q6.setText(String.valueOf(ck.getCookies()));
                            h6.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item6.setText("");
                            q6.setText("");
                            h6.setText("");
                        }
                        
                    } else if(this.choc.getChocolate() > 0){
                        item3.setText(choc.getNama());
                        q3.setText(String.valueOf(choc.getChocolate()));
                        h3.setText(String.valueOf(choc.getSubTotal()));
                        if(this.gt.getGreentea() > 0){
                            item4.setText(gt.getNama());
                            q4.setText(String.valueOf(gt.getGreentea()));
                            h4.setText(String.valueOf(gt.getSubTotal()));
                            if(this.st.getStrawberry() > 0){
                                item5.setText(st.getNama());
                                q5.setText(String.valueOf(st.getStrawberry()));
                                h5.setText(String.valueOf(st.getSubTotal()));
                            } else {
                                item5.setText("");
                                q5.setText("");
                                h5.setText("");
                            }
                            if(this.cis.getCheese() > 0){
                                item6.setText(cis.getNama());
                                q6.setText(String.valueOf(cis.getCheese()));
                                h6.setText(String.valueOf(cis.getSubTotal()));
                                if(this.cf.getCoffee() > 0){
                                    item7.setText(cf.getNama());
                                    q7.setText(String.valueOf(cf.getCoffee()));
                                    h7.setText(String.valueOf(cf.getSubTotal()));
                                    if(this.ck.getCookies() > 0){
                                        item8.setText(ck.getNama());
                                        q8.setText(String.valueOf(ck.getCookies()));
                                        h8.setText(String.valueOf(ck.getSubTotal()));
                                    } else {
                                        item8.setText("");
                                        q8.setText("");
                                        h8.setText("");
                                    }
                                } else if(this.ck.getCookies() > 0){
                                    item7.setText(ck.getNama());
                                    q7.setText(String.valueOf(ck.getCookies()));
                                    h7.setText(String.valueOf(ck.getSubTotal()));
                                } else{
                                    item7.setText("");
                                    q7.setText("");
                                    h7.setText("");
                                }
                            }else if(this.cf.getCoffee() > 0){
                                item6.setText(cf.getNama());
                                q6.setText(String.valueOf(cf.getCoffee()));
                                h6.setText(String.valueOf(cf.getSubTotal()));
                                if(this.ck.getCookies() > 0){
                                    item7.setText(ck.getNama());
                                    q7.setText(String.valueOf(ck.getCookies()));
                                    h7.setText(String.valueOf(ck.getSubTotal()));
                                } else{
                                    item7.setText("");
                                    q7.setText("");
                                    h7.setText("");
                                }
                            } else if(this.ck.getCookies() > 0){
                                item6.setText(ck.getNama());
                                q6.setText(String.valueOf(ck.getCookies()));
                                h6.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }  
                        } else if(this.st.getStrawberry() > 0){
                            item4.setText(st.getNama());
                            q4.setText(String.valueOf(st.getStrawberry()));
                            h4.setText(String.valueOf(st.getSubTotal()));
                        } else {
                            item4.setText("");
                            q4.setText("");
                            h4.setText("");
                        }
                        if(this.cis.getCheese() > 0){
                            item5.setText(cis.getNama());
                            q5.setText(String.valueOf(cis.getCheese()));
                            h5.setText(String.valueOf(cis.getSubTotal()));
                            if(this.cf.getCoffee() > 0){
                                item6.setText(cf.getNama());
                                q6.setText(String.valueOf(cf.getCoffee()));
                                h6.setText(String.valueOf(cf.getSubTotal()));
                                if(this.ck.getCookies() > 0){
                                    item7.setText(ck.getNama());
                                    q7.setText(String.valueOf(ck.getCookies()));
                                    h7.setText(String.valueOf(ck.getSubTotal()));
                                } else {
                                    item7.setText("");
                                    q7.setText("");
                                    h7.setText("");
                                }
                            } else if(this.ck.getCookies() > 0){
                                item6.setText(ck.getNama());
                                q6.setText(String.valueOf(ck.getCookies()));
                                h6.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }
                        }else if(this.cf.getCoffee() > 0){
                            item5.setText(cf.getNama());
                            q5.setText(String.valueOf(cf.getCoffee()));
                            h5.setText(String.valueOf(cf.getSubTotal()));
                            if(this.ck.getCookies() > 0){
                                item6.setText(ck.getNama());
                                q6.setText(String.valueOf(ck.getCookies()));
                                h6.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }
                        } else if(this.ck.getCookies() > 0){
                            item5.setText(ck.getNama());
                            q5.setText(String.valueOf(ck.getCookies()));
                            h5.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item5.setText("");
                            q5.setText("");
                            h5.setText("");
                        }
           
                    } else if(this.gt.getGreentea() > 0){
                        item3.setText(st.getNama());
                        q3.setText(String.valueOf(gt.getGreentea()));
                        h3.setText(String.valueOf(gt.getSubTotal()));
                        if(this.st.getStrawberry() > 0){
                            item4.setText(st.getNama());
                            q4.setText(String.valueOf(st.getStrawberry()));
                            h4.setText(String.valueOf(st.getSubTotal()));
                        } else {
                            item4.setText("");
                            q4.setText("");
                            h4.setText("");
                        }
                        
                        if(this.cis.getCheese() > 0){
                            item5.setText(cis.getNama());
                            q5.setText(String.valueOf(cis.getCheese()));
                            h5.setText(String.valueOf(cis.getSubTotal()));
                            if(this.cf.getCoffee() > 0){
                                item6.setText(cf.getNama());
                                q6.setText(String.valueOf(cf.getCoffee()));
                                h6.setText(String.valueOf(cf.getSubTotal()));
                                if(this.ck.getCookies() > 0){
                                    item7.setText(ck.getNama());
                                    q7.setText(String.valueOf(ck.getCookies()));
                                    h7.setText(String.valueOf(ck.getSubTotal()));
                                } else {
                                    item7.setText("");
                                    q7.setText("");
                                    h7.setText("");
                                }
                            } else if(this.ck.getCookies() > 0){
                                item6.setText(ck.getNama());
                                q6.setText(String.valueOf(ck.getCookies()));
                                h6.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }
                        }else if(this.cf.getCoffee() > 0){
                            item5.setText(cf.getNama());
                            q5.setText(String.valueOf(cf.getCoffee()));
                            h5.setText(String.valueOf(cf.getSubTotal()));
                            if(this.ck.getCookies() > 0){
                                item6.setText(ck.getNama());
                                q6.setText(String.valueOf(ck.getCookies()));
                                h6.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }
                        } else if(this.ck.getCookies() > 0){
                            item5.setText(ck.getNama());
                            q5.setText(String.valueOf(ck.getCookies()));
                            h5.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item5.setText("");
                            q5.setText("");
                            h5.setText("");
                        }
                      
                    } else if(this.st.getStrawberry() > 0){
                        item3.setText(st.getNama());
                        q3.setText(String.valueOf(st.getStrawberry()));
                        h3.setText(String.valueOf(st.getSubTotal()));
                    } else {
                        item3.setText("");
                        q3.setText("");
                        h3.setText("");
                    }
                    if(this.cis.getCheese() > 0){
                        item4.setText(cis.getNama());
                        q4.setText(String.valueOf(cis.getCheese()));
                        h4.setText(String.valueOf(cis.getSubTotal()));
                        if(this.cf.getCoffee() > 0){
                            item5.setText(cf.getNama());
                            q5.setText(String.valueOf(cf.getCoffee()));
                            h5.setText(String.valueOf(cf.getSubTotal()));
                            if(this.ck.getCookies() > 0){
                                item.setText(ck.getNama());
                                q6.setText(String.valueOf(ck.getCookies()));
                                h6.setText(String.valueOf(ck.getSubTotal()));
                            } else {
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }
                        } else if(this.ck.getCookies() > 0){
                            item5.setText(ck.getNama());
                            q5.setText(String.valueOf(ck.getCookies()));
                            h5.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item5.setText("");
                            q5.setText("");
                            h5.setText("");
                        }
                    }else if(this.cf.getCoffee() > 0){
                        item4.setText(cf.getNama());
                        q4.setText(String.valueOf(cf.getCoffee()));
                        h4.setText(String.valueOf(cf.getSubTotal()));
                        if(this.ck.getCookies() > 0){
                            item5.setText(ck.getNama());
                            q5.setText(String.valueOf(ck.getCookies()));
                            h5.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item5.setText("");
                            q5.setText("");
                            h5.setText("");
                        }
                    } else if(this.ck.getCookies() > 0){
                        item4.setText(ck.getNama());
                        q4.setText(String.valueOf(ck.getCookies()));
                        h4.setText(String.valueOf(ck.getSubTotal()));
                    } else{
                        item4.setText("");
                        q4.setText("");
                        h4.setText("");
                    }
                    
                } else if(this.van.getVanilla() > 0){
                    item2.setText(van.getNama());
                    q2.setText(String.valueOf(van.getVanilla()));
                    h2.setText(String.valueOf(van.getSubTotal()));
                    if(this.choc.getChocolate() > 0){
                        item3.setText(choc.getNama());
                        q3.setText(String.valueOf(choc.getChocolate()));
                        h3.setText(String.valueOf(choc.getSubTotal()));
                        if(this.gt.getGreentea() > 0){
                            item4.setText(gt.getNama());
                            q4.setText(String.valueOf(gt.getGreentea()));
                            h4.setText(String.valueOf(gt.getSubTotal()));
                            if(this.st.getStrawberry() > 0){
                                item5.setText(st.getNama());
                                q5.setText(String.valueOf(st.getStrawberry()));
                                h5.setText(String.valueOf(st.getSubTotal()));
                            } else {
                                item5.setText("");
                                q5.setText("");
                                h5.setText("");
                            }
                            // taburan
                            if(this.cis.getCheese() > 0){
                                item6.setText(cis.getNama());
                                q6.setText(String.valueOf(cis.getCheese()));
                                h6.setText(String.valueOf(cis.getSubTotal()));
                                if(this.cf.getCoffee() > 0){
                                    item7.setText(cf.getNama());
                                    q7.setText(String.valueOf(cf.getCoffee()));
                                    h7.setText(String.valueOf(cf.getSubTotal()));
                                    if(this.ck.getCookies() > 0){
                                        item8.setText(ck.getNama());
                                        q8.setText(String.valueOf(ck.getCookies()));
                                        h8.setText(String.valueOf(ck.getSubTotal()));
                                    } else {
                                        item8.setText("");
                                        q8.setText("");
                                        h8.setText("");
                                    }
                                } else if(this.ck.getCookies() > 0){
                                    item7.setText(ck.getNama());
                                    q7.setText(String.valueOf(ck.getCookies()));
                                    h7.setText(String.valueOf(ck.getSubTotal()));
                                } else{
                                    item7.setText("");
                                    q7.setText("");
                                    h7.setText("");
                                }
                            } else if(this.cf.getCoffee() > 0){
                                item6.setText(cf.getNama());
                                q6.setText(String.valueOf(cf.getCoffee()));
                                h6.setText(String.valueOf(cf.getSubTotal()));
                                if(this.ck.getCookies() > 0){
                                    item7.setText(ck.getNama());
                                    q7.setText(String.valueOf(ck.getCookies()));
                                    h7.setText(String.valueOf(ck.getSubTotal()));
                                } else{
                                    item7.setText("");
                                    q7.setText("");
                                    h7.setText("");
                                }
                            } else if(this.ck.getCookies() > 0){
                                item6.setText(ck.getNama());
                                q6.setText(String.valueOf(ck.getCookies()));
                                h6.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }  
                        } else if(this.st.getStrawberry() > 0){
                            item4.setText(st.getNama());
                            q4.setText(String.valueOf(st.getStrawberry()));
                            h4.setText(String.valueOf(st.getSubTotal()));
                        } else {
                            item4.setText("");
                            q4.setText("");
                            h4.setText("");
                        }
                        if(this.cis.getCheese() > 0){
                            item5.setText(cis.getNama());
                            q5.setText(String.valueOf(cis.getCheese()));
                            h5.setText(String.valueOf(cis.getSubTotal()));
                            if(this.cf.getCoffee() > 0){
                                item6.setText(cf.getNama());
                                q6.setText(String.valueOf(cf.getCoffee()));
                                h6.setText(String.valueOf(cf.getSubTotal()));
                                if(this.ck.getCookies() > 0){
                                    item7.setText(ck.getNama());
                                    q7.setText(String.valueOf(ck.getCookies()));
                                    h7.setText(String.valueOf(ck.getSubTotal()));
                                } else {
                                    item7.setText("");
                                    q7.setText("");
                                    h7.setText("");
                                }
                            } else if(this.ck.getCookies() > 0){
                                item6.setText(ck.getNama());
                                q6.setText(String.valueOf(ck.getCookies()));
                                h6.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }
                        }else if(this.cf.getCoffee() > 0){
                            item5.setText(cf.getNama());
                            q5.setText(String.valueOf(cf.getCoffee()));
                            h5.setText(String.valueOf(cf.getSubTotal()));
                            if(this.ck.getCookies() > 0){
                                item6.setText(ck.getNama());
                                q6.setText(String.valueOf(ck.getCookies()));
                                h6.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }
                        } else if(this.ck.getCookies() > 0){
                            item5.setText(ck.getNama());
                            q5.setText(String.valueOf(ck.getCookies()));
                            h5.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item5.setText("");
                            q5.setText("");
                            h5.setText("");
                        }
                        
                    } else if(this.gt.getGreentea() > 0){
                        item4.setText(st.getNama());
                        q4.setText(String.valueOf(gt.getGreentea()));
                        h4.setText(String.valueOf(gt.getSubTotal()));
                        if(this.st.getStrawberry() > 0){
                            item5.setText(st.getNama());
                            q5.setText(String.valueOf(st.getStrawberry()));
                            h5.setText(String.valueOf(st.getSubTotal()));
                        } else {
                            item5.setText("");
                            q5.setText("");
                            h5.setText("");
                        }
                        // tabura6
                        if(this.cis.getCheese() > 0){
                            item6.setText(cis.getNama());
                            q6.setText(String.valueOf(cis.getCheese()));
                            h6.setText(String.valueOf(cis.getSubTotal()));
                            if(this.cf.getCoffee() > 0){
                                item7.setText(cf.getNama());
                                q7.setText(String.valueOf(cf.getCoffee()));
                                h7.setText(String.valueOf(cf.getSubTotal()));
                                if(this.ck.getCookies() > 0){
                                    item8.setText(ck.getNama());
                                    q8.setText(String.valueOf(ck.getCookies()));
                                    h8.setText(String.valueOf(ck.getSubTotal()));
                                } else {
                                    item8.setText("");
                                    q8.setText("");
                                    h8.setText("");
                                }
                            } else if(this.ck.getCookies() > 0){
                                item7.setText(ck.getNama());
                                q7.setText(String.valueOf(ck.getCookies()));
                                h7.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item7.setText("");
                                q7.setText("");
                                h7.setText("");
                            }
                        }else if(this.cf.getCoffee() > 0){
                            item6.setText(cf.getNama());
                            q6.setText(String.valueOf(cf.getCoffee()));
                            h6.setText(String.valueOf(cf.getSubTotal()));
                            if(this.ck.getCookies() > 0){
                                item7.setText(ck.getNama());
                                q7.setText(String.valueOf(ck.getCookies()));
                                h7.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item7.setText("");
                                q7.setText("");
                                h7.setText("");
                            }
                        } else if(this.ck.getCookies() > 0){
                            item6.setText(ck.getNama());
                            q6.setText(String.valueOf(ck.getCookies()));
                            h6.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item6.setText("");
                            q6.setText("");
                            h6.setText("");
                        }
                      
                    } else if(this.st.getStrawberry() > 0){
                        item5.setText(st.getNama());
                        q5.setText(String.valueOf(st.getStrawberry()));
                        h5.setText(String.valueOf(st.getSubTotal()));
                    } else {
                        item5.setText("");
                        q5.setText("");
                        h5.setText("");
                    }
                    // taburan
                    if(this.cis.getCheese() > 0){
                        item6.setText(cis.getNama());
                        q6.setText(String.valueOf(cis.getCheese()));
                        h6.setText(String.valueOf(cis.getSubTotal()));
                        if(this.cf.getCoffee() > 0){
                            item7.setText(cf.getNama());
                            q7.setText(String.valueOf(cf.getCoffee()));
                            h7.setText(String.valueOf(cf.getSubTotal()));
                            if(this.ck.getCookies() > 0){
                                item8.setText(ck.getNama());
                                q8.setText(String.valueOf(ck.getCookies()));
                                h8.setText(String.valueOf(ck.getSubTotal()));
                            } else {
                                item8.setText("");
                                q8.setText("");
                                h8.setText("");
                            }
                        } else if(this.ck.getCookies() > 0){
                            item7.setText(ck.getNama());
                            q7.setText(String.valueOf(ck.getCookies()));
                            h7.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item7.setText("");
                            q7.setText("");
                            h7.setText("");
                        }
                    }else if(this.cf.getCoffee() > 0){
                        item6.setText(cf.getNama());
                        q6.setText(String.valueOf(cf.getCoffee()));
                        h6.setText(String.valueOf(cf.getSubTotal()));
                        if(this.ck.getCookies() > 0){
                            item7.setText(ck.getNama());
                            q7.setText(String.valueOf(ck.getCookies()));
                            h7.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item7.setText("");
                            q7.setText("");
                            h7.setText("");
                        }
                    } else if(this.ck.getCookies() > 0){
                        item6.setText(ck.getNama());
                        q6.setText(String.valueOf(ck.getCookies()));
                        h6.setText(String.valueOf(ck.getSubTotal()));
                    } else{
                        item6.setText("");
                        q6.setText("");
                        h6.setText("");
                    }
                    
                } else if(this.choc.getChocolate() > 0){
                    item2.setText(choc.getNama());
                    q2.setText(String.valueOf(choc.getChocolate()));
                    h2.setText(String.valueOf(choc.getSubTotal()));
                    if(this.gt.getGreentea() > 0){
                        item3.setText(gt.getNama());
                        q3.setText(String.valueOf(gt.getGreentea()));
                        h3.setText(String.valueOf(gt.getSubTotal()));
                        if(this.st.getStrawberry() > 0){
                            item4.setText(st.getNama());
                            q4.setText(String.valueOf(st.getStrawberry()));
                            h4.setText(String.valueOf(st.getSubTotal()));
                        } else {
                            item4.setText("");
                            q4.setText("");
                            h4.setText("");
                        }
                        if(this.cis.getCheese() > 0){
                            item5.setText(cis.getNama());
                            q5.setText(String.valueOf(cis.getCheese()));
                            h5.setText(String.valueOf(cis.getSubTotal()));
                            if(this.cf.getCoffee() > 0){
                                item6.setText(cf.getNama());
                                q6.setText(String.valueOf(cf.getCoffee()));
                                h6.setText(String.valueOf(cf.getSubTotal()));
                                if(this.ck.getCookies() > 0){
                                    item7.setText(ck.getNama());
                                    q7.setText(String.valueOf(ck.getCookies()));
                                    h7.setText(String.valueOf(ck.getSubTotal()));
                                } else {
                                    item7.setText("");
                                    q7.setText("");
                                    h7.setText("");
                                }
                            } else if(this.ck.getCookies() > 0){
                                item6.setText(ck.getNama());
                                q6.setText(String.valueOf(ck.getCookies()));
                                h6.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }
                        }else if(this.cf.getCoffee() > 0){
                            item5.setText(cf.getNama());
                            q5.setText(String.valueOf(cf.getCoffee()));
                            h5.setText(String.valueOf(cf.getSubTotal()));
                            if(this.ck.getCookies() > 0){
                                item6.setText(ck.getNama());
                                q6.setText(String.valueOf(ck.getCookies()));
                                h6.setText(String.valueOf(ck.getSubTotal()));
                            } else{
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }
                        } else if(this.ck.getCookies() > 0){
                            item5.setText(ck.getNama());
                            q5.setText(String.valueOf(ck.getCookies()));
                            h5.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item5.setText("");
                            q5.setText("");
                            h5.setText("");
                        }  
                    } else if(this.st.getStrawberry() > 0){
                        item3.setText(st.getNama());
                        q3.setText(String.valueOf(st.getStrawberry()));
                        h3.setText(String.valueOf(st.getSubTotal()));
                        
                    } else {
                        item3.setText("");
                        q3.setText("");
                        h3.setText("");
                    }
                    if(this.cis.getCheese() > 0){
                        item4.setText(cis.getNama());
                        q4.setText(String.valueOf(cis.getCheese()));
                        h4.setText(String.valueOf(cis.getSubTotal()));
                        if(this.cf.getCoffee() > 0){
                            item6.setText(cf.getNama());
                            q6.setText(String.valueOf(cf.getCoffee()));
                            h6.setText(String.valueOf(cf.getSubTotal()));
                            if(this.ck.getCookies() > 0){
                                item7.setText(ck.getNama());
                                q7.setText(String.valueOf(ck.getCookies()));
                                h7.setText(String.valueOf(ck.getSubTotal()));
                            } else {
                                item7.setText("");
                                q7.setText("");
                                h7.setText("");
                            }
                        } else if(this.ck.getCookies() > 0){
                            item6.setText(ck.getNama());
                            q6.setText(String.valueOf(ck.getCookies()));
                            h6.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item6.setText("");
                            q6.setText("");
                            h6.setText("");
                        }
                    }else if(this.cf.getCoffee() > 0){
                        item5.setText(cf.getNama());
                        q5.setText(String.valueOf(cf.getCoffee()));
                        h5.setText(String.valueOf(cf.getSubTotal()));
                        if(this.ck.getCookies() > 0){
                            item6.setText(ck.getNama());
                            q6.setText(String.valueOf(ck.getCookies()));
                            h6.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item6.setText("");
                            q6.setText("");
                            h6.setText("");
                        }
                    } else if(this.ck.getCookies() > 0){
                        item5.setText(ck.getNama());
                        q5.setText(String.valueOf(ck.getCookies()));
                        h5.setText(String.valueOf(ck.getSubTotal()));
                    } else{
                        item5.setText("");
                        q5.setText("");
                        h5.setText("");
                    }
    
                } else if(this.gt.getGreentea() > 0){
                    item2.setText(st.getNama());
                    q2.setText(String.valueOf(gt.getGreentea()));
                    h2.setText(String.valueOf(gt.getSubTotal()));
                    if(this.st.getStrawberry() > 0){
                        item3.setText(st.getNama());
                        q3.setText(String.valueOf(st.getStrawberry()));
                        h3.setText(String.valueOf(st.getSubTotal()));
                    } else {
                        item3.setText("");
                        q3.setText("");
                        h3.setText("");
                    }
                    
                    if(this.cis.getCheese() > 0){
                        item4.setText(cis.getNama());
                        q4.setText(String.valueOf(cis.getCheese()));
                        h4.setText(String.valueOf(cis.getSubTotal()));
                        if(this.cf.getCoffee() > 0){
                            item5.setText(cf.getNama());
                            q5.setText(String.valueOf(cf.getCoffee()));
                            h5.setText(String.valueOf(cf.getSubTotal()));
                            if(this.ck.getCookies() > 0){
                                item6.setText(ck.getNama());
                                q6.setText(String.valueOf(ck.getCookies()));
                                h6.setText(String.valueOf(ck.getSubTotal()));
                            } else {
                                item6.setText("");
                                q6.setText("");
                                h6.setText("");
                            }
                        } else if(this.ck.getCookies() > 0){
                            item5.setText(ck.getNama());
                            q5.setText(String.valueOf(ck.getCookies()));
                            h5.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item5.setText("");
                            q5.setText("");
                            h5.setText("");
                        }
                    }else if(this.cf.getCoffee() > 0){
                        item4.setText(cf.getNama());
                        q4.setText(String.valueOf(cf.getCoffee()));
                        h4.setText(String.valueOf(cf.getSubTotal()));
                        if(this.ck.getCookies() > 0){
                            item5.setText(ck.getNama());
                            q5.setText(String.valueOf(ck.getCookies()));
                            h5.setText(String.valueOf(ck.getSubTotal()));
                        } else{
                            item5.setText("");
                            q5.setText("");
                            h5.setText("");
                        }
                    } else if(this.ck.getCookies() > 0){
                        item4.setText(ck.getNama());
                        q4.setText(String.valueOf(ck.getCookies()));
                        h4.setText(String.valueOf(ck.getSubTotal()));
                    } else{
                        item4.setText("");
                        q4.setText("");
                        h4.setText("");
                    }
                  
                } else if(this.st.getStrawberry() > 0){
                    item2.setText(st.getNama());
                    q2.setText(String.valueOf(st.getStrawberry()));
                    h2.setText(String.valueOf(st.getSubTotal()));
                } else {
                    item2.setText("");
                    q2.setText("");
                    h2.setText("");
                }
                if(this.cis.getCheese() > 0){
                    item3.setText(cis.getNama());
                    q3.setText(String.valueOf(cis.getCheese()));
                    h3.setText(String.valueOf(cis.getSubTotal()));
                    if(this.cf.getCoffee() > 0){
                        item4.setText(cf.getNama());
                        q4.setText(String.valueOf(cf.getCoffee()));
                        h4.setText(String.valueOf(cf.getSubTotal()));
                        if(this.ck.getCookies() > 0){
                            item5.setText(ck.getNama());
                            q5.setText(String.valueOf(ck.getCookies()));
                            h5.setText(String.valueOf(ck.getSubTotal()));
                        } else {
                            item5.setText("");
                            q5.setText("");
                            h5.setText("");
                        }
                    } else if(this.ck.getCookies() > 0){
                        item4.setText(ck.getNama());
                        q4.setText(String.valueOf(ck.getCookies()));
                        h4.setText(String.valueOf(ck.getSubTotal()));
                    } else{
                        item4.setText("");
                        q4.setText("");
                        h4.setText("");
                    }
                }else if(this.cf.getCoffee() > 0){
                    item3.setText(cf.getNama());
                    q3.setText(String.valueOf(cf.getCoffee()));
                    h3.setText(String.valueOf(cf.getSubTotal()));
                    if(this.ck.getCookies() > 0){
                        item4.setText(ck.getNama());
                        q4.setText(String.valueOf(ck.getCookies()));
                        h4.setText(String.valueOf(ck.getSubTotal()));
                    } else{
                        item4.setText("");
                        q4.setText("");
                        h4.setText("");
                    }
                } else if(this.ck.getCookies() > 0){
                    item3.setText(ck.getNama());
                    q3.setText(String.valueOf(ck.getCookies()));
                    h3.setText(String.valueOf(ck.getSubTotal()));
                } else{
                    item3.setText("");
                    q3.setText("");
                    h3.setText("");
                }
            } else {
                item2.setText("");
                q2.setText("");
                h2.setText("");

                item3.setText("");
                q3.setText("");
                h3.setText("");

                item4.setText("");
                q4.setText("");
                h4.setText("");

                item5.setText("");
                q5.setText("");
                h5.setText("");

                item6.setText("");
                q6.setText("");
                h6.setText("");

                item7.setText("");
                q7.setText("");
                h7.setText("");

                item8.setText("");
                q8.setText("");
                h8.setText("");

                item9.setText("");
                q9.setText("");
                h9.setText("");
            }
        } else {
            item1.setText("Belum ada pesanan");
        }

        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalharga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        item = new javax.swing.JLabel();
        item2 = new javax.swing.JLabel();
        item1 = new javax.swing.JLabel();
        item4 = new javax.swing.JLabel();
        item3 = new javax.swing.JLabel();
        item6 = new javax.swing.JLabel();
        item5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        h4 = new javax.swing.JLabel();
        h3 = new javax.swing.JLabel();
        h6 = new javax.swing.JLabel();
        h5 = new javax.swing.JLabel();
        item8 = new javax.swing.JLabel();
        item7 = new javax.swing.JLabel();
        item9 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        h8 = new javax.swing.JLabel();
        h7 = new javax.swing.JLabel();
        h9 = new javax.swing.JLabel();
        exitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Struk Pembayaran");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("RECEIPT OF PAYMENT ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("ORDER             :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 70, 89, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("TOTAL PRICE  : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 129, -1, -1));

        totalharga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(totalharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 310, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 3, 12)); // NOI18N
        jLabel5.setText("SNOWCREAM ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 36, 37, -1));
        getContentPane().add(item, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 142, 37, -1));

        item2.setText("Item 2");
        getContentPane().add(item2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 20));

        item1.setText("Item 1");
        getContentPane().add(item1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, -1));

        item4.setText("Item 4");
        getContentPane().add(item4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, 20));

        item3.setText("Item 3");
        getContentPane().add(item3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 20));

        item6.setText("Item 6");
        getContentPane().add(item6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, 20));

        item5.setText("Item 5");
        getContentPane().add(item5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, -1));

        jLabel13.setText("QTY");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 68, 43, -1));

        jLabel14.setText("PRICE");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 68, 43, -1));

        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("2");
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 30, 20));

        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("1");
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 30, -1));

        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("4");
        getContentPane().add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 30, 20));

        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("3");
        getContentPane().add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 30, 20));

        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("6");
        getContentPane().add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 30, 20));

        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("5");
        getContentPane().add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 30, -1));

        jLabel27.setText("---------------------------------------------------------- +");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        h2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        h2.setText("0");
        getContentPane().add(h2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 70, 20));

        h1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        h1.setText("0");
        getContentPane().add(h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 70, -1));

        h4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        h4.setText("0");
        getContentPane().add(h4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 70, 20));

        h3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        h3.setText("0");
        getContentPane().add(h3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 70, 20));

        h6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        h6.setText("0");
        getContentPane().add(h6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 70, 20));

        h5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        h5.setText("0");
        getContentPane().add(h5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 70, -1));

        item8.setText("Item 8");
        getContentPane().add(item8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 20));

        item7.setText("Item 7");
        getContentPane().add(item7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 80, 20));

        item9.setText("Item 9");
        getContentPane().add(item9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, -1));

        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("8");
        getContentPane().add(q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 30, 20));

        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("7");
        getContentPane().add(q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 30, 20));

        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setText("9");
        getContentPane().add(q9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 30, -1));

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Rp.");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 30, -1));

        h8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        h8.setText("0");
        getContentPane().add(h8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 70, 20));

        h7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        h7.setText("0");
        getContentPane().add(h7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 70, 20));

        h9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        h9.setText("0");
        getContentPane().add(h9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 70, -1));

        exitbtn.setText("EXIT");
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbtnMouseClicked(evt);
            }
        });
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 369, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitbtnMouseClicked

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Struk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Struk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Struk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Struk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Struk(b, bl, cis, choc, cf, ck, gt, st, van,total).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h2;
    private javax.swing.JLabel h3;
    private javax.swing.JLabel h4;
    private javax.swing.JLabel h5;
    private javax.swing.JLabel h6;
    private javax.swing.JLabel h7;
    private javax.swing.JLabel h8;
    private javax.swing.JLabel h9;
    private javax.swing.JLabel item;
    private javax.swing.JLabel item1;
    private javax.swing.JLabel item2;
    private javax.swing.JLabel item3;
    private javax.swing.JLabel item4;
    private javax.swing.JLabel item5;
    private javax.swing.JLabel item6;
    private javax.swing.JLabel item7;
    private javax.swing.JLabel item8;
    private javax.swing.JLabel item9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JTextField totalharga;
    // End of variables declaration//GEN-END:variables
}
