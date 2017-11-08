
public interface Element {

	public void add(Element el);
	public void remove(Element el);
	public Element getChild(int child);
	
	public void acceptVis(Visitor v);
	public void print();
	public void afisareEl();
}
