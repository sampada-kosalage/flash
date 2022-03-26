package Data;

public class Dataa<K,V> {
 private K key;
 private V value;
@Override
public String toString() {
	return "Dataa [key=" + key + ", value=" + value + "]";
}
public K getKey() {
	return key;
}
public void setKey(K key) {
	this.key = key;
}
public V getValue() {
	return value;
}
public void setValue(V value) {
	this.value = value;
}
 
 public<E,N>void display(E element, N number){
	 System.out.println("Element:"+element+"Number:"+number);
 }
}
