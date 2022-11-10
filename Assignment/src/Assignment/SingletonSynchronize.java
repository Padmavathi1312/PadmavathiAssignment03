package Assignment;

public static class SingletonSynchronize {
		   private static Singleton instance = null;

		   private SingletonSynchronize() {}

		   public static synchronized Singleton getInstance() {
		       if (instance == null) {
		           instance = new Singleton();
		       }

		       return instance;
		   }
		}


