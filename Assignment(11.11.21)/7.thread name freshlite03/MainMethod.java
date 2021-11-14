package assignment.one;

public class MainMethod {
	public static void main(String[] args) {
		MainMethod main = new MainMethod();
		FreshLite03J freshLite03J = new FreshLite03J();
		FreshLite03R freshLite03R = new FreshLite03R();
		Thread thread = new Thread(freshLite03R);
		freshLite03J.setPriority(7);
		thread.setPriority(2);
		freshLite03J.start();
		thread.start();
		System.out.print("wellcome to ");

	}

}
