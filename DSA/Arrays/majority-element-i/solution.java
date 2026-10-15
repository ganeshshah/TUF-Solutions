class Solution {
    public int majorityElement(int[] nums) {
        
    Map<Integer,Integer> freqMap = new HashMap<>();

    int max = -1;
    int num = nums[0];

    for(int i : nums){
        freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        if ( freqMap.get(i) > max ){
            num = i;
            max = freqMap.get(i);
        }
    }
return num;

    }
}