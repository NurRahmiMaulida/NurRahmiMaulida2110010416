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
public class DatasetRekammedis {
    private ArrayList <Integer> idpasien;
    private  ArrayList <String> keluhan;
    private  ArrayList <String> diagnosis;
    private ArrayList <String> tindakan;
    
    public DatasetRekammedis(){
       idpasien= new ArrayList<Integer>();
        keluhan= new ArrayList<String>();
        diagnosis= new ArrayList<String>();
        tindakan= new ArrayList<String>();
    }
    
     public void idpasien( int x){
    idpasien.add(x);
    }
    
    public ArrayList<Integer> getDatasetidpasien(){
        return this.idpasien;
    }
    
     public void keluhan( String value){
    keluhan.add(value);
    }
    
    public ArrayList<String> getDatasetkeluhan(){
        return this.keluhan;
    }
    
     public void diagnosis( String value){
    diagnosis.add(value);
    }
    
    public ArrayList<String> getDatasetdiagnosis(){
        return this.diagnosis;
    }
    
     public void tindakan( String value){
    tindakan.add(value);
    }
    
    public ArrayList<String> getDatasettindakan(){
        return this.tindakan;
    }
    
     public void tambahData(int idpasien, String keluhan, String diagnosis, String tindakan) {
        this.idpasien.add(idpasien);
        this.keluhan.add(keluhan);
        this.diagnosis.add(diagnosis);
        this.tindakan.add(tindakan);
     }
}
