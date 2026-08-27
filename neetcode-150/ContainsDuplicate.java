class Solution {
    public boolean hasDuplicate(int[] nums) {
        Boolean hasDuplicates;
        hasDuplicates = Arrays.stream(nums).distinct().count() == nums.length ? false : true;
        return hasDuplicates;
    }
}