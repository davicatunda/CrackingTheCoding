package utils;

class Wrapper<K,V>{
	K key;
	V value;
}

public class HashMap<K,V> {
	Wrapper<K,V>[] wrappers;
	
	public void put(K key, V value){
		
	}
	public V get(K key){
		V value=null;
		return value;
	}
	//TODO
	public V[] containsKey(K key){
		V[] values = null;
		for(int i=0; i<wrappers.length;i++){
//			if(wrappers[i].key==key) values.add(wrappers[i].value);
		}
		return values;
	}

}



/* How to use HashMap Built-in function
 * First you need to know that you can't use int, char, etc, instead use Integer, Character...
 * See the docs http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html for more.
 * Functions most used:
 ** put(Object key, Object value), get(Object key), clear(), clone(), containsKey(Object key), 
 ** containsValue(Object value), remove(Object key), size()
 */

/* Ex: given-> Student[] students
	HashMap<Integer, Student> map = new HashMap<Integer, Student>();
	//put tuples
	map.put(students[0].getId, students[0])
	map.put(students[1].getId, students[1])
	// return value associated to a key
 	Student a = map.get(students[0].getId);	
 */