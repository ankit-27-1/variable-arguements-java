public class arguements{
    public static void main(String[] args) {
        fun(1,2,3,4,56 );
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
