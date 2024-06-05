import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Lv1Solution07 {
  // https://school.programmers.co.kr/learn/courses/30/lessons/12915
  public String[] solution(String[] strings, int n) {
    String[] answer = {};

    ArrayList<String> arr = new ArrayList<>();
    for (int i = 0; i < strings.length; i++) {
      arr.add("" + strings[i].charAt(n) + strings[i]);
    }
    arr.sort(Comparator.naturalOrder());
    answer = new String[arr.size()];
    for (int i = 0; i < arr.size(); i++) {
      answer[i] = arr.get(i).substring(1, arr.get(i).length());
    }
    return answer;
  }

}
