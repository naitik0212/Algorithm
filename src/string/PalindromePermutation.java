package string;

public class PalindromePermutation {

        private static boolean isPal(String s) {
            s = s.toLowerCase();
            boolean isOdd = false;
            int[] counter = new int[128];
            for (int i = 0; i < s.length(); i++) {
                counter[s.charAt(i)]++;
            }

            for(int i = 0; i < counter.length -1; i++){
                if(counter[i]%2 == 1){
                    if(isOdd){
                        return false;
                    }
                    isOdd = true;
                }
            }


            return true;
        }

        public static void main(String[] args) {
            System.out.println(isPal("Hello"));
            System.out.println(isPal("tacocat"));
        }

    }


