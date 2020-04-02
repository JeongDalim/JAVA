
public class Exam_02 {
	public static void main(String[] args) {
		int var = 1;
		String name = new String("홍길동");
		int tot = 270;
		double avg = 79.543;
		char ch = 'A';// 또는 char ch=65;. 결과는 A로 같다.
		System.out.println("var=" + var);
		System.out.println("name=" + name);
		System.out.println("tot=" + tot);
		System.out.println("avg=" + avg);
		System.out.println("ch=" + ch);
		
		System.out.print("var\tname\ttot\tavg\tch\n");
		System.out.println(var+"\t"+name+"\t"+tot+"\t"+avg+"\t"+ch);
	}
}
