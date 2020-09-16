package method;

public class Ex06 {
	
	public static void change(int[] array) {	// array = [I@7852e922 // 배열을 받는 것이므로 배열의 자료형 그대로 받아준다.
		System.out.println(array);
		array[0] = 100;
		array[1] = 200;
		array[2] = 300;
			
	}

	public static void main(String[] args) {

		// 2. call by reference ==> ★★★★★★★★ 중요함
		int[] arr = new int[3];
		arr[0] = 10; arr[1] = 20; arr[2] = 30;
		
		System.out.println(arr);
		System.out.println("change() 메서드 호출 전....");

		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] >>> "+arr[i]);
		}
		System.out.println();
		
		change(arr);
		
		System.out.println("change() 메서드 호출 후....");

		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] >>> "+arr[i]);
		}
		
		
	}

}
