package com.blackflower.quizwork;

public class QuizWork {

    public static void main(String[] args) {
        
        //------------------- CALCULATE AREA OF THE CIRCLE ------------------------------
        {
            float radius = 15f;
            
            double area = Math.PI * radius * radius;
            System.out.println("Area of the circle is = " + area);
        }
        
        //------------------- CALCULATE CIRCUMFERENCE OF THE CIRCLE------------------------------
        {
            float radius = 15f;
            double circumference;
            
            circumference = 2 * Math.PI * radius;
            System.out.println("Circumference of the circle is = " + circumference);
        }
        
        //------------------- CALCULATE AVARAGE OF GIVEN NUMBERS ------------------------------
        {
            int a = 5, b = 8, c = 4;
            
            float average = (float)(a + b + c) / 3;
            System.out.println("Average of " + a + ", " + b + ", " + c + ", is " + average);
        }
        
        //------------------- SWAP TWO VARIABLE'S VALUES USING TEMP VALUE ------------------------------
        {
            int num1 = 2, num2 = 5;
            int tempNum = num1;
            
            num1 = num2;
            num2 = tempNum;
            
            System.out.println("num1: " + num1 + " num2: " + num2);
        }
        
        //------------------- SWAP TWO VARIABLE'S VALUES WITHOUT USING TEMP VALUE ------------------------------
        {
            int num1 = 2, num2 = 5;
            
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 -= num2;
            
            System.out.println("num1: " + num1 + " num2: " + num2);
        }
        
        //------------------- FIND LAST DIGIT OF AN INT ------------------------------
        {
            int number = 355;
            int lastDigit = (number / 10) * 10;
            
            lastDigit = number - lastDigit;
            
            System.out.println("Last digit of " + number + " is: " + lastDigit);
        }
        
        //------------------- FIND REVERSE VERSION OF AN INT ------------------------------
        {
            int number = 355;
            
            int lastDigit = (number / 10) * 10;
            lastDigit = number - lastDigit;
            
            int midDigit = (number / 100) * 10;
            midDigit = (number / 10) - midDigit;
            
            int firstDigit = number / 100;
            
            int reverseNum = (lastDigit * 100) + (midDigit * 10) + firstDigit;
            System.out.println("Reverse version of " + number + " is: " + reverseNum);
        }
        
        //------------------- FIND LAST DIGIT OF AN INT WITH USING MOD OPERATOR ------------------------------
        {
            int number = 35;
            
            int lastDigit = number % 10;
            int firstDigit = number / 10;
            
            int reverseNum = (lastDigit * 10) + firstDigit;
            System.out.println("Reverse version of " + number + " is: " + reverseNum);
        }
        
        //---------------------- ------Check The Number is Even Or Odd---------------------------
        {
            int number = 34;
            
            boolean isEven = (number % 2 == 0);
            System.out.println("Is number even: " + isEven);
        }
        
        //----------------------Find The BIGGEST Number----------------------
        {
            int num1 = 5, num2 = 8, num3 = -12;
            
            int biggestNum = (num1 > num2) ? num1 : num2;
            biggestNum = (biggestNum > num3) ? biggestNum : num3;
            
            System.out.println("Biggest number between " + num1 + ", " + num2 + ", " + num3 + " is: " + biggestNum);
        }
        
        //----------------------- FIND GIVEN NUMBER HAS VOWEL CHARACTER VALUE OR NOT ---------------------------------------
        {
            int number = 65;
            char a = 'A', e = 'E', i = 'I', o = 'O', u = 'U'; 
            
            char numChar = (char)number;
            boolean isIncludeVowel = (numChar == a || numChar == e || numChar == i || numChar == o || numChar == u);
            
            System.out.println("Is inserted number has vowel character value: " + isIncludeVowel);
        }
        
        //----------------------------Find How Many Characters Between 2 Letters -----------------------------------
        {
            char firstLetter = 'A';
            char secondLetter = 'O';
            
            int space = (int)firstLetter - (int)secondLetter;
            space = (space < 0) ? space * -1 : space; 
            
            System.out.println("There is " + space + "character between " + firstLetter + " and " + secondLetter);
        }
        
        //---------------------------DISPLAY FOLLOWING CHARACTERS OF GIVEN CHAR -----------------------------
        {
            char startingPoint = 'A';
            
            startingPoint = (char)(startingPoint + 1);
            System.out.println(startingPoint);
            
            startingPoint = (char)(1 + startingPoint);
            System.out.println(startingPoint);
            
            startingPoint++;
            System.out.println(startingPoint);
            
            startingPoint += 1;
            System.out.println(startingPoint);
            
            ++startingPoint;
            System.out.println(startingPoint);
        }
        
        //--------------------------- FIND THE LENGHT OF GIVEN INT -----------------------------
        {
            int number = 3598;
            
            int length = (int)(Math.log10(number)) + 1;
            System.out.println("There is/are " + length + " number in " + number);
        }
    }
}
