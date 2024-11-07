package Task;

public class Palindrome {
    public static void main(String[] args) {
        String str = "MALAYALAM";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }

        if(str.equals(rev)){  //  To compare the content of str and rev
            System.out.println("Given string " + str + " is palindrome" );
        }
        else {
            System.out.println("Given string " + str + " is not a palindrome string.");
        }
    }
}
