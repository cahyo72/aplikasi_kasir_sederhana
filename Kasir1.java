//Kelompok 1 : Eka Agus M3114059, Eko CahyoM3114061, Kristian Hendro M3114091,Maullana Fauzi M3114100 TIB 2014
import java.io.*;
public class Kasir1{
			public static void main(String[] kaps) throws IOException{
				BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
	String pilih="";
		int keseluruhan=0,milih;
			int banyak=0,duit;
				char daftar = 'Y';
					char pilihan;
		System.out.println("\n\t===Program Membuat Alat Kasir===");			
		System.out.println("\n^^Selamat Datang di Resto Minuman Dingin Bandung^^");
		System.out.println();
		System.out.println("Silahkan Pesan Sesuai Dengan Menu Yang Disediakan : ");
		System.out.println("1. Es Oyen ");
		System.out.println("2. Es Mango Dessert ");
		System.out.println("3. Es Cendol Elizabeth");
		System.out.println("4. Es Mambo Lembang");
		System.out.println("5. Es Goyobod");
		System.out.println("6. Es Pisang Ijo");
		System.out.println("7. Es Yogurt Cisangkuy");
		System.out.println("8. Es Durian");
		System.out.println("9. Es Mang Utuy");
		System.out.println("10.Es Cincau Kacang merah");
			int [] jumlahmenu =new int [10];
				int[] jumlah = new int[10];
					int[] all = new int[10];
			String[] macam = new String[10];
					int[] harga = new int[10];
	
	for ( int i=0;i<jumlahmenu.length;i++) {
	if ( daftar =='Y' | daftar == 'y'){
	System.out.print("Pilih Menu Yang Disediakan : ");
	milih = Integer.parseInt(input.readLine());
	
					 if (milih==1) {macam[i]=("Es Oyen");harga[i]=12000;}
				else if (milih==2) {macam[i]=("Es Manggo Dessert");harga[i]=16000;}
				else if (milih==3) {macam[i]=("Es Cendol Elizabeth");harga[i]=12000;}
				else if (milih==4) {macam[i]=("Es Mambo Lembang");harga[i]=14000;}
				else if (milih==5) {macam[i]=("Es Goyobod");harga[i]=13000;}
				else if (milih==6) {macam[i]=("Es Pisang Ijo");harga[i]=15000;}
				else if (milih==7) {macam[i]=("Es Yogurt Cisangkuy");harga[i]=12000;}
				else if (milih==8) {macam[i]=("Es Durian");harga[i]=13000;}
				else if (milih==9) {macam[i]=("Es Mang Utuy");harga[i]=11000;}
				else if (milih==10) {macam[i]=("Es Cincau Kacang merah");harga[i]=15000;}
				System.out.println("Anda Memilih "+macam[i]+" Seharga "+harga[i]);
			System.out.print("Jumlah yang dipesan menu "+macam[i]+" : ");
	jumlah[i] = Integer.parseInt(input.readLine());
	
		System.out.println();
			System.out.println("Apakah Anda Ingin Memesan Menu Lagi?");
				System.out.print("Y/N : ");
				pilih=input.readLine();
					daftar=pilih.charAt(0);
						banyak=banyak+1;
				}
				all[i] = jumlah[i]*harga[i];
			keseluruhan = keseluruhan+all[i];
			}
	
		System.out.println("\n=========================");
			System.out.println("|\tBayar\t\t|");
				System.out.println("=========================");

			for (int i=0;i<banyak;i++) {
			System.out.println(macam[i]+"   "+"Rp "+all[i]);
		}
		System.out.println("=========================");
			System.out.println("Total Membayar   \tRp "+keseluruhan);
				System.out.print("Anda Membayar \tRp ");
	duit = Integer.parseInt(input.readLine());
	if (duit>=keseluruhan)
			      { System.out.println("Kembalian Anda : \tRp "+(duit-keseluruhan)); } else
				{ System.out.println("Uang Anda kurang!");
				System.out.print("Anda Membayar \tRp ");
	  duit = Integer.parseInt(input.readLine());
	  System.out.println("Kembalian Anda: \tRp "+(duit-keseluruhan));}
	
		}
			}
	