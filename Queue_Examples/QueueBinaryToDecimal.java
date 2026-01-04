package Queue_Examples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBinaryToDecimal {

	public static void main(String[] args) {
		
		int sum = 0;
		String binary = "110101";
		Queue<Integer> obj = new LinkedList<>();
		
//		for(int i=0; i < binary.length(); i++) {
//			obj.offer((int)binary.charAt(i));
//		}
		
		for(char c: binary.toCharArray()) {
			obj.offer(c -'0');
		}
		
		while(!obj.isEmpty()) {
			int bit = obj.poll();
			sum += bit * Math.pow(2, obj.size());
		}
		
		System.out.println(sum);
	
  }
}
