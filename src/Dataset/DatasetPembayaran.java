/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class DatasetPembayaran {
    private ArrayList <Integer> idbayar;
    private  ArrayList <Integer> noberobat;
    private ArrayList <String> tgl;
    private ArrayList <String> jasa;
    private ArrayList <String> total;
    private ArrayList <String> bayar;
    private ArrayList <String> kembali;
    
    public DatasetPembayaran(){
        idbayar= new ArrayList<Integer>();
       noberobat= new ArrayList<Integer>();
       tgl= new ArrayList<String>();
        jasa= new ArrayList<String>();
        total= new ArrayList<String>();
        bayar= new ArrayList<String>();
       kembali= new ArrayList<String>();
    }
    
     public void idbayar( int x){
    idbayar.add(x);
    }
    
    public ArrayList<Integer> getDatasetidbayar(){
        return this.idbayar;
    }
    
     public void noberobat( int x){
    noberobat.add(x);
    }
    
    public ArrayList<Integer> getDatasetnoberobat(){
        return this.noberobat;
    }
    
    public void tgl( String value){
    tgl.add(value);
    }
    
    public ArrayList<String> getDatasettgl(){
        return this.tgl;
    }
    
    public void jasa( String value){
    jasa.add(value);
    }
    
    public ArrayList<String> getDatasetjasa(){
        return this.jasa;
    }
    public void total( String value){
   total.add(value);
    }
    
    public ArrayList<String> getDatasettotal(){
        return this.total;
    }
    
    public void bayar( String value){
    bayar.add(value);
    }
    
    public ArrayList<String> getDatasetbayar(){
        return this.bayar;
    }
    
    public void kembali( String value){
    kembali.add(value);
    }
    
    public ArrayList<String> getDatasetkembali(){
        return this.kembali;
    }
    
    public void tambahData(int idbayar, int noberobat, String tgl, String jasa, String total, String kembali) {
        this.idbayar.add(idbayar);
        this.noberobat.add(noberobat);
        this.tgl.add(tgl);
        this.jasa.add(jasa);
        this.total.add(total);
        this.kembali.add(kembali);
    }
}
