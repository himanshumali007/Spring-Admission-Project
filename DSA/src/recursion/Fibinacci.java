package recursion;

public class Fibinacci {

    public static void main(String[] args) {

        System.out.println(findFibo(7));

    }
    static int findFibo(int n){

        //BASE CONDITION where the code stops
        if (n==1){
            return 1;
        }
        if (n==0){
            return 0;
        }

        //problem broken into small problems
        return findFibo(n-1)+findFibo(n-2);
    }

}
