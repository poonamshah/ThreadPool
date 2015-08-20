/**
 * @author poonam.shah
 * By fixing the order deadlock can be prevented
 *
 */
public class DeadLockSituation {

	public void method1() {
		synchronized (String.class) {
			System.out.println("String is locked");
			synchronized (Integer.class) {
				System.out.println("Integer is locked");
			}
		}

	}

	public void method2() {
		synchronized (Integer.class) {
			System.out.println("Integer is locked");
			synchronized (String.class) {
				System.out.println("String is locked");
			}
		}
	}

}
