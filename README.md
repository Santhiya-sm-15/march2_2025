# march2_2025
The problem that i solved today in leetcode

1.You are given two 2D integer arrays nums1 and nums2.

nums1[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
nums2[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
Each array contains unique ids and is sorted in ascending order by id.

Merge the two arrays into one array that is sorted in ascending order by id, respecting the following conditions:

Only ids that appear in at least one of the two arrays should be included in the resulting array.
Each id should be included only once and its value should be the sum of the values of this id in the two arrays. If the id does not exist in one of the two arrays, then assume its value in that array to be 0.
Return the resulting array. The returned array must be sorted in ascending order by id.

Code:
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> l=new ArrayList<>();
        int i=0,j=0;
        int n=nums1.length,m=nums2.length;
        while(i<n && j<m)
        {
            if(nums1[i][0]==nums2[j][0])
            {
                l.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0])
            {
                l.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }
            else
            {
                l.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
            }
        }
        while(i<n)
        {
            l.add(new int[]{nums1[i][0],nums1[i][1]});
            i++;
        }
        while(j<m)
        {
            l.add(new int[]{nums2[j][0],nums2[j][1]});
            j++;
        }
        int[][] res=new int[l.size()][2];
        i=0;
        for(int[] x:l)
            res[i++]=x;
        return res;
    }
}
