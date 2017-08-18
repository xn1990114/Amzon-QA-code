package hashMap;

import java.util.*;

public class MyHashMap<K,V> {
	private final static int maxLength=20;
	ArrayList<ArrayList<Pair>> hashSlot;
	private int size;
	public MyHashMap(){
		this.hashSlot=new ArrayList<ArrayList<Pair>>();
		for(int i=0;i<MyHashMap.maxLength;i++){
			this.hashSlot.add(new ArrayList<Pair>());
		}
		this.size=0;
	}
	
	public void put(K key,V value){
		int hash=calHash(key);
		int toremoveindex=-1;
		for(int i=0;i<hashSlot.get(hash).size();i++){
			if(hashSlot.get(hash).get(i).getKey()==key){
				toremoveindex=i;
				break;
			}
		}
		if(toremoveindex>=0){
			hashSlot.get(hash).remove(toremoveindex);
			this.size--;
		}
		Pair toadd=new Pair(key,value);
		hashSlot.get(hash).add(toadd);
		this.size++;
	}
	
	public V get(K key){
		int hash=calHash(key);
		for(Pair p:hashSlot.get(hash)){
			if(p.getKey()==key){
				return p.getValue();
			}
		}
		return null;
	}
	
	public void remove(K key){
		int hash=calHash(key);
		for(int i=0;i<hashSlot.get(hash).size();i++){
			if(hashSlot.get(hash).get(i).getKey()==key){
				hashSlot.get(hash).remove(i);
				this.size--;
				return;
			}
		}
		return;
	}
	
	public int size(){
		return this.size;
	}
	
	
	private int calHash(K key){
		return key.toString().length()%MyHashMap.maxLength;
	}
	
	
	
	class Pair{
		private K key;
		private V value;
		public Pair(K key,V value){
			this.key=key;
			this.value=value;
		}
		public K getKey(){
			return this.key;
		}
		public V getValue(){
			return this.value;
		}
	}
}
