class Solution {
    public int missingNumber(int[] nums) {
       /* int n = nums.length;

        int expected = n * (n + 1) / 2;

        int actual = 0;

        for (int num : nums) {
            actual += num;
        }

        return expected - actual;
    }
}*/

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1; // Ye kabhi execute nahi hoga
    }
}