package com.company;

public class SkyView {

    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned){
        this.view = new double[numRows][numCols];
        for(int i = 0; i < scanned.length; i++){
            if((i / numCols) % 2 == 0) {
                this.view[i / numCols][i % numRows] = scanned[i];
            }
            else{
                this.view[i / numCols][numRows - i % numRows] = scanned[i];
            }
        }
    }
}
