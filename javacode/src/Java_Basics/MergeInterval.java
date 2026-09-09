package Java_Basics;
import java.util.*;
class MergeInterval {
    public static void mergeArray(int min,int max , List<List<Integer>> result){
        if(result.size()==0){
            result.add(new ArrayList(Arrays.asList(min,max)));
        }else{
            int min2=result.get(result.size()-1 ).get(0);
            int max2=result.get(result.size()-1 ).get(0);

            if(min>=min2 && min <= max2){
                result.get(result.size()-1).set(1,Math.max(max2,max));
            }
        }
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> result=new ArrayList<>();
        for(int i=0; i< intervals.length; i++){
            if(i==intervals.length-1){
                result.add(new ArrayList(Arrays.asList(intervals[i][0],intervals[i][1])));
            }
            else if(intervals[i+1][0]>=intervals[i][0] && intervals[i+1][0]<=intervals[i][0] ){
                int min=Math.min(intervals[i][0], intervals[i+1][0]);
                int max=Math.max(intervals[i][1], intervals[i+1][1]);
                mergeArray(min,max,result);
                
            }
            else{
                result.add(new ArrayList(Arrays.asList(intervals[i][0],intervals[i][1])));
            }

        }
        int[][] arr=new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            arr[i][0]=result.get(i).get(0);
            arr[i][1]=result.get(i).get(1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int [][]intervals={{1,3},{2,6},{8,10},{15,18}};
        int[][]arr=merge(intervals);
    }
}
