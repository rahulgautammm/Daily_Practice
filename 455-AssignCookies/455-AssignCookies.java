// Last updated: 7/20/2026, 9:42:17 AM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        if(s.length == 0) return 0;
4        Arrays.sort(g);
5        Arrays.sort(s);
6        int max = 0;
7        int co = s.length - 1;
8        int ch = g.length - 1;
9        while(co >= 0 && ch >= 0){
10            if(s[co] >= g[ch]){
11                max++;
12                co--;
13                ch--;
14            }
15            else{
16                ch--;
17            }
18        }
19        return max;
20    }
21}