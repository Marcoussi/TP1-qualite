package tp1;

public class Add {

    public static void main(String argv[]){
        int a = 2;
        int b = 1;
        add(a,b);
    }

    public static int add(int a, int b) {
        int res;
        res = a + b;
        System.out.println(res);
        return res;
    }

}