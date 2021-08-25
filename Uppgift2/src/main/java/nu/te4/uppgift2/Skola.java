/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.uppgift2;

/**
 *
 * @author Elev
 */
public class Skola extends Hus{
    protected int Klassrum;
    
    public Skola (int Klassrum, String adress, int våningar, double längd, double bredd){
        super.Hus(våningar, adress, längd, bredd);
        this.Klassrum = Klassrum;
    }
    public double Snittyta(){
        double snittyta = (längd * bredd) / Klassrum;
        return snittyta;
    }
    
    public double antalKlassrum(){
        double antalKlassrum = Klassrum / våningar;
                System.out.println("sadasd");
        return antalKlassrum;
    }
}
