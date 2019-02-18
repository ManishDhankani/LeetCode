//https://leetcode.com/problems/intersection-of-two-arrays/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i: nums1){
            set1.add(i);
        }
        for(int i: nums2){
            set2.add(i);
        }
        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int a = 0;
        for(int x: set1){
            result[a++] = x;
        }
        return result;
    }
}