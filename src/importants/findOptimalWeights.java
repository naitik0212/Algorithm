package importants;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Pair{
    double first;
    double second;

    public Pair(double first, double second) {
        this.first = first;
        this.second = second;
    }
}


public class findOptimalWeights {
    private static Pair findOptimalWeights(int numContainers, double maxCapacity, double[] containersWt){
        Pair a = new Pair(0,0);
        Double max = 0.0;
        for(int i = 0; i < numContainers; i++){
            for (int j = i+1; j < numContainers; j++) {
                Double temp = containersWt[i]+containersWt[j];
                if(max < temp && temp <= maxCapacity){
                    max = temp;
                    a.first= containersWt[i];
                    a.second = containersWt[j];
                }
            }
        }
        return a;
    }

    private static Pair findOptimalWeights1(int numContainers, double maxCapacity, double[] containersWt){
        double max = 0;
        Pair a = new Pair(0,0);
        Arrays.sort(containersWt);
        int i, j;
        int p=0,q=0;

        for(i = 0, j = containersWt.length - 1; i < numContainers && j >= 0;){

            double temp = containersWt[i] + containersWt[j];
            if(temp < maxCapacity){
                if(temp > max) {
                    max = temp;
                    p = i;
                    q = j;
                }else{
                    i++;
                }
            }else{
                j--;
            }
        }
        a.first = containersWt[p];
        a.second = containersWt[q];

        return a;
    }

    public static void main(String args[]) {
        double al[] = new double[] {7.33,8.13 , 103.7313, 11.24, 23.79, 18.3501};
        Pair a = findOptimalWeights1(6,43.3, al);
//        Pair b = findOptimalWeights(6,43.3, al);


        System.out.println(a.first);
        System.out.println(a.second);

//        System.out.println(b.first);
//        System.out.println(b.second);
    }
}
