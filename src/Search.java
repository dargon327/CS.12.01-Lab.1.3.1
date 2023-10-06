import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length;i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;

    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for (int i = 0; i < list.size();i++) {
            if (list.get(i).equals(string)) return i;
        }
        return -1;

    }

    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length-1;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (array[mid] == value)
                return mid;

            if (array[mid] > value) {
                right = mid - 1;
                continue;
            }

            left = mid + 1;
        }

        return -1;

    }

    public static int binarySearch(String[] array, String string) {
        int left = 0;
        int right = array.length-1;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (array[mid].equals(string))
                return mid;

            if (array[mid].compareToIgnoreCase(string) > 0) {
                right = mid - 1;
                continue;
            }

            left = mid + 1;
        }
        return -1;

    }
}
