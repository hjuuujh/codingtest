- Stack/list to Array  <br/>
st.stream().mapToInt(i -> i).toArray();  <br/>
list.stream().mapToInt(i -> i).toArray();  <br/>
 <br/>
- sort list  <br/>
list.sort(Comparator.naturalOrder());  <br/>
list.sort(Comparator.reverseOrder());  <br/>
 <br/>
- list to String  <br/>
String.join("", list);  <br/>
  <br/>
- 소수 판별 <br/>
public boolean isPrime(int n) {
    for (int i = 2; i <= (int) Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
