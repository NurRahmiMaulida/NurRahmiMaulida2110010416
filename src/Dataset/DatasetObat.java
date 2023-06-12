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
public class DatasetObat {
    private ArrayList<Integer> idobat;
    private ArrayList<String> namaobat;
    private ArrayList<String> bentukobat;
    private ArrayList<String>indikasiobat;
    private ArrayList<String>tglexp;
    private ArrayList<String> hargaobat;
    private ArrayList<String> satuanobat;
    private ArrayList<String> stokobat;
    
    public DatasetObat() {
        idobat= new ArrayList<Integer>();
        namaobat= new ArrayList<String>();
        bentukobat= new ArrayList<String>();
        indikasiobat= new ArrayList<String>();
        tglexp= new ArrayList<String>();
        hargaobat= new ArrayList<String>();
        satuanobat= new ArrayList<String>();
        stokobat= new ArrayList<String>();
           
    }
    
    public void idobat( int x){
    idobat.add(x);
    }
    
    public ArrayList<Integer> getDatasetidobat(){
        return this.idobat;
    }
    
     public void namaobat( String value){
    namaobat.add(value);
    }
    
    public ArrayList<String> getDatasetnamaobat(){
        return this.namaobat;
    }
    
     public void bentukobat( String value){
    bentukobat.add(value);
    }
    
    public ArrayList<String> getDatasetbentukobat(){
        return this.bentukobat;
    }
    
     public void indikasiobat( String value){
    indikasiobat.add(value);
    }
    
    public ArrayList<String> getDatasetindikasiobat(){
        return this.indikasiobat;
    }
    
     public void tglexp( String value){
    tglexp.add(value);
    }
    
    public ArrayList<String> getDatasettglexp(){
        return this.tglexp;
    }
    
     public void hargaobat( String value){
    hargaobat.add(value);
    }
    
    public ArrayList<String> getDatasethargaobat(){
        return this.hargaobat;
    }
    
     public void satuanobat( String value){
    satuanobat.add(value);
    }
    
    public ArrayList<String> getDatasetsatuanobat(){
        return this.satuanobat;
    }
    
     public void stokobat( String value){
    stokobat.add(value);
    }
    
    public ArrayList<String> getDatasetstokobat(){
        return this.stokobat;
    }
    
    public void tambahData(int idobat, String namaobat, String bentukobat, String indikasiobat, String tglexp, String hargaobat, String satuanobat, String stokobat) {
        this.idobat.add(idobat);
        this.namaobat.add(namaobat);
        this.bentukobat.add(bentukobat);
        this.indikasiobat.add(indikasiobat);
        boolean add = this.tglexp.add(tglexp);
        this.hargaobat.add(hargaobat);
        this.satuanobat.add(satuanobat);
        this.stokobat.add(stokobat);
    }
}
