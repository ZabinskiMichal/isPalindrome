package pl.zabinski;

public class Main {

    public static void main(String[] args) {
	/*
	Ex. mom, dad, race car,
	concept is easy, we need to reverse string and then compare charecters
	 */
        String original = "race car";
        //to solve ptoblem with spaces is to replace space with no char
        original = original.replace(" ","");

        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);

        }

        boolean palindrome = true;

        for(int i = 0; i<original.length(); i++){
            if(original.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
        }

        if(palindrome){
            System.out.println("Your word is palindrome");
        }else{
            System.out.println("Your wold is not palindrome");
        }




    }
}



