package Java_Basics;

public class Trie {
    static class Node{
        Node[] children;
        boolean eow;
        Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }

    static Node root=new Node();

    static void insertInTrie(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                Node childNode=new Node();
                curr.children[idx]=childNode;

            }
            
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    static boolean searchInTrie(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';

            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow;
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }

        for(int i=1;i<=key.length();i++){
            String firstPart=key.substring(0,i);
            String secPart=key.substring(i);

            if(searchInTrie(firstPart)&& wordBreak(secPart)){
                return true;
            }
        }
        return false;
    }

    // startsWith
    public static boolean startsWith(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            }
        }
        return count+1;
    }

    public static boolean LongestString(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null ||curr.children[idx].eow==false){
                return false;
            }else{
                curr=curr.children[idx];
            }
        }

        return true;
    }
    public static void main(String[] args) {
        // String[] word={"the","a","there","their","any"};
        // for(String w : word){
        //     insertInTrie(w);
        // }
        // System.out.println(searchInTrie("an"));

        // String words[]={"i","like","sam","samsung","mobile"};
        // // String key="ilikesamsung";

        // for(int i=0;i<words.length;i++){
        //     insertInTrie(words[i]);
        // }
        // // System.out.println(wordBreak(key));
        // String key="likes";
        // System.out.println(startsWith(key));
        // String word="ababa";

        // for(int i=0;i<word.length();i++){
        //     insertInTrie(word.substring(i));
        // }
        // System.out.println(countNodes(root));

        String[] words={"a","banana","app","appl","ap","apply","apple"};
        for(int  i=0;i<words.length;i++){
            insertInTrie(words[i]);
        }
        String result="";
        for(String key : words){
            if(LongestString(key) && (key.length()>result.length() || (key.length()==result.length() && key.compareTo(result)<0))){
                result=key;
            }
        }
        System.out.println(result);



    }
}
