package recursion;

public class Sum {
    public static void main(String[] args) {

        sum(1);
    }

    static void sum(int n){

        if (n==5){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        sum(n+1);
    }
}
