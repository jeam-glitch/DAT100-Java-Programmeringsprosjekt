package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

       for (int i = 0; i < usage.length; i++) {
            System.out.println("Månedlig strømforbruk");
            double[] day_usage = usage[i];
            System.out.print("Dag " + (i + 1) + ":");
            DailyPower.printPowerUsage(day_usage);
            System.out.println("");
        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int i = 0; i < prices.length; i++){
            System.out.println("Månedlig strømpriser");
            double[] day_prices = prices[i];
            System.out.print("Month " + (i + 1) + ":");
            DailyPower.printPowerPrices(day_prices);
            System.out.println("");

        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {
        // TODO
        double sum = 0;
        for (int i = 0; i < usage.length; i++) {
            sum += DailyPower.computePowerUsage(usage[i]);
        }
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        // TODO

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        // TODO

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        // TODO

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        // TODO

        return price;
    }
}
