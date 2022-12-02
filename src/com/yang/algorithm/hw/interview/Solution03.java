package com.yang.algorithm.hw.interview;

import java.util.*;
import java.util.stream.Collectors;

public class Solution03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lineNum = Integer.valueOf(in.nextLine());
        int[][] locations = new int[lineNum][];
        for (int i = 0; i < lineNum; i++) {
            String locationStr = in.nextLine();
            String[] locationArr = locationStr.trim().split(" ");
            int left = Integer.valueOf(locationArr[0]);
            int right = Integer.valueOf(locationArr[1]);
            locations[i] = new int[]{left,right};
        }
        Arrays.sort(locations, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        Long baseDistance = 0L;
        int curLeft = locations[0][0];
        Map<Integer,Integer> leftBorderNumMap = new HashMap<>();
        Map<Integer,Integer> rightBorderNumMap = new HashMap<>();
        List<Integer> allLocations = new ArrayList<>();
        for (int[] location : locations) {
            baseDistance = baseDistance + (location[0] - curLeft);
            int left = location[0];
            int right = location[1];
            allLocations.add(left);
            allLocations.add(right);
            if (leftBorderNumMap.containsKey(left)) {
                leftBorderNumMap.put(left,leftBorderNumMap.get(left) + 1);
            } else {
                leftBorderNumMap.put(left,1);
            }
            if (rightBorderNumMap.containsKey(right)) {
                rightBorderNumMap.put(right,leftBorderNumMap.get(right) + 1);
            } else {
                rightBorderNumMap.put(right,1);
            }
        }
        allLocations = allLocations.stream().sorted().distinct().collect(Collectors.toCollection(LinkedList::new));

        int[] locationFirst = locations[0];
        int rightBorder = 0; //已经经过的右边界
        int leftBorder = lineNum - leftBorderNumMap.get(locationFirst[0]); //还未经过的左边界数量
        Long curDistance = baseDistance;
        Long minDistance = baseDistance;
        int lastLocation = locationFirst[0];
        for (int i = 1; i < allLocations.size(); i++) {
            int location = allLocations.get(i);
            curDistance = curDistance + (rightBorder - leftBorder) * (location - lastLocation);
            minDistance = minDistance > curDistance ? curDistance : minDistance;

            if (leftBorderNumMap.containsKey(location)) {
                int reduce = leftBorderNumMap.get(location);
                leftBorder = leftBorder - reduce;
            }
            if (rightBorderNumMap.containsKey(location)) {
                int add = rightBorderNumMap.get(location);
                rightBorder = rightBorder + add;
            }
        }


        System.out.println(minDistance);
    }
}
