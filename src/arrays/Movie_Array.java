package arrays;

import java.util.Scanner;

class MovieRevenue {
    int revenue[][][];
    int investment = 100; // 100crores
    int previousProfit = 80; // 80crores

    Scanner sc = new Scanner(System.in);

    void createRevenueArray() {
        revenue = new int[3][][]; // 3 Movies

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number of categories in movie " + (i + 1));
            revenue[i] = new int[sc.nextInt()][];

            for (int j = 0; j < revenue[i].length; j++) {
                System.out.print("Enter number of languages in category " + (j + 1));
                revenue[i][j] = new int[sc.nextInt()];
            }
        }
    }

    void collectRevenue() {
        for (int i = 0; i < revenue.length; i++) {
            System.out.println("For Movie " + (i + 1));
            for (int j = 0; j < revenue[i].length; j++) {
                for (int k = 0; k < revenue[i][j].length; k++) {
                    System.out.print("Enter revenue for Category " + (j + 1) + ", Language :" + (k + 1));
                    revenue[i][j][k] = sc.nextInt();
                }
            }
        }
    }

    void displayResult() {
        int totalRevenue = 0;

        for (int i = 0; i < revenue.length; i++) {
            System.out.println("Movie " + (i + 1));
            for (int j = 0; j < revenue[i].length; j++) {
                for (int k = 0; k < revenue[i][j].length; k++) {
                    System.out.println("Revenue for Category " + (j + 1) + ", Language " + (k + 1) + ": " + revenue[i][j][k] + " crores");
                    totalRevenue += revenue[i][j][k];
                }
            }
        }

        int profit = totalRevenue - investment;
        System.out.println("Total Revenue: " + totalRevenue + " crores");
        System.out.println("Total Investment: " + investment + " crores");
        System.out.println("Net Profit: " + profit + " crores");

        if (profit > 0) {
            System.out.println("Tharun is in Profit");
        } else {
            System.out.println("Tharun is in Loss");
        }

        if (profit > previousProfit) {
            System.out.println("More profit than previous year by " + (profit - previousProfit) + " crores");
        } else if (profit == previousProfit) {
            System.out.println("Same profit as previous year");
        } else {
            System.out.println("Less profit than previous year by " + (previousProfit - profit) + " crores");
        }
    }
}

public class Movie_Array {
    public static void main(String[] args) {
        MovieRevenue mr = new MovieRevenue();
        mr.createRevenueArray();
        mr.collectRevenue();
        mr.displayResult();
    }
}
