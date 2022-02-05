package entity;

import java.util.List;
import java.util.ArrayList;

public class PrintServiceString {

	private List<String> list = new ArrayList<>();
	
	public void addValue (String value) {
		list.add(value);
	}
	
	public String first() {
		if(list.isEmpty() ) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty() ) {
			System.out.print(list.get(0) );
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
