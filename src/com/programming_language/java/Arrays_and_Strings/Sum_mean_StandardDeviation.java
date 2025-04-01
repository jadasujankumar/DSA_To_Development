package com.programming_language.java.Arrays_and_Strings;

public class Sum_mean_StandardDeviation {

    public static void main(String[] args) {
        int marks[] = {8,2,6,4,3};
        int sum=0,sumsq=0;
        for(int i=0;i<marks.length;i++)
        {
            sum = sum+marks[i];
            sumsq = sumsq+marks[i]*marks[i];
        }
        double mean = (double)sum/marks.length;

        double standDeviation = Math.sqrt((double)sumsq/ marks.length-mean*mean);

        System.out.printf("%.2f\n",mean);
        System.out.printf("%.2f",standDeviation);
    }
}
