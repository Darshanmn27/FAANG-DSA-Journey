public class lower_upperbound 
{
    public static void main(String[] args) {
        int arr[] = {2, 4, 4, 4, 6, 7};
        int target = 4;

        int firstOccurrence = -1;
        int lastOccurrence = -1;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
                count++;
            }
        }

        System.out.println("First Occurrence: " + firstOccurrence);
        System.out.println("Last Occurrence: " + lastOccurrence);
        System.out.println("Total Occurrences: " + count);
    }
}