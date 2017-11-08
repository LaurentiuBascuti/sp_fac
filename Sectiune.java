import java.util.ArrayList;

public class Sectiune implements Element{

	private String titlu;
    public ArrayList<Element> secContinut = new ArrayList<Element>();
	  
	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public Sectiune(String titlu) {
		this.titlu = titlu;
	}

	@Override
	public void add(Element el) {
		// TODO Auto-generated method stub
		this.secContinut.add(el);
	}

	@Override
	public void remove(Element el) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element getChild(int child) {
		// TODO Auto-generated method stub
		return secContinut.get(child);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afisareEl() {
		// TODO Auto-generated method stub
		
	}
}
