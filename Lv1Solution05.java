import java.util.ArrayList;

public class Lv1Solution05 {
  // https://school.programmers.co.kr/learn/courses/30/lessons/12910

  public int[] solution(int[] arr, int divisor) {
    int[] answer = {};
    ArrayList<Integer> list = new ArrayList<>();

    for (int a : arr) {
      if (a % divisor == 0) {
        list.add(a);
      }

    }

    if (list.size() == 0)
      list.add(-1);
    list.sort(Comparator.naturalOrder());
    answer = list.stream().mapToInt(i -> i).toArray();

    return answer;
  }
}
