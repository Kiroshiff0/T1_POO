/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1_poo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class T1_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        private String nombrecompleto;
        private String tipodoc ;
        private String nrodoc;
        private Date fechanacimiento;
        private String tiposangre;
        private List <String> alergias;
        
    public T1_POO(String nombrecompleto, String tipodoc, String nrodoc, Date fechanacimiento, String tiposangre, List alergias) {
        this.nombrecompleto = nombrecompleto;
        this.tipodoc = tipodoc;
        this.nrodoc = nrodoc;
        this.fechanacimiento = fechanacimiento;
        this.tiposangre = tiposangre;
        this.alergias = alergias;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getNrodoc() {
        return nrodoc;
    }

    public void setNrodoc(String nrodoc) {
        this.nrodoc = nrodoc;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getTiposangre() {
        return tiposangre;
    }

    public void setTiposangre(String tiposangre) {
        this.tiposangre = tiposangre;
    }

    public List getAlergias() {
        return alergias;
    }

    public void setAlergias(List alergias) {
        this.alergias = alergias;
    }
    
    
}

    


