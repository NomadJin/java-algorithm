package interview.array;

public class Reverse {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.solution2("Hello".toCharArray()));
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }

    //가장 단순한 방법 O(n), O(n)
    private char[] solution1(char[] message) {
        char[] reversedMessage = new char[message.length];
        // 4 - 4 -> 0
        // 4 - 3 -> 1
        for (int i = message.length - 1; i >= 0; i--) {
            reversedMessage[message.length - 1 - i] = message[i];
        }
        return reversedMessage;
    }

    // swap 하는 방법
    private char[] solution2(char[] message) {
        for(int i = 0 ; i < message.length / 2 ; i++) {
           char temp = message[i];
           message[i] = message[message.length - 1 - i];
           message[message.length -1 - i] = temp;
        }
        return message;
    }

    //String bulider
}
