fun Find_First_and_Last_Position_Element(nums: IntArray, target: Int): IntArray {
    var left = binaryHelper(nums, target, true)
    var right = binaryHelper(nums, target, false)
    return intArrayOf(left, right)

}

fun binaryHelper(nums: IntArray, target: Int, leftBias: Boolean): Int {
    var left = 0
    var right = nums.size - 1
    var mid = 0
    var i = 0
    while (left <= right) {
        mid = (left + right) / 2

        if (nums[mid] > target) {
            right = mid - 1
        } else if (nums[mid] < target) {
            left = mid + 1
        } else {
            i = mid
            if (leftBias) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }


    }

    return i
}