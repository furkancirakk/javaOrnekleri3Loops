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
        
	//0'dan 15'e kadar çift sayıların toplamı  
	/*int i=0, toplam=0;
            do {
            toplam+=i;
            i+=2;
	}
        while (i<=15);
	System.out.println(toplam);*/
	
	    
	//for & switch case together scenario    
	for (int i=1; i<=5; i++){
		switch (i){
			case 1:
				System.out.println(i);
				break;
			case 2:
				System.out.println(i);
				break;
			case 3:
				System.out.println(i);
				break;
			case 4:
				System.out.println(i);
				break;
			case 5:
				System.out.println(i);
				break;
			default:
				System.out.println("Geçersiz sayı");
				}
			}
        
    }
    
}
