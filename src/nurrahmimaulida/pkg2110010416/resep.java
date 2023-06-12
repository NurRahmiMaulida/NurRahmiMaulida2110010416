/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nurrahmimaulida.pkg2110010416;

/**
 *
 * @author user
 */
public class resep {
    private int idresep;
    private int noberobat;
    private String tgl;
    private int idobat;
    private String namaobat;
    private String jml;
    
    public resep(){
    }
    
    public void setidresep(int idresep){
    this.idresep= idresep;
    }
    public int getidresep(){
    return this.idresep;
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
    
     public void setidobat(int idobat){
    this.idobat= idobat;
    }
    public int getidobat(){
    return this.idobat;
    }
    
     public void setinamaobat (String namaobat){
    this.namaobat= namaobat;
    }
    public String namaobat(){
    return this.namaobat;
    }
    
     public void setjml(String jml){
    this.jml= jml;
    }
    public String getjml(){
    return this.jml;
    }
}
