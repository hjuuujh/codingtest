public class Lv1Solution12 {
  // https://school.programmers.co.kr/learn/courses/30/lessons/12921

  public boolean isPrime(int n) {
    for (int i = 2; i <= (int) Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public int solution(int n) {
    int answer = 0;

    for (int i = 2; i <= n; i++) {
      if (isPrime(i))
        answer++;
    }
    return answer;
  }

}
