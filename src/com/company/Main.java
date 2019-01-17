package com.company;

public class Main {

    public static void main(String[] args) {
        double[] scan = random(12);
        double[] scan2 = random(6);

        SkyView sv1 = new SkyView(4, 3, scan);
        SkyView sv2 = new SkyView(3, 2, scan2);

        sv1.print();
        sv2.print();

        System.out.println("Average 1: " + sv1.getAverage(1, 3, 0, 2));
        System.out.println("Average 2: " + sv2.getAverage(0, 1, 0, 1));
    }

    public static double[] random(int len){
        double[] output = new double[len];

        for(int i = 0; i < len; i++){
            output[i] = Math.random() * 1.6;
        }

        return output;
    }
}
