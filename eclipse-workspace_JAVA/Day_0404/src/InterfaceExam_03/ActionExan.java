package InterfaceExam_03;

public class ActionExan {
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}
		};
		action.work();
	}
}
