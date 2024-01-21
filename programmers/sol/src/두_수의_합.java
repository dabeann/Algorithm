import java.math.BigInteger;

class 두_수의_합 {
    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);

        String answer = sum.toString();

        return answer;
    }
}