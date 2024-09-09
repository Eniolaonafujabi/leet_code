public class MergeStringsAlternately {
public String mergeAlternately(String word1, String word2) {
       String mergedNumber = "";
        int counter = 0;
        int counter1 =1;
       if(word1.length() == word2.length()){
        for(int count = 0; count<word1.length();count++){
            mergedNumber+=word1.charAt(count);
            for(;counter<counter1;counter++){
                mergedNumber+=word2.charAt(counter);
            }
            counter1++;
        }

       }
        int counter2 = 0;
        int counter3 =1;
       if(word1.length() < word2.length()){
        for(int count = 0; count<word1.length();count++){
            mergedNumber+=word1.charAt(count);
            for(;counter2<counter3;counter2++){
                mergedNumber+=word2.charAt(counter2);
            }
            counter3++;
        }
        String newString = word2.substring(word1.length());
        mergedNumber+=newString;
       }

        int counter4 = 0;
        int counter5 =1;
       if(word1.length() > word2.length()){
        for(int count = 0; count<word2.length();count++){
            mergedNumber+=word1.charAt(count);
            for(;counter4<counter5;counter4++){
                mergedNumber+=word2.charAt(counter4);
            }
            counter5++;
        }
        String newString = word1.substring(word2.length());
        mergedNumber+=newString;
       }
       return mergedNumber;
    }
}
