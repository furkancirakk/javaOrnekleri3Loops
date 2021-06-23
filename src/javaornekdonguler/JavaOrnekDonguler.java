/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaornekdonguler;

/**
 *
 * @author zajigalka
 */
public class JavaOrnekDonguler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int sayi = 0;
        while (sayi<21){
            System.out.println(sayi);
            sayi = sayi+2;
        }*/
        /*int i = 10, j = 0, k = 0;
        while (i>j){
            System.out.println("i j'den büyüktür.");
            i = i-2;
            j = j+2;
            k++;
        }
        System.out.println("Artık büyük değildir.");
        System.out.println("***" + k + " kez döngüye girildi.***");*/
        /*int i = 0, toplam=0;
        do{
            toplam+=i;
            i++;
        }
        while(i<=100);
        System.out.println(toplam);*/
        int i=0, toplam=0;
            do {
            toplam+=i;
            i+=2;
	}
        while (i<=15);
	System.out.println(toplam);
        
    }
    
}
