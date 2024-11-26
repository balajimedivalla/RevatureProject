package Projects;
class Ramcharan implements hero
{
	public void tier1hero() {
		System.out.println("ramcharan is a tier one hero");	
	}	
	public void tier2hero() {
		System.out.println("nani is tier2 hero");	
	}

	public void tier3hero() {
		System.out.println("sushanth is tier3 hero");
	}
}
class Ntr implements hero
{
	public void tier1hero() {
		System.out.println("Ntr is tier1 hero");	
	}
	public void tier2hero() {
		System.out.println("tillugadu  is tier2 hero");
	}
	public void tier3hero() {
		System.out.println("ur my local hero");
	}
}
public interface hero {
	
	public void tier1hero();
	public void tier2hero();
	public void tier3hero();
}


