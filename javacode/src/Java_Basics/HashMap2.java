package Java_Basics;
import java.util.*;
public class HashMap2 {
    static class HashMap<K , V> {
        public class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int N;
        private int n;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                buckets[i]=new LinkedList<>();
            }
        }
        public int hashFunction(K key){
            int bi=key.hashCode();

            return Math.abs(bi)%N;
        }

        public int searchInLL(int bi,K key){
            LinkedList<Node> ll=buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key.equals(key)){
                    return i;
                }
            }
            return -1;

        }

        private void rehash(){
            LinkedList<Node> oldBucket[]=buckets;
            N=N*2;
            buckets=new LinkedList[N];

            for(int i=0;i<N;i++){
                buckets[i]=new LinkedList<>();
            }

            n=0;

            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll=oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key, V value){
            int bi=hashFunction(key);
            int di=searchInLL(bi,key);

            if(di==-1){
                Node node=new Node(key, value);
                buckets[bi].add(node);
                n++;
            }else{
                Node node=buckets[bi].get(di);
                node.value=value;
                
            }

            double lambda=(double)n/N;

            if(lambda>2.0){
                // rehash
                rehash();

            }
        }
        public V get(K key){
            int bi=hashFunction(key);
            int di=searchInLL(bi,key);

            if(di==-1){
                return null;
            }else{
                Node node=buckets[bi].get(di);
                return node.value;
                
            }

        }
        public boolean containsKey(K key){
            int bi=hashFunction(key);
            int di=searchInLL(bi,key);

            if(di==-1){
                return false;
            }else{
                return true;
            }

        }
        public V remove(K key){
            int bi=hashFunction(key);
            int di=searchInLL(bi,key);

            if(di==-1){
                return null;
            }else{
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
                
            }

        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node =ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India", 150);
        map.put("China",140);

        System.out.println(map.get("India"));
        System.out.println(map.keySet());
        
    }
    
}
