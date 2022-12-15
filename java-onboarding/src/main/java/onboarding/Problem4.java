package onboarding;

import java.util.List;

public class Problem4 {

    public static String solution(String word) {
        String answer = "";

        char[] capital = {'Z','Y','X','W','V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N',
                'M', 'L', 'K', 'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
        char[] small = {'z','y', 'x' ,'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n',
                'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};


        for (int i = 0; i<word.length(); i++) {
            if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
                answer += capital[(int) word.charAt(i) - 65];}
            else if ('a' <= word.charAt(i) && word.charAt(i) <= 'z') {
                answer += small[(int) word.charAt(i) - 97];
            }else answer += word.charAt(i);
        }

        return answer;
    }

}
