import java.util.*;

class Q2_countFreq{
	public static void sol(int[]arr){
		HashMap<Integer,Integer>hs = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(hs.containsKey(arr[i])){
				int freq = hs.get(arr[i]);
				freq+=1;
				hs.put(arr[i],freq);
			}else{
				hs.put(arr[i],1);
			}
		}

		//Printing val and freq
		Set<Integer> key = hs.keySet();
		for(int k : key){
			System.out.println(k+" = "+hs.get(k));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		sol(arr);
		
	}
}