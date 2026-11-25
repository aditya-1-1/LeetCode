class Solution {
    public int findSpecialInteger(int[] arr) {
        
        int n = arr.length;
        int ele = arr[0];
        int count = 1;
        if(n ==1) return ele;
        for(int i= 1;i<n;i++){
            if(ele == arr[i]){
                count++;
                if(count> n/4) return ele;
            }   
            else{
                ele = arr[i];
                count = 1;
            }
        }
        return -1;
    }
}