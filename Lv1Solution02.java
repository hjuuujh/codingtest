public class Lv1Solution02 {
  // https://school.programmers.co.kr/learn/courses/30/lessons/12901

  public String solution(int a, int b) {
    String answer = "";
    // 2016/01/01 은 금요일부터시작
    String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
    int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // 1일이면 +1 하니까 day[0] -> -1부터 시작해야함
    int total = -1;

    for (int i = 0; i < a - 1; i++) {
      // 해당 날짜 직전 월까지 더하기
      total += month[i];
    }
    
    // 해당 월 날수 더하기
    total += b;

    // 요일 7일단위로 반복되므로 7로나눈 나머지에 해당하는 요일
    answer = day[total % 7];

    return answer;
  }

}
