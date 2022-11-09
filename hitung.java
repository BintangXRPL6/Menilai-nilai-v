/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdadakan;

/**
 *
 * @author moklet
 */
public class hitung {
    
    private double hasil;
    public double GetHasil(){return hasil;}
    
    
    public void nilai(int a)
    {
        if (a < 60) {
            System.out.println("Nilai kamu "+a+" adalah kurang baik");
        }
        
        else if (a < 70) {
            System.out.println("Nilai kamu "+a+" adalah cukup");
        }
        
        else if (a < 80) {
            System.out.println("Nilai kamu "+a+" adalah baik");
        }
        
        else if (a < 100) {
            System.out.println("Nilai kamu "+a+" adalah Luar Binasa");
        }
    }
}
