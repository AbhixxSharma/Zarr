//  Using hashMap find the frequency of the array...
Map<Integer, Integer> map = new HashMap<>();
     List<Integer> lst = new ArrayList<>();
 
    for (int i = 0; i < nums.length; i++)
    {
        if (map.containsKey(nums[i]))
        {
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        else
        {
            map.put(nums[i], 1);
        }
    }
   for(int key: map.keySet()){
            // Now print number of frequency...
     System.out.print(Map.get(key));
   }
}
