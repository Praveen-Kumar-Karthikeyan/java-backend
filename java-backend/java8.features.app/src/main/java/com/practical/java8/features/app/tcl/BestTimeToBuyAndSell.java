package com.practical.java8.features.app.tcl;

public class BestTimeToBuyAndSell {

    public static void main(String[] args) {

        int[] array = {8, 7, 6, 5, 10};
        int maxProfit = 0;
        int cp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < cp)
                cp = array[i];
            else {
                int profit = array[i] - cp;
                if (profit > maxProfit)
                    maxProfit = profit;
            }
        }

        System.out.println("Best price to Buy " + cp);
        System.out.println("Best price sold " + (cp + maxProfit));
        System.out.println("Max Profit earned " + maxProfit);

    }
}
