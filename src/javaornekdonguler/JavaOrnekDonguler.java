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
	    
	    //iç içe for loop
        /*for (int i=1; i<=5; i++){//dış döngü || column
            System.out.println();
            for (int j=1; j<=10; j++){//iç döngü || row
                System.out.print(i*j + " ");
            }
        }*/
        
        
        
        //Star Pattern
        /*for (int i=1; i<=4; i++){
            System.out.println();
            for (int j=1; j<=i; j++){
                System.out.print("* ");
                
            }
        }*/
        
        
        
        //Gelişmiş For
        /*int [] dizi={1,2,3,4,5};
        for (int i:dizi){
            System.out.println(i);
        }*/
	    
	    
	    
	 //Star Pattern(Reverse)
	 /*for(int i=1; i<=4; i++){
            System.out.println(" ");
            for(int j=4; j>=i; j--){
                System.out.print("*");
            }
        }*/
	    
	    
	
	//Carpim Tablosu
        /*for (int i=1; i<=10; i++){
            System.out.println();
            for (int j=1; j<=10; j++){
                System.out.println(j + "*" + i + "=" + (j*i));
            }
	}*/
	    
	    
	//Aylık ücretin vergisi
	/*double [] aylik = {1.534, 2.146, 1.878};
	int vergi = 30;
		for (double hesap:aylik){
		System.out.println("Aylık: "+hesap+" Vergisi: "+ (hesap*vergi/100) );
		}*/
		
		
	//Gelişmiş for
		String [] arabalar = {"AUDI", "BMW", "MERCEDES", "VOLKSWAGEN", "HONDA", "TOYOTA"};
		for (String cars : arabalar){
		    System.out.println(cars);
		}
    }
    
}
