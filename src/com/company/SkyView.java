package com.company;

public class SkyView {

    private double[][] view;

    public SkyView(int numCols, int numRows, double[] scanned){

        view = new double[numCols][numRows];

        numCols--;
        numRows--;
        for(int i = 0; i < scanned.length; i++){
            if((i / numCols) % 2 == 0) {
                view[i / numCols][i % (numRows + 1)] = scanned[i];
            }
            else{
                view[i / numCols][numRows - i % (numRows + 1)] = scanned[i];
            }
        }
    }

    public void print(){
        for(int i = 0; i < view.length; i++){
            for(int j = 0; j < view[i].length; j++){
                if(i % 2 == 0) {
                    System.out.println(i + " " + j);
                    System.out.print(view[i][j] + " ");
                }
                else{
                    System.out.println(i + " " + (view.length - j));
                    System.out.print(view[i][view.length - j] + " ");
                }
            }
            System.out.println();
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol){
        double total = 0;

        for(int i = startRow; i < endRow; i++){
            for(int j = startCol; i < endCol; j++){
                total += view[i][j];
            }
        }

        return total / ((startRow - endRow) * (startCol - endCol));
    }
}
