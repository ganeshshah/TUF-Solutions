class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {

                
    Map<Integer,Integer> freqMap = new HashMap<>();

   Set<Integer> numMoreThan3 = new HashSet<>();
   int threshold = nums.length / 3;

    for(int i : nums){
        freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        if ( freqMap.get(i) > threshold ){
            numMoreThan3.add(i);
        }
    }
return new ArrayList<>(numMoreThan3);

    }
        
    }
