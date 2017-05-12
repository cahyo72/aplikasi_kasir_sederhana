import java.io.*;
public class MCasier{
public static void main (String [] kaps) throws IOException{
	String namabarang = "";
	int pil, barang, harga, jumlah, total, bayar, kembali, i;
	harga = 0;
	barang = 0;
	total = 0;
	BufferedReader dataIn =  new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("\t\tProgram Membuat Kasir\n\t\t=====================");
	System.out.println("Nomor Barang\t\tBarangnya\tHarga");
	System.out.println("21\t\tRinso\t\t\t10.000");
	System.out.println("22\t\tDaia\t\t\t 8.000");
	System.out.println("23\t\tYakult 1 Pack\t\t 7.500");
	System.out.println("24\t\tClear 180ml\t\t 8.500");
	System.out.println("25\t\tTissu Passeo L\t\t12.000");
	System.out.println("26\t\tSabun Lifeboy\t\t 3.500");
	System.out.println("27\t\tFanta 1L\t\t17.000");
	System.out.println("28\t\tSprite 1L\t\t17.000");
	System.out.println("29\t\tCoca Cola 1L\t\t16.500");
	System.out.println("30\t\tBetadine Pack\t\t18.000");
	
	System.out.print("\nBerapa Barang Yang Dibeli ?  ");
	barang = Integer.parseInt(dataIn.readLine());
		for(i=0; i<barang; i++)
			{
				System.out.print("\nNomor Barang : ");
				pil = Integer.parseInt(dataIn.readLine());
				System.out.print("Jumlah Barang : ");
				jumlah = Integer.parseInt(dataIn.readLine());
				
	switch(pil)
		{
			case 21 :
				harga = 10000*jumlah;
				break;
				
			case 22 :
				harga = 8000*jumlah;
				break;
				
			case 23 :
				harga = 7500*jumlah;
				break;
				
			case 24 :
				harga = 8500*jumlah;
				break;
				
			case 25 :
				harga = 12000*jumlah;
				break;
				
			case 26 :
				harga = 3500*jumlah;
				break;
				
			case 27 :
				harga = 17000*jumlah;
				break;
				
			case 28 :
				harga = 17000*jumlah;
				break;
				
			case 29 :
				harga = 16500*jumlah;
				break;
				
			case 30 :
				harga = 18000*jumlah;
				break;
			default:
				System.out.println("Cek Kembali Pilihan Anda");
		}
				total = total+harga;
			}
			
			System.out.print("\n\tTotal Per@\t : Rp. " +total);
			System.out.print("\n\tTotal Membayar\t : Rp. ");
			bayar = Integer.parseInt(dataIn.readLine());
			
			kembali = bayar-total;
			
			System.out.print("\n\t\tKembalian Yang Diberikan\t\t : Rp. "+kembali);
			System.out.println( );
}
}	
				
				
				