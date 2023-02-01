package 타겟넘버;

class Solution {
  int answer;
  
  public int solution(int[] numbers, int target) {
      answer = 0;
      dfs(numbers, target, 0, 0);
      return answer;
  }
  
  public void dfs(int[] numbers, int target, int index, int sum){
      // 1. 탈출조건
      if(index == numbers.length) {
          if(target == sum) {
              answer++;
          }
          return;
      }
      // 2. 수행조건
      dfs(numbers, target, index + 1, sum + numbers[index]);
      dfs(numbers, target, index + 1, sum - numbers[index]);
  }
}