 public interface Safe <T extends Money>{

 	private ArrayList<T> arr= new ArrayList<T>();
int lockIn(T target){
	arr.add(target);
}

T getFromSafe(int key){
	arr.get(key);
}
}
