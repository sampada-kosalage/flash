package Training;

import TrainingShop.Door;

public class Shop {

	/*private Lock lock;
	public Door() {
		lock=new Lock(true);
	}
	public Lock getLock() {
		return
	}
	
	public class lock()
	{
		private boolean lock;
		
		public Lock(boolean lock) {
		this.lock=lock
		}
	}*/
	
	public static void main(String [] args) {
		/*Door door=new Door();
		door.shopStatus();
		door.getLock().setLock(false);
		door.shopStatus();
	}*/
		if(new Door().isLocked(args[0])) {
			System.out.println("closed");
			}
		else {
			System.out.println("open");

		}
		System.out.println(args[1]);
		System.out.println(args[2]);

		}
	
}
