public class Lv1Solution10 {
  // https://school.programmers.co.kr/learn/courses/30/lessons/12918

  public boolean solution(String s) {
    boolean answer = true;
    if (s.length() == 4 || s.length() == 6) {
      try {
        int x = Integer.parseInt(s);
        return true;
      } catch (Exception e) {
        return false;
      }
    } else
      return false;
  }
}
