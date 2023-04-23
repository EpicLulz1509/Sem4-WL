import java.io.*;

public class capitalize {
    public static void main(String[] args) {
        String s = "";
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream("xyz.txt"); 
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
        
        
        try {
            while(true){
                int ch = fin.read();
                if(ch != -1)
                    s = s + (char)ch;
                else
                    break;
            }            
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
        System.out.println(s);
        
        // 

        char c = s.charAt(0);
        int n = c;
        n = n - 32;
        c = (char)n;

        try {
            fout = new FileOutputStream("cap.txt"); 
            fout.write(c);
            for(int i = 0; i < s.length()-1; i++){
                c = s.charAt(i);
                n = c;
                char c1 = s.charAt(i+1);
                int n1 = c1;
                
                if(n == 32){
                    n1 = n1 - 32;
                    fout.write((char)n1);
                }
                else
                    fout.write((char)n1);
            }
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
        

        
    }
}
