1. Stack/list to Array  
st.stream().mapToInt(i -> i).toArray();  
list.stream().mapToInt(i -> i).toArray();  
       
2. sort list  
list.sort(Comparator.naturalOrder());  
list.sort(Comparator.reverseOrder());  
  
3. list to String  
String.join("", list);  
  
4. 소수 판별  
```java
public boolean isPrime(int n) {
    for (int i = 2; i <= (int) Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  ```
