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
public class DatasetPasien {
    private ArrayList <Integer> idpasien;
    private ArrayList <String> namapasien;
    private ArrayList <String> tgllhrpasien;
    private ArrayList <String> jkpasien;
    private ArrayList <String> alamatpasien;
    private ArrayList <String> telppasien;
    private ArrayList <String> tgldftrpasien;
    
    public DatasetPasien(){
        idpasien= new ArrayList<Integer>();
       namapasien= new ArrayList<String>();
        tgllhrpasien= new ArrayList<String>();
       jkpasien= new ArrayList<String>();
       alamatpasien= new ArrayList<String>();
        telppasien= new ArrayList<String>();
        tgldftrpasien= new ArrayList<String>();
    }
    
    public void idpasien( int x){
    idpasien.add(x);
    }
    
    public ArrayList<Integer> getDatasetidpasien(){
        return this.idpasien;
    }
    
     public void namapasien( String value){
    namapasien.add(value);
    }
    
    public ArrayList<String> getDatasetnamapasien(){
        return this.namapasien;
    }
    
     public void tgllhrpasien( String value){
    tgllhrpasien.add(value);
    }
    
    public ArrayList<String> getDatasettgllhrpasien(){
        return this.tgllhrpasien;
    }
    
     public void jkpasien( String value){
    jkpasien.add(value);
    }
    
    public ArrayList<String> getDatasetjkpasien(){
        return this.jkpasien;
    }
    
     public void alamatpasien( String value){
    alamatpasien.add(value);
    }
    
    public ArrayList<String> getDatasetalamatpasien(){
        return this.alamatpasien;
    }
    
     public void telppasien( String value){
    telppasien.add(value);
    }
    
    public ArrayList<String> getDatasettelppasien(){
        return this.telppasien;
    }
    
     public void tgldftrpasien( String value){
    tgldftrpasien.add(value);
    }
    
    public ArrayList<String> getDatasettgldftrpasien(){
        return this.tgldftrpasien;
    }
    
        public void tambahData(int idpasien, String namapasien, String tgllhrpasien, String jkpasien, String alamatpasien, String telppasien, String tgldftrpasien) {
        this.idpasien.add(idpasien);
        this.namapasien.add(namapasien);
        this.tgllhrpasien.add(tgllhrpasien);
        this.jkpasien.add(jkpasien);
        this.alamatpasien.add(alamatpasien);
        this.telppasien.add(telppasien);
        this.tgldftrpasien.add(tgldftrpasien);
    }
}
