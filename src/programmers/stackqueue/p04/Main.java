package programmers.stackqueue.p04;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        int[] prices = new int[] {1, 2, 3, 2, 3};
        int[] result = T.solution(prices);
        for(int x : result) {
            System.out.println(x);
        }
    }

    private int[] solution(int[] prices) {
//        int[] answer = new int[prices.length];
//        int max = Integer.MIN_VALUE;
//        int idx = 0;
//        int time = 0;
//        for (int i = 0; i < prices.length; i++) {
//            max = prices[i];
//            idx = i;
//            time = 0;
//            while (idx < prices.length - 1) {
//                time++;
//                if (max > prices[idx + 1]) {
//                    break;
//                }
//                idx++;
//            }
//            answer[i] = time;
//        }
//        answer[prices.length - 1] = 0;
//        return answer;


        int[] answer = new int[prices.length];

        Stack<Stock> stack = new Stack<>();

        stack.push(new Stock(0, prices[0]));
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            while ((!stack.isEmpty()) && (stack.peek().getCost() > price)) {
                Stock item = stack.pop();
                answer[item.getIdx()] = i - item.idx;
            }
            stack.push(new Stock(i, prices[i]));
        }
        int lastIndex = stack.pop().idx;
        answer[lastIndex] = 0;

        while (!stack.isEmpty()) {
            Stock item = stack.pop();
            answer[item.getIdx()] = lastIndex - item.idx;
        }

        return answer;

    }
}

class Stock {
    int idx;
    int cost;

    public Stock(int idx, int cost) {
        this.idx = idx;
        this.cost = cost;
    }

    public int getIdx() {
        return idx;
    }

    public int getCost() {
        return cost;
    }

}
