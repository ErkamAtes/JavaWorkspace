package methods2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(topla(15,7));
		
		System.out.println(topla2(1,2,3,4,5,6,7,8));
		
	}
		
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar) {
		int sum = 0;
		for (int i : sayilar) {
			sum += i;
		}
		return sum;
	}
	
	public static String sehirVer() {
		
		return "Ankara";
	}

}
