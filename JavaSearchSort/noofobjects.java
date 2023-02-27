public class noofobjects {
    static int count = 0;
    public noofobjects(){
        count++;
    }
    public static void main(String[] args) {
        noofobjects ob1 = new noofobjects();
        noofobjects ob2 = new noofobjects();
        noofobjects ob3 = new noofobjects();
        noofobjects ob4 = new noofobjects();
        System.out.println("No of objects: " + count);
    }
}
