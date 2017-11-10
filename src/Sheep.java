
public class Sheep extends Animal implements Cloneable {

	String name = "";
    
	public Sheep() {
		super();
		name = "";
	}
	
	public Sheep(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void incrementCount() {
		count++;	
	}

	@Override
	public void resetCount() {
		count = 0;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public String getCountString() {
		return count + " " + name;
	}

}
