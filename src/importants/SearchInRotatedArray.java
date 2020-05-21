package importants;

public class SearchInRotatedArray {
        int[] nums;
        int target;

        public int find_rotate_index(int left, int right) {
            if (nums[left] < nums[right])
                return 0;

            while (left <= right) {
                int pivot = (left + right) / 2;
                if (nums[pivot] > nums[pivot + 1])
                    return pivot + 1;
                else {
                    if (nums[pivot] < nums[left])
                        right = pivot - 1;
                    else
                        left = pivot + 1;
                }
            }
            return 0;
        }

        public int search(int[] nums, int target) {
            this.nums = nums;
            this.target = target;

            int l = 0;
            int r = nums.length - 1;

            int n = nums.length;

            if (n == 0)
                return -1;
            if (n == 1)
                return this.nums[0] == target ? 0 : -1;

            int rotate_index = find_rotate_index(0, n - 1);

            // if target is the smallest element
            if (nums[rotate_index] == target)
                return rotate_index;

            // if array is not rotated, search in the entire array
            if (rotate_index == 0)
                return binarySearch(0, n - 1);

            if (target < nums[0])
                // search in the right side
                return binarySearch(rotate_index, n - 1);

            // search in the left side
            return binarySearch(0, rotate_index);
        }


        int binarySearch(int l, int r) {

            int arr[] = nums;

            while (l <= r) {
                int mid = l + (r - l) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else {

                    if (arr[mid] > target) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                }
            }
            return -1;

        }


    public static void main(String args[]){
         SearchInRotatedArray a = new SearchInRotatedArray();
         int arr[] = {4,5,6,7,0,1,2};
         System.out.println(a.search(arr,2));
        }
    }


