package GenericMethod;

import java.util.List;

public class Data <K extends Integer,V extends Training>{

	public Data(K key, V string) {
		super();
		Key = key;
		this.value = string;
	}
	/*public<E>void printListData(List<E>list){
		for(E element:list) {
			System.out.println(element);
		}
	}
	public <E>void printArrayData(E[]arrayData){
		for(E element:arrayData) {
			System.out.println(element);
		}
	}*/
	
	public Data(int key2, String string) {
		// TODO Auto-generated constructor stub
	}
	private K Key;
	private V value;
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		Key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Data [Key=" + Key + ", value=" + value + "]";
	}
	public void display(String string, int i) {
		// TODO Auto-generated method stub
		
	}
	public<E extends Character,N extends Number>void display(E element,N number) {
	}
	System.out.println("Element:"+element+"Number:"+number);
}



