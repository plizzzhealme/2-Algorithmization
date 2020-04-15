package part04.task04;

import static interaction.Interaction.buildIntsMatrix;
import static interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of points");
        int n = getPositiveInt();
        int[][] points = buildIntsMatrix(2, n);
        System.out.println("Points:");

        for (int i = 0; i < n; i++) {
            System.out.printf("(%d;%d) ", points[0][i], points[1][i]);
        }
        System.out.println();
        int[] pair = findPairAtMaxDistance(points);
        int x1 = points[0][pair[0]];
        int x2 = points[0][pair[1]];
        int y1 = points[1][pair[0]];
        int y2 = points[1][pair[1]];
        System.out.printf("The max distance is between points (%d;%d) and (%d;%d)", x1, y1, x2, y2);
    }

    /*
    returns squared distance between 2 points
     */
    private static int calculateDistance(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }

    /*
    returns indexes of a pair at max distance
     */
    private static int[] findPairAtMaxDistance(int[][] points) {
        int max1 = 0;
        int max2 = 1;
        int maxDistance = 0;
        int n = points[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int distance = calculateDistance(points[0][i], points[1][i], points[0][j], points[1][j]);

                if (distance > maxDistance) {
                    maxDistance = distance;
                    max1 = i;
                    max2 = j;
                }
            }
        }
        return new int[]{max1, max2};
    }
}