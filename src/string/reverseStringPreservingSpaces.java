package string;

public class reverseStringPreservingSpaces {
    public static void main(String args[]){
        reverseStringPreservingSpace("Java");

        reverseStringPreservingSpace("All Isa Well");

        reverseStringPreservingSpace("Done And Gone");
    }

    private static void reverseStringPreservingSpace(String s){
        char[] a = s.toCharArray();
        char[] resultArray = new char[a.length];

        for(int i =0; i< a.length; i++) {
            if (a[i] == ' ') {
                resultArray[i] = ' ';
            }
        }
            int j = resultArray.length-1;

            for (int i = 0; i < a.length; i++)
            {
                if (a[i] != ' ')
                {

                    if(resultArray[j] == ' ')
                    {
                        j--;
                    }

                    resultArray[j] = a[i];

                    j--;
                }
            }

            System.out.println(s + " reverses to-->  "+String.valueOf(resultArray));
        }
        }