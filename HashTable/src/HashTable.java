import java.util.ArrayList;

//created by Preity Singh
public class HashTable {
    public int size =0;
    private ArrayList<String> hashTable;

    //initializes an array of size capacity
    public HashTable(int capacity) {
        hashTable = new ArrayList<>();
        for(int i = 0; i < capacity; i++){
            hashTable.add(null);
        }
        size = capacity;
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value) {
        if(get(key) == null) {
            hashTable.set(Integer.parseInt(key), value);
            return true;
        } else {
            return false;
        }
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key) {
        return hashTable.get(Integer.parseInt(key));
    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key) {
        //hashcode here
    }
}
