import java.util.*;
import java.util.regex.*;

class Solution {
    public String[] solution(String[] files) {
        Pattern p = Pattern.compile("([^0-9]+)([0-9]{1,5})");

        Arrays.sort(files, (a, b) -> {
            Matcher m1 = p.matcher(a);
            Matcher m2 = p.matcher(b);

            m1.find();
            m2.find();

            String head1 = m1.group(1).toLowerCase();
            String head2 = m2.group(1).toLowerCase();

            // 1. HEAD 비교
            int cmp = head1.compareTo(head2);
            if (cmp != 0) return cmp;

            // 2. NUMBER 비교
            int num1 = Integer.parseInt(m1.group(2));
            int num2 = Integer.parseInt(m2.group(2));

            return num1 - num2;
        });

        return files;
    }
}