/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indikaa5;

/**
 *
 * @author Dewi Galuh
 */
public class Indikaa5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int p,q,r;
    int n = 10;
    int yazz = n;
        for(p=(n);p>0;p--)
        {
            for(q=0;q<yazz;q++)
            {
            System.out.print(" ");
            }
            for(r=0;r<p;r++)
            {
            System.out.print("5 ");
            }
            System.out.println();
            yazz++;
        }
    }
}
