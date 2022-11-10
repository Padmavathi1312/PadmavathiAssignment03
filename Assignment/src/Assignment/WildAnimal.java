package Assignment;

	public class WildAnimal {
		public WildAnimal details(){
			System.out.println("I'm Wild Animal");
			return this;
		}
	}
	 
	class Lion extends WildAnimal {
		public Lion details(){
			System.out.println("I'm Lion");
			return this;
		}
		public void whoAreYou() {
	System.out.println("Carnivorous");
		}
	}

	
