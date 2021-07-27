/**
 * 메서드로 배열을 다루는 여러 가지 방법을 보여주는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-27
 */
public class ReferenceParamEx3 {
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 1, 6, 5, 4 };
		
		printArr(arr);	// 배열의 모든 요소를 출력.
		sortArr(arr);	// 배열을 정렬.
		printArr(arr);	// 배열의 모든 요소를 출력.
		System.out.println("sum = " + sumArr(arr));		// 배열의 총합을 출력.
	}
	
	// 첫 번째 메서드.
	static void printArr(int[] arr) {	// 배열의 모든 요소를 출력.
		System.out.print("[");
		for (int val : arr)	// 향상된 for문!!
			System.out.print(val + ",");
		System.out.println("]");
	}
	// 두 번째 메서드.
	static int sumArr(int[] arr) {	// 배열의 모든 요소의 합을 반환.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	// 세 번째 메서드.
	static void sortArr(int[] arr) {	// 배열을 오름차순으로 정렬.
		for (int i = 0; i < arr.length - 1; i++) {	// 버블 정렬 : 배열의 맨 끝 요소에 최댓값이 오게 고정됨.
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	} // sortArr(int[] arr)
}
