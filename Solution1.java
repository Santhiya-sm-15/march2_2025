class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer> small=new ArrayList<>();
        List<Integer> large=new ArrayList<>();
        List<Integer> equal=new ArrayList<>();
        for(int x:nums)
        {
            if(x>pivot)
                large.add(x);
            else if(x<pivot)
                small.add(x);
            else
                equal.add(x);
        }
        int i=0;
        for(int x:small)
            nums[i++]=x;
        for(int x:equal)
            nums[i++]=x;
        for(int x:large)
            nums[i++]=x;
        return nums;
    }
}