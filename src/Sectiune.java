import java.util.ArrayList;

public class Sectiune extends SubjectElement{

private ArrayList<Element> continut;
    
    public Sectiune()
    {
        continut = new ArrayList<Element>();
    }

    public void add(Element x) {
        continut.add(x);
        notify2();
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

	public Element getChild(int child) {
		// TODO Auto-generated method stub
		return null;
	}

	public void afisareEl() {
		// TODO Auto-generated method stub
		
	}

	public void acceptVis(Visitor v) {
		v.visitSectiune(this);
		System.out.println("Sectiune vizitata.");
	}
}
