import java.util.*;

class Q1_CountDist{
	public static int sol(int[]arr){
		Set<Integer> s = new HashSet<>();
		for(int i=0;i<arr.length;i++){
			s.add(arr[i]);
		}
		return s.size();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sol(arr));

		
	}
}