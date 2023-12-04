// import java.util.ArrayList;
// import java.util.LinkedList;

// class HashMap<K, V> {

//     static class Node<K, V> {
//         K key;
//         V value;

//         public Node(K key, V value) {
//             this.key = key;
//             this.value = value;
//         }
//     }

//     private int n;
//     private int N;
//     private LinkedList<Node<K, V>> buckets[]; // Array of linkedList

//     @SuppressWarnings("unchecked")
//     public HashMap() {
//         this.N = 4;
//         this.buckets = new LinkedList[4];
//         for (int i = 0; i < 4; i++) {
//             this.buckets[i] = new LinkedList<>();
//         }
//     }

//     private int hashFunction(K key) {
//         int bi = key.hashCode();
//         return Math.abs(bi) % N; // Corrected the hashFunction logic
//     }

//     public void put(K key, V value) {
//         int bi = hashFunction(key);
//         int di = searchInLL(key, bi);
//         if (di == -1) {
//             buckets[bi].add(new Node<>(key, value)); // Corrected the syntax
//         } else {
//             Node<K, V> data = buckets[bi].get(di);
//             data.value = value;
//         }
//         double lambda = (double) n / N;
//         if (lambda > 2.0) {
//             // Rehashing
//             rehashing();
//         }
//     }

//     private void rehashing() {
//         LinkedList<Node<K, V>>[] oldBucket = buckets;
//         N = N * 2;
//         buckets = new LinkedList[N];

//         for (int i = 0; i < N; i++) {
//             buckets[i] = new LinkedList<>();
//         }

//         for (int i = 0; i < oldBucket.length; i++) {
//             LinkedList<Node<K, V>> ll = oldBucket[i];
//             for (int j = 0; j < ll.size(); j++) {
//                 Node<K, V> node = ll.get(j);
//                 put(node.key, node.value);
//             }
//         }
//     }

//     private int searchInLL(K key, int bi) {
//         LinkedList<Node<K, V>> ll = buckets[bi];
//         for (int i = 0; i < ll.size(); i++) {
//             if (ll.get(i).key.equals(key)) { // Corrected the equality check
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public boolean containsKey(K key) {
//         int bi = hashFunction(key);
//         int di = searchInLL(key, bi);
//         return di != -1;
//     }

//     public V remove(K key) {
//         int bi = hashFunction(key);
//         int di = searchInLL(key, bi);
//         if (di != -1) {
//             Node<K, V> removedNode = buckets[bi].remove(di);
//             return removedNode.value;
//         }
//         return null;
//     }

//     public V get(K key) {
//         int bi = hashFunction(key);
//         int di = searchInLL(key, bi);
//         if (di != -1) {
//             return buckets[bi].get(di).value;
//         }
//         return null;
//     }

//     public ArrayList<K> keySet() {
//         ArrayList<K> keys = new ArrayList<>();
//         for (LinkedList<Node<K, V>> bucket : buckets) {
//             for (Node<K, V> node : bucket) {
//                 keys.add(node.key);
//             }
//         }
//         return keys;
//     }

//     public boolean isEmpty() {
//         return n == 0;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         HashMap<String, Integer> map = new HashMap<>();
//         map.put("One", 1);
//         map.put("Two", 2);
//         map.put("Three", 3);

//         System.out.println(map.get("Two")); // Output: 2
//         System.out.println(map.containsKey("Four")); // Output: false

//         map.remove("Three");
//         System.out.println(map.keySet()); // Output: [Two, One]
//     }
// }

// import java.util.ArrayList;
// import java.util.LinkedList;

// import org.w3c.dom.Node;

// class hashMap{
    
//         static class HashMap<K,V>{
//          K key;
//          V value;
//         public Node(K key,V value){
//             this.key = key;
//             this.value = value;
//         }
            
        
//         private int n;
//         private int N;
//         private LinkedList<Node> buckets[];//Array of linkedList
//         @SuppressWarnings("uncheaked")
//         public HashMap(){
//             this.N = 4;
//             this.buckets = new LinkedList[4];
//             for(int i=0;i<4;i++){
//                 this.buckets[i] = new LinkedList<>();
//             }
//         }
//         private int hashFunction(K key){//0 to n-1
//                 int bi = key.hashCode();
//                 Math.abs(bi);
//         }
//         public void put(K key , V value){
//             int bi = hashFunction(key);
//             int di =searchInLL(key,bi);//di = valid vlaue
//             if(di == -1)
//             {
//                 buckets[bi].add(new Node(key, value))
//             }
//             else{//key exits
//                 Node data =buckets[bi].get(di);
//                 data.value= value;
//             }
//             double lamda = (double)n/N;
//             if(lamda>2.0){
//                 //rehashing
//                 rehashing()
//             }
//         }
//         private void rehashing() {
//             LinkedList<Node> oldBucket[] = buckets;
//             buckets = new LinkedList[N-2];

//             for(int i=0;i<N+2;i++){
//                 buckets[i] = new LinkedList<>();
//             }

//             for(int i=0;i<oldBucket.length;i++){
//                 LinkedList<Node> ll = oldBucket[i];
//                 for(int j=0;j<ll.size();j++){
//                     Node node = ll.get(j);
//                     put(node.key, node.value);
//                 }
//             }
//         }
//         private int searchInLL(K key2, int bi) {
//             LinkedList<Node> ll = buckets[bi];
//             int di  = 0 ;
//             for(int i=0;i<ll.size();i++)
//             {
//                 if(ll.get(i).key == key){
//                     return i;
//                 }
//             }
//             return -1;
//         }
//         public boolean containKey(K key){

//         }
//         public V remove(K key){
//             return null;
//         }
//         public V get(K key){
//             return null;
//         }
//         public ArrayList<K> keySet(){
//             return null;
//         }
//         public boolean isEmpty(){
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         hashMap<String,Integer> map = new hashMap();
//         map.put()
//     }
// }