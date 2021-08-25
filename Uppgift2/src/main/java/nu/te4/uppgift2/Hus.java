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
public class Hus {
    protected int våningar;
    protected String adress;
    protected double längd;
    protected double bredd;
    
    public void Hus (int våningar, String adress, double längd, double bredd){
        this.våningar = våningar;
        this.adress = adress;
        this.bredd = bredd;
        this.längd = längd;
    }
    
    public double area(double längd, double bredd){
        double area = längd * bredd;
        return area;
    }
}
