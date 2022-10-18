package com.java.string.isomorphic;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public String transformString(String s) {
        Map<Character, Integer> indexMapping = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);

            if (!indexMapping.containsKey(c1)) {
                indexMapping.put(c1, i);
            }

            builder.append(indexMapping.get(c1));

            builder.append(" ");
        }
        System.out.println(indexMapping);
        System.out.println(builder);
        return builder.toString();
    }
    public boolean isIsomorphic(String s, String t) {
        return transformString(s).equals(transformString(t));
    }
}