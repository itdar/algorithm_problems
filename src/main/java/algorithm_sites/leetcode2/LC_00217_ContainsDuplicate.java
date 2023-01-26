package algorithm_sites.leetcode2;

import java.util.HashSet;
import java.util.Set;

public class LC_00217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

}
