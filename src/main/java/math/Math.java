package math;

public class Math {

    public static int findMax(int [] numbers){
        int max = Integer.MIN_VALUE;

        for(int number:numbers){
            if(number>max) {
                max = number;
            }
        }
        return max;
    }

    public static int calculateSum(int [] numbers){
        int sumNumber=0;
        for (int number : numbers){
            sumNumber += number;
        }
        return sumNumber;
    }

    public static float calculateAverage(int [] numbers){

            return Math.calculateSum(numbers) / (float) numbers.length;

    }

    public static long calculateFactorial(long number){
        long factorial=1;
        for(long i=0; i<number;i++){
            factorial *= i+1;
        }
        return factorial;
    }

    public static int multiplicationArrayNumber(int [] numbers){
        int multiplication=1;
        for (int number : numbers){
            multiplication *= number;
        }
        return multiplication;
    }

}
