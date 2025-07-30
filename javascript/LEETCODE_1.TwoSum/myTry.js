/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]} : indices of two nums that add up to target 
 * 
 * each input have one solution, cannot use same element twice.
 * answer in any order
 */
var twoSum = function(nums, target) {
    if (!satisfiesConstraints(nums, target)) return null;
    for (let i=0; i<nums.length-1; i++){
        for (let j=i+1; j<nums.length; j++){
            if (nums[i] + nums[j] == target) return [i, j];
        }
    }
    return null;
};

var satisfiesConstraints = function(nums, target) {
    if ((nums.length < 2) || (nums.length > Math.pow(10,4))) return false; 
    for (let i=0; i<nums.length; i++)
        if ((nums[i] < -Math.pow(10,9)) || (nums[i] > Math.pow(10,9)) ) return false; 
    if ((target < -Math.pow(10,9)) || (target > Math.pow(10,9)) ) return false; 
    return true;
};


var testTwoSum = function() {
    let nums = [2,7,11,15]
    let target = 9
    let output = twoSum(nums, target);
    console.log(output);  // Expected output: [0, 1]

    nums = [3,2,4], target = 6
    output = twoSum(nums, target);
    console.log(output);  // Expected output: [1, 2]

    nums = [3,3], target = 6
    output = twoSum(nums, target);
    console.log(output);  // Expected output: [0, 1]
}

testTwoSum();
