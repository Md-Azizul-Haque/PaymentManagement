import java.util.*;
public class Solution {
    
    int row, col;
    ArrayList<ArrayList<Integer>> grid;
    
    public int foundLeftSmallerFromCol(int rowId, int midValue){
        int low = 0;
        int high = grid.get(rowId).size() - 1;
        while(low <= high){
            if(low == high){
                if(grid.get(rowId).get(low) >= midValue){
                    return low - 1;
                }
                else if(grid.get(rowId).get(low) < midValue){
                    return low;
                }
                else {
                	
                }
                
                break;
            }
            
            int mid = (low + high) / 2;
            int value = grid.get(rowId).get(mid);
            if(value == midValue){
                return mid - 1;
            }
            else if(value > midValue){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        
        return grid.get(rowId).size() - 1;
    }
    
    public int leftCount(int mid){
    	//System.out.println(mid);
        int leftSmaller = 0;
        for(int i = 0; i<row; i++){
        	int v = foundLeftSmallerFromCol(i, mid);
            leftSmaller += (v + 1);
        }
        
        //System.out.println("F "+leftSmaller);
        return leftSmaller;
    }
    
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        long low = Integer.MIN_VALUE;
        long high = Integer.MAX_VALUE;
        grid = A;
        
        row = A.size();
        col = A.get(0).size();
        
        int matrix = row * col;
        int leftCountFromMid = matrix / 2;
        
        while(low <= high){
            if(low == high){
                if(leftCount((int)low) == leftCountFromMid){
                    return (int)low;
                }
                
                break;
            }
            
            int mid = (int)((low + high) / 2);
            int calculatedValue = leftCount(mid);
            if(calculatedValue == leftCountFromMid){
                return mid;
            }
            else if(calculatedValue < leftCountFromMid){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        
        return -1;
    }
    
    public static void main(String [] args) {
    	ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
    	A.add(new ArrayList<Integer>());
    	A.add(new ArrayList<Integer>());
    	A.add(new ArrayList<Integer>());
    	
    	A.get(0).add(1);
    	A.get(0).add(3);
    	A.get(0).add(5);
    	
    	A.get(1).add(2);
    	A.get(1).add(6);
    	A.get(1).add(9);
    	
    	A.get(2).add(3);
    	A.get(2).add(6);
    	A.get(2).add(9);
    	
    	System.out.println(new Solution().findMedian(A));
    }
}
