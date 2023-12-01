package NormalClass;

import java.util.Arrays;

public class Parvind {

	
	public static void main(String[] args) {
        // The name to be sorted
        String name = "vishvanath";

        // Convert the name to an array of characters
        char[] charArray = name.toCharArray();

        // Sort the array in descending order
        Arrays.sort(charArray);

        // Reverse the sorted array to get descending order
        for (int i = 0, j = charArray.length - 1; i > j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Display the name sorted in descending order
        System.out.println("Name sorted in descending order: " + new String(charArray));
    }
}
