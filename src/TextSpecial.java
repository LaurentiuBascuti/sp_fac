
public class TextSpecial implements Element{

	String textspec;

	public TextSpecial(String textspec) {
		this.textspec = textspec;
	}
	
	public String getTextspec() {
		return textspec;
	}

	public void setTextspec(String textspec) {
		this.textspec = textspec;
	}

	@Override
	public void add(Element el) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element el) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element getChild(int child) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void acceptVis(Visitor v) {
		v.visitTextSpecial(this);
		System.out.println("TextSpecial vizitat.");
	}

	@Override
	public void print() {
		System.out.println(textspec);	
	}

	@Override
	public String toString() {
		return textspec;
	}

	@Override
	public void afisareEl() {
		// TODO Auto-generated method stub
		
	}

}
