import java.util.ArrayList;

public class Sectiune implements Element{

private ArrayList<Element> continut;
    
    public Sectiune()
    {
        continut = new ArrayList<Element>();
    }

    public void add(Element x) {
        continut.add(x);
    }

    public void remove(Element x) {
        continut.remove(x);
    }

    public void get(int x) {
        continut.get(x);
    }

    public void print() {
        System.out.println("Works");
    }

	@Override
	public Element getChild(int child) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void afisareEl() {
		// TODO Auto-generated method stub
		
	}
}