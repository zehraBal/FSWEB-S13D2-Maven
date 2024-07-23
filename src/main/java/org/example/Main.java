package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(1213));
        System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords(456));
    }
    public static boolean isPalindrome(int number){
        int reversed=0;
        int orgNum=number;

    while(number !=0){
        int digit=number%10;
        reversed=reversed*10 + digit;
        number /=10;
    }

     return orgNum==reversed;

    }

    public static boolean isPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum +=i;
            }
        }
    return (num>0 && sum==num);
    }

    public static String numberToWords(int num) {
        String[] numbersInEnglish= {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        int orgNum=num;
        if(orgNum==0){
            return numbersInEnglish[0];
        } else if (orgNum<0) {
            return "Invalid Value";
        }
        StringBuilder word = new StringBuilder();
        while(num!=0){
            int digit=num%10;
          word.insert(0,numbersInEnglish[digit]+" " )  ;
          num /= 10;
          }

    return word.toString().trim();
    }

}
