/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indika66;

/**
 *
 * @author Dewi Galuh
 */
public class Indika66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int i,j,k,p,q,r;
    int n = 10;
    int yazz = n-1;
    for(i=0;i<n;i++) {
        for(j=0;j<yazz;j++) {
        System.out.print(" ");
        }
            for(k=0;k<=i;k++) {
            System.out.print("6 ");
            }
            yazz--;
            System.out.println();
            }
            yazz= 0;
            for(p=(n);p>0;p--) {
            for(q=0;q<yazz;q++) {
            System.out.print(" ");
            }
            for(r=0;r<p;r++) {
            System.out.print("6 ");
            }
            System.out.println();
            yazz++;
        }
    }
}

