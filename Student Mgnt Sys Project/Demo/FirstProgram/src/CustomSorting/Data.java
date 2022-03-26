package CustomSorting;

public class Data<K,V> {
 
	public Data(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	private K key;
	private V value;
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
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
}
