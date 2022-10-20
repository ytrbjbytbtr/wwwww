/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
 
    public static void main(String[] args) {
        String word = "fdfdfdAWSfevbbgmjfjar";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.lastIndexOf(word.charAt(i)) != (word.indexOf(word.charAt(i)))) {
                str.append(")");
            } else str.append("(");
        }
        System.out.println(str);
    }
}