package string;

public class Knuth_Morris_Pratt {
    public static void main(String args[]){
        String str = "abcxabcdabcdabcy";
        String subString = "bcdabcdabc";
        Knuth_Morris_Pratt ss = new Knuth_Morris_Pratt();
        boolean result = ss.KMP(str.toCharArray(), subString.toCharArray());
        System.out.println(result);

    }

    private boolean KMP(char[] text, char[] pattern){
        int lps[] = computeTemporaryArray(pattern);
        int i=0;
        int j=0;
        while(i < text.length && j < pattern.length){
            if(text[i] == pattern[j]){
                i++;
                j++;
            }else{
                if(j!=0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        if(j == pattern.length){
            return true;
        }
        return false;
    }

    private int[] computeTemporaryArray(char[] pattern) {
        int [] temp = new int[pattern.length];
        int index = 0;
        for(int i =0; i< pattern.length;){
            if(pattern[index] == temp[i]){
                temp[i] = index + 1;
                index++;
                i++;
            }else{
                if(index == 0){
                    temp[i] =0;
                    i++;
                }else{
                    index = temp[index-1];
                }
            }
        }

        return temp;
    }

}

//Referred from author tusroy

