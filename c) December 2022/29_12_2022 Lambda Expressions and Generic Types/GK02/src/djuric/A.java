package djuric;

public class A<T, V> {
	
	T obj1;
	V obj2;
	
	A(T o1, V o2){
		this.obj1 = o1;
		this.obj2 = o2;
	}
	
	public T getObj1() {
		return obj1;
	}
	
	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}
	
	public V getObj2() {
		return obj2;
	}
	
	public void setObj2(V obj2) {
		this.obj2 = obj2;
	}
	
	void prikaziTip() {
		System.out.println("Tip T je: " + obj1.getClass().getName());
		System.out.println("Tip V je: " + obj2.getClass().getName());
	}

}
