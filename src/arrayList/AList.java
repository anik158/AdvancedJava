package arrayList;

import java.util.*;
public class AList {

    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<>();

        grades.add(91);
        grades.add(89);
        grades.add(83);
        grades.add(91);

        int total = 0;
//        for (int i = 0; i < grades.size(); i++) {
//            total += grades.get(i);
//        }

        for (Integer grade : grades) {
            total += grade;
        }

        double avg = (double) total / grades.size();
        System.out.println(avg);
    }
}
