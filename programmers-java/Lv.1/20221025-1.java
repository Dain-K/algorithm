class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean temp[] = new boolean[n+1];
        for (int i = 2; i <= n; i++)
            temp[i] = true;
        
        int root = (int)Math.sqrt(n);
        System.out.println(root);
        for(int i = 2; i<=root; i++){
            if(temp[i] == true)
                for(int j = i; i*j <= n; j++)
                    temp[i*j] = false;
        }
        for(int i = 2; i<=n;i++)
            if(temp[i] == true)
                answer++;
        
        return answer;
    }
}