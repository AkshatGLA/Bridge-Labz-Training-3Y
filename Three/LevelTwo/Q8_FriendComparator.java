package Assignment.Three.LevelTwo;

import java.util.Scanner;

// Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages
// and tallest among the friends based on their heights and display it.
class Q8_FriendComparator {

    public String findYoungestFriend(String[] names, int[] ages) {
        int youngestAge = ages[0];
        String youngestFriendName = names[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriendName = names[i];
            }
        }
        return youngestFriendName;
    }

    public String findTallestFriend(String[] names, double[] heights) {
        double tallestHeight = heights[0];
        String tallestFriendName = names[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriendName = names[i];
            }
        }
        return tallestFriendName;
    }

    public static void main(String[] args) {
        String[] friendNames = {"Amar", "Akbar", "Anthony"};
        int[] friendAges = new int[3];
        double[] friendHeights = new double[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < friendNames.length; i++) {
            System.out.print("Enter age for " + friendNames[i] + ": ");
            friendAges[i] = scanner.nextInt();
            System.out.print("Enter height (in cm) for " + friendNames[i] + ": ");
            friendHeights[i] = scanner.nextDouble();
        }

        Q8_FriendComparator comparator = new Q8_FriendComparator();

        String youngestFriend = comparator.findYoungestFriend(friendNames, friendAges);
        System.out.println("\nThe youngest friend is: " + youngestFriend);

        String tallestFriend = comparator.findTallestFriend(friendNames, friendHeights);
        System.out.println("The tallest friend is: " + tallestFriend);

        scanner.close();
    }
}