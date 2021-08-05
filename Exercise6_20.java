/**
 * 연습문제 6-20 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-04
 */
public class Exercise6_20 {
	// 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다. 처리한 배열을 반환한다.
	static int[] shuffle(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// Math.random()은 0과 같거나 크고 1보다 작은 범위의 랜덤 값을 반환해 줌.
			// 0 <= Math.random() < 1
			int index = (int) (Math.random() * arr.length);
			
			int tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
