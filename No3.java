/*
 * 3-Sept -2015
 * Nama :Muhammad Ulil Albab
 * Nim  :23515006
 * Program : Program yang membaca sejumlah bilangan integer 0 atau positif yang terdiri atas 1 s.d. 5 digit
 *  		(diasumsikan masukan selalu benar). Asumsikan pula, banyaknya bilangan tidak lebih dari 100 buah.
 * 			Pembacaan bilangan dihentikan ketika pengguna mengetikkan sebuah bilangan negatif 
 * 			atau jika banyaknya bilangan sudah sama dengan 100.
 * 			Program kemudian menuliskan ke layar banyaknya bilangan yang dimasukkan 
 * 			dan setiap digit yang ada dalam semua bilangan yang diketikkan 
 * 			dan menuliskan jumlah kemunculannya 
 * 			(lihat contoh, perhatikan spasi yang digunakan). 
 * 			Hanya digit yang ada saja yang ditulis dan harus ditulis terurut menaik. 
 * 
 */
import java.util.Scanner;
public class No3{
	public static void main (String [] args)
	{
		
		int TabInt[] = new int[10];
		int count=0,i,X;
		No3 no3 = new No3();
		Scanner input = new Scanner(System.in);
		X= input.nextInt();
		while(X>=0 || count==99)
		{
			for(i=0;i<10;i++)
			{
				TabInt[i] =TabInt[i]+no3.arrCounter(i,X);			
			}			
			count++;
			X= input.nextInt();		
		}
		if(count==0)
		{
			System.out.println(0);
		} else 
		{
			System.out.println(count);
			for(i=0;i<10;i++)
			{
				if(TabInt[i]>0)
				{
					System.out.println(i+" : "+TabInt[i]); 
					//printf("%d : %d \n",i,TabAngka[i]);
				}
			}
		}
		
		
	}
	
	int arrCounter(int digit, int digits)
	{
		int tempCounter =0;
		
		do{
			if(digit ==digits %10)
			{
				tempCounter++;
				
			}
			digits=digits/10;
			
		}while(digits>0);
		
		return tempCounter;
	}
}
