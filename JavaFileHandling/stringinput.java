import java.io.*;  

public class stringinput {  
    public static void main(String args[])throws Exception{    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   

        System.out.println("Enter string: ");
        String s = br.readLine();

        try {
            FileOutputStream fout = new FileOutputStream("abc.txt"); 
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                fout.write(c);
            }     
            fout.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }

        br.close();    
    }    
}   