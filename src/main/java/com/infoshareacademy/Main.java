package com.infoshareacademy;



public class Main {
    public static void main (String[] args) {
        double positiveTemprature = 10;
        double negativeTemprature = -10;

        isTemperaturePositive(positiveTemprature);
        isTemperaturePositive(negativeTemprature);
    }
    private static boolean isTemperaturePositive(double temperature){
        boolean isPositive = temperature > 0;

       if (temperature > 0){
           System.out.println( "Temeratura wynosi : " + temperature + " i jest dodatnia");
       }
       else  {
           System.out.println( "Temperatura wynosi : " + temperature + " i nie jest dodatnia");
       }
       return isPositive;
    }
}

