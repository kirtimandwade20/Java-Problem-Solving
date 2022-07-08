package com.problem.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimizedCode {

	public int[] twoSum(int[] nums, int target) {
		Map targetMap = new HashMap<Integer, Integer>();
		for (int p1 = 0; p1 < nums.length; p1++) {

			if (targetMap.containsKey(nums[p1])) {
				return new int[] { (Integer) targetMap.get(nums[p1]), p1 };
			} else {
				int key = target - nums[p1];
				targetMap.put(key, p1);
			}

		}
		return new int[2];

	}

	

}


