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
public class DatasetRekammedisdetail {
    private ArrayList <Integer> noberobat;
    private ArrayList <String> tgl;
    private ArrayList <Integer> idpasien;
    private ArrayList <String> poli;
    private ArrayList <String> jenispemeriksaan;
    private ArrayList <String> keluhan;
    private ArrayList <String> suhu;
    private ArrayList <String> tb;
    private ArrayList <String> bb;
    private ArrayList <String> lingkarperut;
    private ArrayList <String> imt;
    private ArrayList <String> sistole;
    private ArrayList <String> diastole;
    private ArrayList <String> respiratoryrate;
    private ArrayList <String> heartrate;
    
    public DatasetRekammedisdetail(){
       noberobat= new ArrayList<Integer>();
       tgl= new ArrayList<String>();
       idpasien= new ArrayList<Integer>();
       poli= new ArrayList<String>();
      jenispemeriksaan = new ArrayList<String>();
      keluhan = new ArrayList<String>();
       suhu = new ArrayList<String>();
       tb = new ArrayList<String>();
       bb = new ArrayList<String>();
      lingkarperut = new ArrayList<String>();
      imt = new ArrayList<String>();
      sistole = new ArrayList<String>();
      diastole= new ArrayList<String>();
      respiratoryrate= new ArrayList<String>();
      heartrate= new ArrayList<String>();
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
    
    public void idpasien( int x){
    idpasien.add(x);
    }
    
    public ArrayList<Integer> getDatasetidpasien(){
        return this.idpasien;
    }
    
    public void poli( String value){
  poli.add(value);
    }
    
    public ArrayList<String> getDatasetpoli(){
        return this.poli;
    }
    
    public void jenispemeriksaan( String value){
   jenispemeriksaan.add(value);
    }
    
    public ArrayList<String> getDatasetjenispemeriksaan(){
        return this.jenispemeriksaan;
    }
    public void keluhan( String value){
   keluhan.add(value);
    }
    
    public ArrayList<String> getDatasetkeluhan(){
        return this.keluhan;
    }
    
    public void suhu( String value){
   suhu.add(value);
    }
    
    public ArrayList<String> getDatasetsuhu(){
        return this.suhu;
    }
    
    public void tb( String value){
   tb.add(value);
    }
    
    public ArrayList<String> getDatasettb(){
        return this.tb;
    }
    
    public void bb( String value){
   bb.add(value);
    }
    
    public ArrayList<String> getDatasetbb(){
        return this.bb;
    }
    
    public void lingkarperut( String value){
   lingkarperut.add(value);
    }
    
    public ArrayList<String> getDatasetlingkarperut(){
        return this.lingkarperut;
    }
    
    public void imt( String value){
   imt.add(value);
    }
    
    public ArrayList<String> getDatasetimt(){
        return this.imt;
    }
    
    public void sistole( String value){
   sistole.add(value);
    }
    
    public ArrayList<String> getDatasetsistole(){
        return this.sistole;
    }
    
    public void diastole( String value){
   diastole.add(value);
    }
    
    public ArrayList<String> getDatasetdiastole(){
        return this.diastole;
    }
    
    public void respiratoryrate( String value){
   respiratoryrate.add(value);
    }
    
    public ArrayList<String> getDatasetrespiratoryrate(){
        return this.respiratoryrate;
    }
    
    public void heartrate ( String value){
   heartrate.add(value);
    }
    
    public ArrayList<String> getDatasetheartrate(){
        return this.heartrate;
    }
    
    public void tambahData(int noberobat, String tgl, int idpasien, String poli, String jenispemeriksaan, String keluhan, String suhu, String tb, String bb, String lingkarperut, String imt, String sistole, String diastole, String respiratoryrate, String heartrate ) {
        this.noberobat.add(noberobat);
        this.tgl.add(tgl);
        this.idpasien.add(idpasien);
        this.poli.add(poli);
        this.jenispemeriksaan.add(jenispemeriksaan);
        this.keluhan.add(keluhan);
        this.suhu.add(suhu);
        this.tb.add(tb);
        this.bb.add(bb);
        this.lingkarperut.add(lingkarperut);
        this.imt.add(imt);
        this.sistole.add(sistole);
        this.diastole.add(diastole);
        this. respiratoryrate.add(respiratoryrate);
        this.heartrate.add(heartrate);
    }
}
