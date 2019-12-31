package ch4.data;
public class Encrypt {   
   public static String encrypt(String sourceString,String password) { 
       char [] p= password.toCharArray();
       int n = p.length;
       char [] c = sourceString.toCharArray();
       int m = c.length; 
       for(int k=0;k<m;k++){
            int mima=c[k]+p[k%n];
            c[k]=(char)mima; 
       }
       return new String(c);    
    }
}



