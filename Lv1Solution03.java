public class Lv1Solution03 {
  // https://school.programmers.co.kr/learn/courses/30/lessons/12903

  public String solution(String s) {
    String answer = "";
    int idx = s.length() / 2;
    if (s.length() % 2 == 1) {
      answer = s.substring(idx, idx + 1);
    } else {
      answer = s.substring(idx - 1, idx + 1);

    }
    return answer;

  }
}
