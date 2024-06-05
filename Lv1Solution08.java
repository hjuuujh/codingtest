import java.util.ArrayList;

public class Lv1Solution08 {
  // https://school.programmers.co.kr/learn/courses/30/lessons/12916

  boolean solution(String s) {
    boolean answer = true;

    s = s.toLowerCase();

    int pCount = 0;
    int yCount = 0;

    for (String str : s.split("")) {
      if (str.equals("p"))
        pCount++;
      else if (str.equals("y"))
        yCount++;
    }

    answer = pCount == yCount ? true : false;

    return answer;
  }

}
