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
public class DatasetResep {
    private ArrayList <Integer> idresep;
    private ArrayList <Integer> noberobat;
    private ArrayList <String> tgl;
    private  ArrayList <Integer> idobat;
    private ArrayList <String> namaobat;
    private ArrayList <String> jml;
    
    public DatasetResep(){
       idresep = new ArrayList<Integer>();
        noberobat= new ArrayList<Integer>();
        tgl= new ArrayList<String>();
        idobat= new ArrayList<Integer>();
        namaobat= new ArrayList<String>();
        jml= new ArrayList<String>();
    }
    
     public void idresep( int x){
    idresep.add(x);
    }
    
    public ArrayList<Integer> getDatasetidresep(){
        return this.idresep;
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
    
     public void jml( String value){
    jml.add(value);
    }
    
    public ArrayList<String> getDatasetjml(){
        return this.jml;
    }
    
    public void tambahData(int idresep, int noberobat, String tgl, int idobat, String namaobat, String jml) {
        this.idresep.add(idresep);
        this.noberobat.add(noberobat);
        this.tgl.add(tgl);
        this.idobat.add(idobat);
        this.namaobat.add(namaobat);
        this.jml.add(jml);
}
}
