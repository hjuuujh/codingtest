import java.util.*;

public class Lv1Solution04 {

  // https://school.programmers.co.kr/learn/courses/30/lessons/12906

  public int[] solution(int[] arr) {
    Stack<Integer> st = new Stack<>();

    for (int a : arr) {
      if (st.isEmpty())
        st.push(a);
      if (st.peek() != a)
        st.push(a);
    }

    return st.stream().mapToInt(i -> i).toArray();
  }
}
