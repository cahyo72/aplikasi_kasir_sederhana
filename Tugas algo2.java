import java.io.*;
public class Tugas algo2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		
		int Es Oyen=12000, Es Mango Dessert=16000, Es Cendol Elizabeth=12000, Es Mambo Lembang=14000, Es Goyobod=13000; 
		int Es Pisang ijo=15000, Es Yogurt Cisangkuy=12000, Es Durian=13000, Es Mang Utuy=11000, Es Cincau Kacang merah=15000;
		int total=0, jumlah, menu, dipilih;
		String pilih, jenis="";
		char plh;
		boolean cek=false;
		
		System.out.println("^^Selamat Datang di Minuman Dingin Bandung^^");
		System.out.println();
		System.out.println("Silahkan Pesan Sesuai dengan menu yang kami sediakan : ");
		System.out.println("1. Es Oyen");
		System.out.println("2. Es Mango Dessert");
		System.out.println("3. Es Cendol Elizabeth");
		System.out.println("4. Es Mambo Lembang");
		System.out.println("5. Es Goyobod");
		System.out.println("6. Es Pisang ijo");
		System.out.println("7. Es Yogurt Cisangkuy");
		System.out.println("8. Es Durian");
		System.out.println("9. Es Mang Utuy");
		System.out.println("10.Es Cincau Kacang merah");
			do
			{
				do
				{
					System.out.println();
					System.out.print("Pilih Menu Yang Anda Ingin Kan : ");
					menu=Integer.parseInt(input.readLine());
					switch (menu)
					{
						case 1:
						{
							System.out.println("Anda Memilih Es Oyen dengan harga Rp.12000");
							System.out.print("Jumlah : ");
							jumlah=Integer.parseInt(input.readLine());
							total=(nasi*jumlah)+total;
						}
						cek=true;
						break;
						
						case 2:
						{
							System.out.println("Anda Memilih Es Mango Dessert dengan harga Rp.16000");
							System.out.print("Jumlah : ");
							jumlah=Integer.parseInt(input.readLine());
							total=(opor*jumlah)+total;
						}
						cek=true;
						break;
						
						case 3:
						{
							System.out.println("Anda Memilih Es Cendol Elizabeth dengan harga Rp.12000");
							System.out.print("Jumlah : ");
							jumlah=Integer.parseInt(input.readLine());
							total=(sate*jumlah)+total;
						}
						cek=true;
						break;
						
						case 4:
						{
							System.out.print("Jumlah : ");
							jumlah=Integer.parseInt(input.readLine());
							System.out.println("Anda Memilih Es Mambo Lembang dengan harga Rp.14000 Jumlah "+jumlah);
							total=(bakar*jumlah)+total;
						}
						cek=true;
						break;
						
						case 5:
						{
							System.out.println("Anda Memilih Es Goyobod dengan harga Rp.13000 ");
							System.out.print("Jumlah : ");
							jumlah=Integer.parseInt(input.readLine());
							total=(balado*jumlah)+total;
						}
						cek=true;
						break;
						
						case 6:
						{
							System.out.print("Jumlah : ");
							jumlah=Integer.parseInt(input.readLine());
							System.out.println("Anda Memilih Es Pisang ijo dengan harga Rp.15000");
							total=(goreng*jumlah)+total;
						}
						cek=true;
						break;
						
						case 7:
						{
							System.out.println("Anda Memilih Es Yogurt Cisangkuy dengan harga Rp.12000");
							System.out.print("Jumlah : ");
							jumlah=Integer.parseInt(input.readLine());
							total=(penyet*jumlah)+total;
						}
						cek=true;
						break;
						
						case 8:
						{
							System.out.println("Anda Memilih Es Durian dengan harga Rp.13000");
							System.out.print("Jumlah : ");
							jumlah=Integer.parseInt(input.readLine());
							total=(chicken*jumlah)+total;
						}
						cek=true;
						break;
						
						case 9:
						{
							do {
								System.out.println();
								System.out.println("1. Dingin\n2. Dingin");
								System.out.print("Pilih : ");
								dipilih=Integer.parseInt(input.readLine());
								}
							while ((dipilih!=1) && (dipilih!=2));
							
							if (dipilih==1)
								jenis="Dingin";
							else if (dipilih==2)
								jenis="Dingin";
							
							System.out.println("Anda Memilih Es Mang Utuy "+jenis+" dengan harga Rp.11000");
							System.out.print("Jumlah : ");
							jumlah=Integer.parseInt(input.readLine());
							total=(air*jumlah)+total;
						}
						cek=true;
						break;
						
						case 10:
						{
							System.out.println();
							do {
								System.out.println("1. Dingin\n2. Dingin");
								System.out.print("Pilih : ");
								dipilih=Integer.parseInt(input.readLine());
								}
							while ((dipilih!=1) && (dipilih!=2));
							
							if (dipilih==1)
								jenis="Dingin";
							else if (dipilih==2)
								jenis="Dingin";
							
							System.out.println("Anda Memilih Es Cincau Kacang merah "+jenis+" dengan harga Rp.15000");
							System.out.print("Jumlah : ");
							jumlah=Integer.parseInt(input.readLine());
							total=(teh*jumlah)+total;
						}
						cek=true;
						break;
						
						default:
						{
							System.out.println("Menu yang anda masukkan tidak tidak ada dalam Menu");
							System.out.println("Silahkan Ulangi untuk memilih menu lagi");
						}
					}
				}
				while (cek==false);
				
				do
				{
					System.out.println();
					System.out.println("Apakah Anda Ingin Memilih Memesan Menu Lagi?");
					System.out.print("Y/N : ");
					pilih=input.readLine();
					plh=pilih.charAt(0);
				}
				while (((plh!='Y') && (plh!='y')) && ((plh!='N') && (plh!='n')));
				
			}
			while ((plh=='Y') || (plh=='y'));
			
			System.out.println();
			System.out.println("Total dari semua menu yang anda beli adalah  : Rp."+total);
		}
	}