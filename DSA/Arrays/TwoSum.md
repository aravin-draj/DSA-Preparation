# 🧮 Two Sum

🔗 [LeetCode Link](https://leetcode.com/problems/two-sum/)

## ✅ Approach:
- Use a HashMap to track seen numbers.
- For each `num`, check if `target - num` exists.

## ⏱️ Time Complexity:
- O(n) time, O(n) space

## 🔤 Code (Java):
```java
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    return new int[0];
}
