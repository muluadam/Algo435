package lab2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {
    public static <T> List<Set<T>> powerSet(List<T> X) {
        List<Set<T>> P = new ArrayList<Set<T>>();
        Set<T> S = new HashSet<T>();
        P.add(S);
        if(X.isEmpty()) {
            return P;
        }
        else {
            while(!X.isEmpty()) {
                T f = X.remove(0);
                int size = P.size();
                for(int i = 0; i < size; i++) {
                    S = new HashSet<T>();
                    S.add(f);
                    S.addAll(P.get(i));
                    P.add(S);
                }
            }
        }
        return P;
    }

    public static void main(String[] args) {
        int[] a={2,4,6,1};
        List<Integer> nums=new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(7);
        List<String>names=new ArrayList<>();
        names.add("Dove");
        names.add("Aman");
        names.add("Max");


        System.out.println(powerSet(nums));
        System.out.println(powerSet(names));
    }
}
