package ordinamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MyListUtil {

	public void main(String[] args) {
		List<Integer> numeri = new ArrayList<Integer>();
		numeri.add(10);
		numeri.add(8);
		numeri.add(12);
		numeri.add(6);

		List<Integer> s = sort(numeri, 1);
		System.out.println(s);

	}
	
	public MyListUtil() {}

	public List<Integer> sort(List<Integer> list, int order) {

		
		if (order == 0) {
			Collections.sort(list);
			return list;
		}

		else if (order == 1) {
			list.sort(null);
			Collections.reverse(list);
			return list;
		}

		return null;

	}

}
