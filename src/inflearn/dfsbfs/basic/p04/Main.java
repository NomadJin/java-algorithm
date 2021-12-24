package inflearn.dfsbfs.basic.p04;

public class Main {
    static int[] fib;
    public static void main(String[] args) {
        Main T = new Main();
        int n = 45;
        //DFS stack frame 사용은 성능이 떨어진다...순회로 계속 호출하지 않는다.
        //fib 라는 static 배열을 만들어 재귀함수의 중간 결과를 배열로 넣어준다.
        //중간 정도 개선된 부분
        //메모이제이션을 활용해야 한다.
        fib = new int[n+1];
        T.DFS(n);
        for(int i = 1; i <= n ; i++) {
            System.out.print(fib[i] + " ");
        }
    }

    //피보나치 수열
    public int DFS(int n) {
        //메모이제이션을 활용해야 한다.
        //fib 에서는 이미 값이 생성되어 있기 때문에 재귀로 하지 않고 바로 값을 꺼내서 사용한다.
        if(fib[n] > 0) {
            return fib[n];
        }
        if (n == 1) return fib[n] = 1;
        else if (n == 2) return fib[n] = 1;
        else return fib[n] = DFS(n-2) + DFS(n-1);
    }

}
