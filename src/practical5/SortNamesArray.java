package practical5;

import java.util.Arrays;

public class SortNamesArray {
    public static void main(String[] args) {
        String[] names = { "somesh", "sumit", "ganesh", "anil", "rushikesh", "darshan", "aniket" };

        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }
}
