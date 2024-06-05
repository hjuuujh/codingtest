public class Lv1Solution09 {
  // https://school.programmers.co.kr/learn/courses/30/lessons/12917

  public String solution(String s) {
    String answer = "";
    ArrayList<String> list = new ArrayList<>();

    for (String str : s.split("")) {
      list.add(str);
    }
    list.sort(Comparator.reverseOrder());
    answer = String.join("", list);

    return answer;
  }

}
