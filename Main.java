import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        printLine();
        System.out.print("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        switch (minutes%10) {
            case 0:
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
                System.out.println("Green");
                break;
            case 3:
            case 4:
            case 8:
            case 9:
                System.out.println("Red");
                break;
        }
        printLine();
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        int numberOfDigits = numberOfDigits(number);
        System.out.println("Number of digits : "+numberOfDigits);
        System.out.println("Has number greater than 4 : "+hasNumberGreaterFour(number));
        System.out.print("Reverse number : ");
        printReverseNumber(number);

        printLine();
        int[] array = new int[12];
        randomArray(array);
        int max = maxNumber(array);
        int min = minNumber(array);
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Average of half array : "+average(array));
        int []arrayB = evenArray(array);
        System.out.println(Arrays.toString(arrayB));
        int []arrayC = oddArray(array);
        System.out.println(Arrays.toString(arrayC));


    }
    public static int[] oddArray(int[]arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1)count++;
        }
        int[] oddArray = new int[count];
        count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                oddArray[count] = arr[i];
                count++;
            }
        }
        return oddArray;
    }
    public static int[] evenArray(int[]arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)count++;
        }
        int[] evenArray = new int[count];
        count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenArray[count] = arr[i];
                count++;
            }
        }
        return evenArray;
    }

    public static double average(int[]arr){
        int len = arr.length/2;
        int sum = 0;
        for(int i = (arr.length-1);i>len;i--){
            sum+=arr[i];
        }
        double result = (double) sum/(double)len;
        return result;
    }
    public static int maxNumber(int[] arr){
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int minNumber(int[] arr){
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void randomArray(int[] arr){
        for(int i = 0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*9);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void printLine(){
        System.out.println("---------------------------------");
    }

    public static int numberOfDigits(int number){
        int count = 0;
        while (number>0){
            int digit = number%10;
            number/=10;
            count++;
        }
        return count;
    }
    public static boolean hasNumberGreaterFour(int number){
        boolean result = false;
        while (number>0){
            int digit = number%10;
            number/=10;
            if (digit>4){
                result = true;
            }
        }
        return result;
    }
    public static void printReverseNumber(int number){
        while (number>0){
            int digit = number%10;
            number/=10;
            System.out.print(digit);
        }
        System.out.println();
    }

}