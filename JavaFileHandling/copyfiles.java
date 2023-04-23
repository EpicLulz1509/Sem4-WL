import java.io.*;

public class copyfiles {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream("abc.txt"); 
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
        
        try {
            fout = new FileOutputStream("xyz.txt"); 
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
        try {
            while(true){
                int ch = fin.read();
                if(ch != -1)
                    fout.write(ch);
                else
                    break;
            }            
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
        
    }
}

// wap to captalize first letter every word in file