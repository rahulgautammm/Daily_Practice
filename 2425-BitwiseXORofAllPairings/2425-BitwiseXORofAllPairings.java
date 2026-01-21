// Last updated: 1/21/2026, 11:56:34 AM
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int m = nums2.length;
5        if (n%2 == 0 & m %2 == 0) {
6            return 0;
7        }
8        int xor1 = Bitwise_XOR(nums1);
9        int xor2 = Bitwise_XOR(nums2);
10        if (n % 2 == 1 & m % 2 == 1) {
11            return xor1 ^ xor2;
12        } 
13        else if(n % 2 == 1){
14            return xor2;
15        }
16        else{
17            return xor1;
18        }
19    }
20    public static int Bitwise_XOR(int [] arr){
21        int xor = 0;
22        for (int v : arr) {
23            xor ^= v;
24        }
25        return xor;
26    }
27}