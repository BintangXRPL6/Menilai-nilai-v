/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdadakan;

import java.util.Scanner;

/**
 *
 * @author moklet
 */
public class input extends hitung
{
    
    public static void main(String[] args) 
    {
        input show = new input();
        show.tampil();
    }
    
    
    private int total;
    public void tampil()
    {
        Scanner input = new Scanner(System.in);
        int q,w,e,r,t;
        System.out.print("Masukan nilai ke-1 : ");q = input.nextInt();
        System.out.print("Masukan nilai ke-2 : ");w = input.nextInt();
        System.out.print("Masukan nilai ke-3 : ");e = input.nextInt();
        System.out.print("Masukan nilai ke-4 : ");r = input.nextInt();
        System.out.print("Masukan nilai ke-5 : ");t = input.nextInt();
        nilai(q);
        nilai(w);
        nilai(e);
        nilai(r);
        nilai(t);
        
    }
    
    
    
}
