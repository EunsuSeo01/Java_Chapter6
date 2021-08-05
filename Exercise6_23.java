/**
 * 연습문제 6-23 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-05
 */
public class Exercise6_23 {
	// 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
	// 만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
	public static int max(int[] arr) {
		if(arr == null || arr.length == 0)
			return -999999;

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		
		System.out.println("최대값: " + max(data));
		System.out.println("최대값: " + max(null));
		System.out.println("최대값: " + max(new int[]{}));	// 크기가 0인 배열을 인자로 보낸 것.
	}
}
