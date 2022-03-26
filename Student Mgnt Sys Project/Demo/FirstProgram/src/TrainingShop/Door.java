package TrainingShop;

public class Door {

	/*private Lock lock;
	public Door() {
		lock=new Lock();
	}
	public Lock getLock() {
		return lock;
	}*/
	
	public boolean isLocked(String key) {
		class Lock{
			public boolean isLocked(String key) {
				if(key.equals("q")) {
					return false;
				}
				else
				{
					return true;
				}
			}
		}
	}

	public boolean isLocked1(String key) {
		// TODO Auto-generated method stub
		return false;
	
	
	/*public void shopStatus() {
		if(lock.isLock()) {
			System.out.println("Shop close");
			
		}
		else
		{
			System.out.println("Shop open");

		}
	}
	public class Lock {
	   private boolean lock;
	
		public void Lock(boolean lock) {
		this.lock=lock;
		}
		public boolean isLock() {
			return lock;
		}
		public void setLock(boolean lock) {
			this.lock=lock;
			}*/
	
	return new Lock().isLocked(key);
	
	}
}


