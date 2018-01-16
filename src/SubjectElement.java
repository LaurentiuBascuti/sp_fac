import java.util.ArrayList;
import java.util.List;

public abstract class SubjectElement implements Subject,Element{

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer obs)
	{
		observers.add(obs);
	}
	
	public void detach(Observer obs)
	{
		observers.remove(obs);
	}
	
	public void notify2()
	{
		observers.forEach(Observer::update);
	}
	
}
