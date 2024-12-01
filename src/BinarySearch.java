public class BinarySearch
{
        public static void main(String[] args)
        {
            int[] a = {1,2,37,48,59,62,71};
            int result = binarySearch(a, 59);
            if (result == -1)
            {
                System.out.println("not there");
            }
            else
            {
                System.out.printf("target found at %d", result);
            }

        }

        public static int binarySearch(int[] arr, int target)
        {
            int low = 0;
            int high = arr.length - 1;
            while (low <= high)
            {
                int mid = (low + high)/2;
                if (arr[mid] == target)
                {
                    return mid;
                }
                else if (arr[mid] < target)
                    low = mid + 1;
                else
                {
                    high = mid - 1;
                }
            }
            return -1;
        }


}
