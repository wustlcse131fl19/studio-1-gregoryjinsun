package studio1;

import support.cse131.ArgsProcessor;
public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        double n1 = ap.nextInt("Please enter the first number to be averaged.");
        double n2 = ap.nextInt("Please enter second number to be averaged.");
        double average=((n1)+(n2))/2;
        //double remainder=(n1+n2)%2;

        System.out.println(average);


}}
