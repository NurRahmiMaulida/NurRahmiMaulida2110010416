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
public class DatasetKaryawan {
    private ArrayList <Integer> idkaryawan;
    private ArrayList <String> namakaryawan;
    private ArrayList <String> jenkelkaryawan;
    private ArrayList <String> alamatkaryawan;
    private ArrayList <String> notelpkaryawan;
    private ArrayList <String> jabkaryawan;
    private ArrayList <String> unamekaryawan;
    private ArrayList <String> passkaryawan;
    private ArrayList <String> fotokaryawan;
    
    public DatasetKaryawan(){
        idkaryawan= new ArrayList<Integer>();
        namakaryawan= new ArrayList<String>();
        jenkelkaryawan= new ArrayList<String>();
        alamatkaryawan= new ArrayList<String>();
        notelpkaryawan= new ArrayList<String>();
        jabkaryawan= new ArrayList<String>();
        unamekaryawan= new ArrayList<String>();
        passkaryawan= new ArrayList<String>();
        fotokaryawan= new ArrayList<String>();
    }
    
     public void idkaryawan( int x){
    idkaryawan.add(x);
    }
    
    public ArrayList<Integer> getDatasetidkaryawan(){
        return this.idkaryawan;
    }
    
     public void namakarywan( String value){
    namakaryawan.add(value);
    }
    
    public ArrayList<String> getDatasetnamakaryawan(){
        return this.namakaryawan;
    }
    
     public void jenkelkaryawan( String value){
    jenkelkaryawan.add(value);
    }
    
    public ArrayList<String> getDatasetjenkelkaryawan(){
        return this.jenkelkaryawan;
    }
    
     public void alamatkaryawan( String value){
    alamatkaryawan.add(value);
    }
    
    public ArrayList<String> getDatasetalamatkaryawan(){
        return this.alamatkaryawan;
    }
    
     public void notelpkaryawan( String value){
    notelpkaryawan.add(value);
    }
    
    public ArrayList<String> getDatasetnotelpkaryawan(){
        return this.notelpkaryawan;
    }
    
     public void jabkaryawan( String value){
    jabkaryawan.add(value);
    }
    
    public ArrayList<String> getDatasetjabkaryawan(){
        return this.jabkaryawan;
    }
    
     public void unamekaryawan( String value){
    unamekaryawan.add(value);
    }
    
    public ArrayList<String> getDatasetunamekaryawan(){
        return this.unamekaryawan;
    }
    
     public void passkaryawan( String value){
    passkaryawan.add(value);
    }
    
    public ArrayList<String> getDatasetpasskaryawan(){
        return this.passkaryawan;
    }
    
     public void fotokaryawan (String value){
    fotokaryawan.add(value);
    }
    
    public ArrayList<String> getDatasetfotokaryawan(){
        return this.fotokaryawan;
    }
    
    public void tambahData(int idkaryawan, String namakaryawan, String jenkelkaryawan, String alamatkaryawan, String notelpkaryawan, String jabkaryawan, String unamekaryawan, String passkaryawan, String fotokaryawan) {
        this.idkaryawan.add(idkaryawan);
        this.namakaryawan.add(namakaryawan);
        this.jenkelkaryawan.add(jenkelkaryawan);
        this.alamatkaryawan.add(alamatkaryawan);
        this.notelpkaryawan.add(notelpkaryawan);
        this.jabkaryawan.add(jabkaryawan);
        this.unamekaryawan.add(unamekaryawan);
        this.passkaryawan.add(passkaryawan);
        this.fotokaryawan.add(fotokaryawan);
    }
}
