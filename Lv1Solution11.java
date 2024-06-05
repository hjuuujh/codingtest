public class Lv1Solution11 {
  // https://school.programmers.co.kr/learn/courses/30/lessons/12919

  public String solution(String[] seoul) {
    String answer = "";
    int idx = 0;
    for (int i = 0; i < seoul.length; i++) {
      if (seoul[i].equals("Kim")) {
        idx = i;
        break;
      }
    }

    answer = "김서방은 " + idx + "에 있다";
    return answer;
  }

}
