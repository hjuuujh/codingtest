import java.util.*;

public class Lv1Solution01 {

  // https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java

  public int solution(int[] nums) {
    int answer = nums.length / 2;

    Set<Integer> hs = new HashSet<>();

    for (int i : nums) {
      hs.add(i);
    }
	
    // 최대 1/2, 종류가 적으면 set의 사이즈만큼
    return answer < hs.size() ? answer : hs.size();
  }

}
