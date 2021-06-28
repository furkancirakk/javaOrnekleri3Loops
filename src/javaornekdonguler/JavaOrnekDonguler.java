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
        
	    
	//ekrana 10 kere alt alta Hello World! yazdırma
        /*int i=0;
        while (i<10){
            System.out.println("Hello World!");
            i++;
        }*/
        
        
        //0'dan 100' kadar sayıların toplamı
        /*int i = 0, toplam=0;
        do{
            toplam+=i;
            i++;
        }
        while(i<=100);
        System.out.println(toplam);*/
        
        
        //15'ten küçük çift sayıların toplamı
        /*int i=0, toplam=0;
            do {
            toplam+=i;
            i+=2;
	}
        while (i<=15);
	System.out.println(toplam);*/
        

        //faktöriyel hesabı:
        /*long fakt=1;
        for (int i=1; i<=20; i++){
            fakt*=i;
            System.out.println(i + "! = "+fakt);
        }*/
        

        //alfabe sıralama
        /*for (char i='A'; i<='Z';i++){
        System.out.println(i);
        }*/
        
        
        //metindeki karakter sayısını bulma
        /*String metin="Merhaba Java Dersi";
        char karakterler='a';
        int karakterSayisi=0;
        for (int i=0;i<metin.length();i++){
            if(karakterler==metin.charAt(i)){
                karakterSayisi++;
            }
        }
        System.out.println(metin + " metninde "+karakterler+" karakteri "+ karakterSayisi +" adet vardır.");*/
        
        
        //for & switch case together scenario    
	/*for (int i=1; i<=5; i++){
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
	}*/
	    
	    
	    //
	    for(int i=1; i<=4; i++){
            System.out.println(" ");
            for(int j=4; j>=i; j--){
                System.out.print("*");
            }
        }
    }
    
}
