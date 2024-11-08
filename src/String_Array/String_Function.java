package String_Array;

public class String_Function {
    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);
        System.out.println();

        // substring - many interviews
        String s1 = "Saranya";
        String s2 = s1.concat("Mohan");
        System.out.println(s2);
        System.out.println();

        String fruits = "apple,banana,cherry"; // delimter = ,
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);
        System.out.println();

        String fruits2 = "ABC-XYZ-QWE"; // delimter = ,
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);
        System.out.println();

        String s4 = "Saranya";
        System.out.println(s4.charAt(0));
        System.out.println();
        //System.out.println(s4.charAt(10)); //StringIndexOutOfBoundsException

        String s5 = " Saranya ";
        System.out.println(s5.trim());
        System.out.println();

        String s6 = "Saranya";
        System.out.println(s6.indexOf("r"));
        System.out.println(s6.indexOf("a"));
        System.out.println();

        String s7 = "Saranya";
        System.out.println(s7.contains("ra"));
        System.out.println(s7.contains("ya"));
        System.out.println();

        String s8 = "SaranyaMohan";
        System.out.println(s8.lastIndexOf("n"));
        System.out.println();

        String s9 = "SaranyaMohan";
        System.out.println(s9.replace("a","o"));
        System.out.println(s9.replaceAll("r","s"));
        System.out.println();

        String s10 = "SaranyaMohanOri";
        System.out.println(s10.startsWith("Sara"));
        System.out.println(s10.endsWith("ri"));
        System.out.println();

        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);
        System.out.println();

        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);
        System.out.println();

        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);
        System.out.println();
    }
}
