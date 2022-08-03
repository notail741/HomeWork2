public class Main {
    public static void main(String[] args) {
        // Задача 1.
        byte a = 1;

        short b = 100;

        int c = 1000;

        long d = 10000L;

        float e = 1.4F;

        double f = 1.44;

        boolean bool = false;

        char cahrOne = 'C' ;

        //Задача 2.
        float boxerOneWeight = 78.2F;

        float boxerTwoWeight = 82.7F;

        float sumWeight = boxerOneWeight + boxerTwoWeight;

        float differnceWeight = Math.abs(boxerOneWeight - boxerTwoWeight);

        System.out.println("Общий вес двух бойцов " + sumWeight + "кг");

        System.out.println("Разница между весом двух бойцов составляет " + differnceWeight + "кг");

        // Задача 3.

        short bananaAmount = 5;
        short bananaGramm = 80;
        var bananaAllGrams = bananaAmount * bananaGramm;
        short milkAmount = 2;
        short milkGramm = 105;
        var milkAllGrams = milkAmount * milkGramm;
        short plombirAmount = 2;
        short plombirGramm = 100;
        var plombirAllGrams = plombirAmount * plombirGramm;
        short eagsAmount = 4;
        short eagsGramm = 70;
        var eagsAllGramms = eagsAmount * eagsGramm;
        var breackfast = bananaAllGrams + milkAllGrams + plombirAllGrams + eagsAllGramms;

        System.out.println("Общее количесто грамм за завтрак составит " + breackfast + " грамм");

        float WeightBreackfast = breackfast / 1000F;

        System.out.println("Вес завтрака в килограммах равен " +  WeightBreackfast + "кг");


        //Задача 4

        var weightToBeLost = 7;
        var gramsInKg = 1000;
        var weightInGramms = weightToBeLost * gramsInKg;
        var dietCorrectionOne = 250;
        var dietCorrectionTwo = 500;
        int maxPerDays = weightInGramms / dietCorrectionOne ;
        int minPerDays = weightInGramms / dietCorrectionTwo ;
        double averageDays = (minPerDays + maxPerDays) / (2 * 1.0);

        System.out.println("При первом рационе спортсмен похудеет за " + minPerDays + " дней");
        System.out.println("При втором рационе спортсмен похудеет за " + maxPerDays + " дней ");
        System.out.println("В среднем на похудение уйдет " + averageDays + " день");

        // Задача 5

        int percent = 10 ;
        double multipler = percent / (100 * 1.0) ;

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int krisitinaSalary = 76_230;

        int mashaNewSalary = (int) (mashaSalary + (mashaSalary * multipler));
        int denisNewSalary = (int) (denisSalary + (denisSalary * multipler));
        int krisitinaNewSalary = (int) (krisitinaSalary + (krisitinaSalary * multipler));

        int mashaDifference = (mashaNewSalary - mashaSalary) * 12;
        int denisDifference = (denisNewSalary - denisSalary) * 12;
        int kristinaDifference =(krisitinaNewSalary - krisitinaSalary) * 12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + krisitinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");
    }
}

