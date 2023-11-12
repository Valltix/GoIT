package module_6.task_15;

import java.util.Arrays;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

public class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        if (aiCoords == null || aiCoords.length != 2 || targets == null || targets.length == 0) {
            return null;
        }

        int minDistance = Integer.MAX_VALUE;
        int[] nearestTarget = null;

        for (int[] target : targets) {
            if (target.length != 2) {
                continue;
            }

            int xDiff = target[0] - aiCoords[0];
            int yDiff = target[1] - aiCoords[1];
            int distance = xDiff * xDiff + yDiff * yDiff;

            if (distance < minDistance) {
                minDistance = distance;
                nearestTarget = target;
            }
        }

        return nearestTarget;
    }

    private static double getSqrt(int[] aiCoords, int coord1, int coord2) {
        return Math.sqrt(Math.pow(aiCoords[0] - coord1, 2) + Math.pow(aiCoords[1] - coord2, 2));
    }
}