package importants;

import java.util.*;
import java.lang.*;
import java.io.*;

public class rockpaperscissor {
    private static int handchange(int n, int a, String s) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;

        for(int i = 1; i < n; i++) {

            if(a == n-1) {
                return count;
            }

            if(i < a) {
                continue;
            }

            if(i == a) {
                if(sb.charAt(i-1) == 'P') {
                    sb.insert(a, 'S');
                }
                if(sb.charAt(i-1) == 'R') {
                    sb.insert(a, 'P');
                }
                if(sb.charAt(i-1) == 'S') {
                    sb.insert(a, 'R');
                }
            }


            if(sb.charAt(i-1) == 'R'){
                if(sb.charAt(i) != 'P') {
                    count = count + 1;
                    sb.setCharAt(i, 'P');
                }
            }else if(sb.charAt(i-1) == 'P') {
                if(sb.charAt(i) != 'S') {
                    count = count + 1;
                    sb.setCharAt(i, 'S');
                }
            }else if(sb.charAt(i-1) == 'S') {
                if(sb.charAt(i) != 'R') {
                    count = count + 1;
                    sb.setCharAt(i, 'R');
                }
            }
        }

        return count;
    }
    public static void main(String args[]) {
        System.out.println(handchange(5,2,"PSSS"));
    }
}





/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        String s="PSSS";
        int a=2;
        int n = 5;
        int count=-1;
        char x='Q';
        char p[]=new char[(s.length()+1)];
        boolean flag=true;
        for(int i=0;i<p.length;i++)
        {
            if(i!=a&&flag==true)p[i]=s.charAt(i);
            else if(i!=a&&flag!=true)p[i]=s.charAt(i-1);
            else
            {
                flag=false;
                p[i]=x;
            }
        }
        int i=p.length;
        while(i>1)
        {
            char temparray[]=new char[(i/2+i%2)];
            for(int j=0;j<i;j+=2)
            {
                if(j+1<i)
                {
                    if(j!=a&&(j+1)!=a){
                        if((p[j]=='S'&&p[j+1]=='S')||(p[j]=='P'&&p[j+1]=='P')||(p[j]=='R'&& p[j+1]=='R')||(p[j]=='L'&& p[j+1]=='L')) temparray[(j/2+j%2)]='L';

                        else if((p[j]=='S'&&p[j+1]=='R')||(p[j]=='R'&&p[j+1]=='S')||(p[j]=='R'&&p[j+1]=='L')) temparray[(j/2+j%2)]='R';

                        else if((p[j]=='S'&&p[j+1]=='P')|| (p[j]=='S'&& p[j+1]=='L') || (p[j]=='P'&&p[j+1]=='S')) temparray[(j/2+j%2)]='S';

                        else if((p[j]=='R'&&p[j+1]=='P')||(p[j]=='P'&&p[j+1]=='R')||(p[j]=='P'&&p[j+1]=='L')) temparray[(j/2+j%2)]='P';
                    }
                    else
                    {
                        if(j==a)
                        {
                            if(p[j+1]=='S')temparray[(j/2+j%2)]='R';
                            else if(p[j+1]=='R')temparray[(j/2+j%2)]='P';
                            else if(p[j+1]=='P')temparray[(j/2+j%2)]='S';
                            else if(p[j+1]=='L')temparray[(j/2+j%2)]=x;
                            else{}
                            if(x!=temparray[(j/2+j%2)])
                            {
                                count++;
                                x=temparray[(j/2+j%2)];

//                                System.out.println(x);
                            }
                        }
                        else
                        {
                            if(p[j]=='S')temparray[(j/2+j%2)]='R';
                            else if(p[j]=='R')temparray[(j/2+j%2)]='P';
                            else if(p[j]=='P')temparray[(j/2+j%2)]='S';
                            else if(p[j]=='L')temparray[(j/2+j%2)]=x;
                            else{}
                            if(x!=temparray[(j/2+j%2)])
                            {
                                count++;
                                x=temparray[(j/2+j%2)];

//                                System.out.println(x);
                            }
                        }
                    }
                }
                else
                {
                    temparray[(j/2+j%2)]=p[j];
                }
            }
            a=(a/2);
            i=(i/2+i%2);
            p=null;
            p=temparray;
        }
        if(count<=0)
            System.out.println(0);
        else
            System.out.println(count);
    }
}