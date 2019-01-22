package string;

//CTCI question
//implemented in char arrays as strings are immutable

public class URLrify {
    public static void main(String[] args) {
        System.out.println(URL("Mr John Smith", 13 ));

    }

    private static String URL(String name, int value) {
        int total = value;
        for(int i = 0; i< name.length(); i ++) {
            if(name.charAt(i) == ' ') {
                total = total + 2;
            }
        }
        char a [] = new char[total];
        for(int i = 0, j =0; i < total; i++,j++){
            if(name.charAt(j)==' '){
                a[i] = '%';
                a[++i] = '2';
                a[++i] = '0';
            }else{
                a[i] = name.charAt(j);
            }
            }
//for(int i = 0; i< value; i++){
//    System.out.print(a[i]);
//
//}

        return String.valueOf(a);
    }

}
