public class FibonacciRecursive {

    static int fib(int n){

        if (n==2 || n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args){
        // 1 1 2 3 5 8 13 21 34...
        System.out.println(fib(6));
    }
    //fib(1)=1
    //fib(2)=1
    //fib(n)=fib(n-1)+fib(n-2)
    //fib(5)=fib(4)+fib(3)
    //fib(4)=fib(3)+fib(2)
    //fib(3)=fib(2)+fib(1)
}
