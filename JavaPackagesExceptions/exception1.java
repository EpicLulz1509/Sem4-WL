public class exception1 {
    public static void main(String[] args) {  
        int[] arr = {0,1,2,3};   
        try {
            for(int i=0;i<=arr.length;i++) {       
                System.out.println(arr[i]);      
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught ");
        }
        
    }
}
