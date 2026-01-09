import java.util.*;

//L-229
class MajorityElementNby3 {

    // Method to find majority elements
    public List<Integer> majorityElement(int[] nums) {

        // Map to store frequency of each number
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        // Check elements whose count is greater than n/3
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > nums.length / 3) {
                list.add(e.getKey());
            }
        }

        return list;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Taking array elements input
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Object creation
        MajorityElementNby3 obj = new MajorityElementNby3();

        // Method call
        List<Integer> result = obj.majorityElement(nums);

        // Printing result
        System.out.println("Majority elements (> n/3): " + result);

        sc.close();
    }
}
