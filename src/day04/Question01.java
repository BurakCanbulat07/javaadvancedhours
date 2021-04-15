package day04;

public class Question01 {
	
	public static void main(String[] args) {
		
		int arr[]= {2,6,3,87,3,23,47,7,42,3};
		
		System.out.println("Buyuk sayi: "+buyukSayi(arr));
		System.out.println("Kucuk sayi: "+kucukSayi(arr));

	}

	public static int buyukSayi(int[] arr) {
		int bs=0;
		
			if (arr[0]>arr[1]) {
				bs=arr[0];
			}else {
				bs=arr[1];
			}
			
			for (int i=2; i<arr.length;i++) {
				if (bs<arr[i]) {
					bs=arr[i];
				}
			}
		return bs;
	}
	
	public static int kucukSayi(int[] arr) {
		int ks=0;
		
		if (arr[0]<arr[1]) {
			ks=arr[0];
		}else {
			ks=arr[1];
		}
		for (int i=2; i<arr.length;i++) {
			if (ks>arr[i]) {
				ks=arr[i];
			}
		}
		
		return ks;
	}

}