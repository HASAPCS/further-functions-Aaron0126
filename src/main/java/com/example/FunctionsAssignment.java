package com.example;

public class FunctionsAssignment {

    // TODO: Implement a method that accepts two integers as parameters and returns
    // their sum
    public int sum(int a, int b) {
        return a+b; // Replace with your implementation
    }

    // TODO: Implement a method that accepts a string and returns its reverse
    public String reverseString(String str) {
        String result="";
        for(int i = str.length()-1; i >=0; i--) {
            result += str.charAt(i);    
        }
        return result; 
        // Replace with your implementation
    }

    // TODO: Implement a method to return a greeting message of the format: "Hello, John!"
    public String greeting(String name) {
        return "Hello, " + name + "!"; // Replace with your implementation
    }

    // TODO: Implement a method that accepts an array of integers and returns the
    // maximum value
    public int findMax(int[] arr) {
        int bnum = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>bnum){
                bnum=arr[i];
            }
        }
        return bnum; // Replace with your implementation
    }

    // TODO: Implement a method that accepts a string and returns true if it is a
    // palindrome, false otherwise
    public boolean isPalindrome(String str) {
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true; // Replace with your implementation
    }

    // TODO: Implement a method to find the longest word in a string
    public String findLongestWord(String str) {
        int count = 0;
        int iTni = 0;
        int nCount = 0;
        for (int i = 0; i<str.length();i++){
            if(str.charAt(i) == ' '){
                if(nCount>count){
                    count = nCount;
                    iTni = i-nCount+1;
                }
                nCount = 0;
            }
            nCount++;
        }
        return str.substring(iTni, iTni+count-1); // Replace with your implementation
    }

    // TODO: Implement a method to calculate the average of an array of numbers
    public double calculateAverage(int[] nums) {
        int sum=0;
        for (int num: nums){
            sum+=num;
        }

        return (double) sum/nums.length; // Replace with your implementation
    }

    // TODO: Implement a method to check if a number is prime
    public boolean isPrime(int num) {
        for (int i = 2; i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true; // Replace with your implementation
    }

    // TODO: Implement a method to calculate the power of a number
    public double calculatePower(double base, double exponent) {
        double result = 1.0;
        
        for (int i = 0; i<exponent; i++){
            result *= base;
        }
        return result; // Replace with your implementation
    }

    // TODO: Implement a method to count the occurrences of a character in a string
    public int countCharacterOccurrences(String str, char ch) {
        int count=0;
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)==ch){
                count++;
            }
        }
        return count; // Replace with your implementation
    }

    // TODO: Implement a method to find the largest number in an array
    public int findLargestNumber(int[] nums) {
        int lnum = nums[0];
        for (int i = 0; i<nums.length; i++){
            if (nums[i]>lnum){
                lnum=nums[i];
            }
        }
        return lnum; // Replace with your implementation
    }

    // TODO: Implement a method to calculate the sum of an array
    public int calculateArraySum(int[] nums) {
        int sum = 0;

        for(int num : nums){
            sum+=num;
        }

        return sum; // Replace with your implementation
    }

    
}
