// Last updated: 2/5/2026, 12:41:52 PM
1class Solution {
2    class Trie{
3		class Node{
4			char ch;
5			String isterminal;
6			HashMap<Character, Node> child;
7			public Node(char c) {
8				this.ch = ch;
9				child = new HashMap<>();
10			}
11		}
12		private Node root = new Node('*');
13		public void insert(String word) {
14			Node curr = root;
15			for (int i = 0; i < word.length(); i++) {
16				char ch = word.charAt(i);
17				if (curr.child.containsKey(ch)) {
18					curr = curr.child.get(ch);
19				} 
20				else {
21					Node nn = new Node(ch);
22					curr.child.put(ch, nn);
23					curr = nn;
24				}
25			}
26			curr.isterminal = word;
27
28		}
29		public String search(String word) {
30			Node curr = root;
31			for(int i = 0; i<word.length(); i++) {
32				char ch = word.charAt(i);
33				if(curr.child.containsKey(ch)) {
34					curr = curr.child.get(ch);
35					if(curr.isterminal != null) {
36						return curr.isterminal;
37					}
38				}
39				else {
40					return word;
41				}
42			}
43			return word;
44		}
45	}
46    public String replaceWords(List<String> dict, String sentence) {
47        Trie t = new Trie();
48		for(String s : dict) {
49			t.insert(s);
50		}
51		String[] arr = sentence.split(" ");
52		StringBuilder sb = new StringBuilder();
53		for(String s : arr) {
54			sb.append(t.search(s) + " ");
55		}
56        int n = sb.length();
57		return sb.toString().substring(0, n-1);
58    }
59}