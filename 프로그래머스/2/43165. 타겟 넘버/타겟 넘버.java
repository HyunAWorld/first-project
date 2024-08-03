class Solution {
    	public int solution(int[] numbers, int target) {
       return dfs(numbers,target,0,0);
    }
	// dfs 방식 ( 깊이 탐색 )
	public int dfs (int numbers[], int target, int index, int sum) {
		// 노드(인덱스)가 number의 길이와 같은 경우
		if(index == numbers.length) {
			if(sum == target) {
				return 1;
			}else {
				return 0;
			}
		}
		
		int add = dfs(numbers,target,index+1,sum+numbers[index]);
		int odd = dfs(numbers,target,index+1,sum-numbers[index]);
		
		return add + odd;
	}// dfs fin
}