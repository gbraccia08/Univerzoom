/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import data.Coordenada;
import java.math.*;

/**
 *
 * @author Gaia F. Braccia
 */
public class Calculadora_1  {
   private  double sin1;
   private  double sin2;
   private  double cos1;
   private  double cos2;

    public Calculadora_1(Coordenada c) {
     this.sin1=Math.sin(c.getAngulo1());
     this.sin2=Math.sin(c.getAngulo2());
     this.cos1=Math.cos(c.getAngulo1());
     this.cos2=Math.cos(c.getAngulo2());
    }

    public double getSin1() {
        return sin1;
    }

    public void setSin1(double sin1) {
        this.sin1 = sin1;
    }

    public double getSin2() {
        return sin2;
    }

    public void setSin2(double sin2) {
        this.sin2 = sin2;
    }

    public double getCos1() {
        return cos1;
    }

    public void setCos1(double cos1) {
        this.cos1 = cos1;
    }

    public double getCos2() {
        return cos2;
    }

    public void setCos2(double cos2) {
        this.cos2 = cos2;
    }

    public  Coordenada deHorizontalesAEcuatorialesHorarias(double lat, Coordenada co ){        //(a,A)---->(H,R)
        double sinLat = Math.sin(Math.toRadians(lat));
        double cosLat = Math.cos(Math.toRadians(lat));
        double ro=Math.asin(sinLat*sin1+cosLat*cos1*cos2);
        double H= Math.toDegrees(Math.acos((sin1-Math.sin(ro)*sinLat)/(Math.cos(ro)*cosLat)));
        if(Math.toDegrees(co.getAngulo2())<180){
            H =360-H;
        }
        
        Coordenada c=new Coordenada( Math.toDegrees(Math.toDegrees(ro)), Math.toDegrees(H));
        return c;
    }
    public Coordenada deEcuatorialesHorariasAHorizontales(double lat, Coordenada co){       //(H,R)---->(a,A)
        double sinLat = Math.sin(Math.toRadians(lat));
        double cosLat = Math.cos(Math.toRadians(lat));
        double a=Math.asin(sin2*sinLat+cos2*cosLat*cos1);
        double A= Math.toDegrees(Math.acos((sin2-Math.sin(a)*sinLat)/(Math.cos(a)*cosLat)));
        if(Math.toDegrees(co.getAngulo1())<180){
            A = 360-A;
        }
        Coordenada c=new Coordenada("horizontales", Math.toDegrees(A), Math.toDegrees(Math.toDegrees(a)));
        return c;
    }
public Coordenada deEcuatorialesHorariasAAbsolutas(double tslC, Coordenada co ){                      //(H,R)
     Coordenada c = new Coordenada ("ecuatoriales absolutas",tslC-co.getAngulo1(),co.getAngulo2());
     return c;
    }
 public Coordenada deAbsolutasAEcuatorialesHorarias(double tsl, Coordenada co ){                     //(a,R)
     Coordenada c = new Coordenada("ecuatorial horaria", tsl - co.getAngulo1(), co.getAngulo2());
     return c;
     }

public Coordenada deAbsolutasAEclipticas(Coordenada co){    //(a,R)
     double e = 23.45;
     double sinE=Math.sin(Math.toRadians(e));
     double cosE=Math.cos(Math.toRadians(e));
     
     double b = Math.asin(sin2*cosE-cos2*sinE*sin1);
     double p = sin2*sinE+cos2*cosE*sin1;
     double q = cos1*cos2;
     double y = Math.toDegrees(Math.atan(p/q));
     
     double pDeg=Math.toDegrees(p);
     double qDeg=Math.toDegrees(q);
     if((pDeg*qDeg<0 && qDeg<0)||(pDeg+qDeg<0)){
         y+=180;
     }else if(pDeg*qDeg<0 && qDeg>0){
         y+=360;
     }
     
     Coordenada c = new Coordenada("ecliptica", Math.toDegrees(y), Math.toDegrees(Math.toDegrees(b)));
     return c;
    }
public Coordenada deEcplipticasAAbsolutas(Coordenada co){   //(y,B)
     double e = 23.45;
     double sinE=Math.sin(Math.toRadians(e));
     double cosE=Math.cos(Math.toRadians(e));
     
     double ro = Math.asin(sin2*cosE+cos2*sinE*sin1);
     double p = cos2*cosE*cos1-sin2*sinE;
     double q = cos1*cos2;
     double a = Math.toDegrees(Math.atan(p/q));
     
     double pDeg=Math.toDegrees(p);
     double qDeg=Math.toDegrees(q);
     if((pDeg*qDeg<0 && qDeg<0)||(pDeg+qDeg<0)){
         a+=180;
     }else if(pDeg*qDeg<0 && qDeg>0){
         a+=360;
     }
     
     Coordenada c = new Coordenada("ecuatoriales absolutas", Math.toDegrees(a), Math.toDegrees(Math.toDegrees(ro)));
     return c;   
    }


 public static int[] aHoras(double grados){
      int[] coo = new int[3];
      double hora =(grados/15);
      double min = (hora-(int)hora)*60;
      double seg = (min-(int)min)*60;
      coo[0]= (int)hora;
      coo[1]= (int)min;
      coo[2]=(int)Math.round(seg);
      return coo;
    }
    
    public static double aGrados(double h, double m, double s){
       m+=s/60;
       h+=m/60;
       return h*15;
    }

    
    
   

}
