public class Lv1Solution03 {
  // https://school.programmers.co.kr/learn/courses/30/lessons/12903

  public String solution(String s) {
    String answer = "";
    int length = s.length();

    if (length % 2 == 0) {
      // 글자수 짝수면 /2 전글자 + /2글자
      answer = s.substring(length / 2 - 1, length / 2 + 1);
    } else {
      // 글자수 홀수면 /2 몫 글자
      answer = s.substring(length / 2, length / 2 + 1);
    }

    return answer;
  }
}
