/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nurrahmimaulida.pkg2110010416;

/**
 *
 * @author user
 */
public class rekammedis {
    private int idpasien;
    private String keluhan;
    private String diagnosis;
    private String tindakan;
    
    public rekammedis (){
    }
    
     public void setidpasien(int idpasien){
    this.idpasien= idpasien;
    }
    public int getidpasien(){
    return this.idpasien;
    }
    
     public void setkeluhan(String keluhan){
    this.keluhan= keluhan;
    }
    public String getkeluhan(){
    return this.keluhan;
    }
    
     public void setdiagnosis(String diagnosis){
    this.diagnosis= diagnosis;
    }
    public String getdiagnosis(){
    return this.diagnosis;
    }
    
     public void settindakan(String tindakan){
    this.tindakan= tindakan;
    }
    public String gettindakan(){
    return this.tindakan;
    }
}
