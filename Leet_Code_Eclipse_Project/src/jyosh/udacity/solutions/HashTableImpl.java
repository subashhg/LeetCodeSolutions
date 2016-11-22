/**
 * 
 */
package jyosh.udacity.solutions;

import java.util.ArrayList;

/**
 * @author Subash
 *
 */
public class HashTableImpl {
	ArrayList<ArrayList<Object>> values = null;
	ArrayList<ArrayList<String>> keys = null;
	
	public HashTableImpl(){
		values = new ArrayList<ArrayList<Object>>(100);
		keys = new ArrayList<ArrayList<String>>(100);
	}
	
	private int getHash(String key){
		int hash;
		hash = ((int)key.toCharArray()[0] * 100) + key.toCharArray()[1]; 
		return hash;
	}
	public void put(String key, Object value){
		int hash = getHash(key);
		if(values.size()< hash){
			ArrayList<Object> valuesBucket = null;
			ArrayList<String> keysBucket = null;
			for(int i=values.size();i<=hash; i++){
				valuesBucket = new ArrayList<Object>();
				keysBucket = new ArrayList<String>();
				values.add(valuesBucket);
				keys.add(keysBucket);
			}
		}
		values.get(hash).add(value);
		keys.get(hash).add(key);
	
	}
	public Object get(String key){
		Object value = null;		
		int hash = getHash(key);		
		ArrayList<Object> valuesBucket = values.get(hash);
		ArrayList<String> keysBucket = keys.get(hash);
		if(valuesBucket == null || valuesBucket.size() == 0)
			return null;
		for(int i=0;i<keysBucket.size();i++){
			if(key == keysBucket.get(i)){
				value = valuesBucket.get(i);
				break;
			}
		}
		return value;
	}
	
	public Object remove(String key){

		Object value = null;		
		int hash = getHash(key);		
		ArrayList<Object> valuesBucket = values.get(hash);
		ArrayList<String> keysBucket = keys.get(hash);
		if(valuesBucket == null || valuesBucket.size() == 0)
			return null;
		for(int i=0;i<keysBucket.size();i++){
			if(key == keysBucket.get(i)){
				value = valuesBucket.remove(i);	
				keysBucket.remove(i);
				break;
			}
		}
		return value;	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashTableImpl hashTable = new HashTableImpl();
		hashTable.put("Subash", "Awesome");
		hashTable.put("Suhas", "Sooper");
		hashTable.put("Paartha", "Happy");
		hashTable.put("Amma", "Amazing");
		hashTable.put("Amarnath", "Beautiful");
		
		
		System.out.println("Suhas: " + hashTable.get("Suhas"));
		System.out.println("Amma: " + hashTable.get("Amma"));
		System.out.println("Paartha: " + hashTable.get("Paartha"));
		
		System.out.println("remove Subash: " + hashTable.remove("Subash"));
		System.out.println("Subash: " + hashTable.get("Subash"));
	}

}
