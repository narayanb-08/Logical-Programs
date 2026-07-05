package com.nt.streamApiAdvance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByRange {
public static void main(String[] args) {
	Integer arr[] = {2, 3, 10, 14, 20, 24, 30, 34, 40, 44, 50, 54};

     Map<Integer, List<Integer>> result =
             Arrays.stream(arr)
                   .collect(Collectors.groupingBy(n -> (n / 10) * 10));

     System.out.println(result);
}
}
