/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nurrahmimaulida.pkg2110010416;

/**
 *
 * @author user
 */
public class pembayaran {
    private int idbayar;
    private int noberobat;
    private String tgl;
    private String jasa;
    private String total;
    private String bayar;
    private String kembali;
    public pembayaran(){
    }
    
     public void setidbayar(int idbayar){
    this.idbayar= idbayar;
    }
    public int getidbayar(){
    return this.idbayar;
    }
    
     public void setnoberobar(int noberobat){
    this.noberobat= noberobat;
    }
    public int getnoberobat(){
    return this.noberobat;
    }
    
    public void settgl(String tgl){
    this.tgl= tgl;
    }
    public String gettgl(){
    return this.tgl;
    }
    
    public void setjasa(String jasa){
    this.jasa= jasa;
    }
    public String getjasa(){
    return this.jasa;
    }
    
    public void settotal(String total){
    this.total= total;
    }
    public String gettotal(){
    return this.total;
    }
    
    public void setbayar(String bayar){
    this.bayar= bayar;
    }
    public String getbayar(){
    return this.bayar;
    }
   
    public void setkembali(String kembali){
    this.kembali= kembali;
    }
    public String getkembali(){
    return this.kembali;
    }
}
