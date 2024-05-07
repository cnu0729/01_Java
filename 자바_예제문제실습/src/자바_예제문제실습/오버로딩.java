package 자바_예제문제실습;
/*
 빨간선이 뜨는 부분 해결
*/
public class 오버로딩 {
	public void test() {}
	public void test(String str) {}
	public void test(String s, short s1) {}

	public void test(int i) {}
	public void test(int a, String str1) {}
	
	public void test(char a) {}
	public void test(char ch, int r) {}
	
	public void test(boolean aa, int rr) {}
	public void test(boolean bb, char chch, int rrr) {}
	public void test(short sss) {}
	public void test(short sssss, int rrrrrr) {}
	
	public void test(int a, char tt, short aa) {}
	public void test(int a3, boolean t) {}
	
	public void test(int a, int b) {}
	public void test(int a, short b) {}
	
	public void test(String a, int b) {}
	public void test(int a, String b, char bbb) {}
	
}
