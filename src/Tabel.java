
public class Tabel extends SubjectElement{

	private String tabel;
    
    public Tabel(String tabel)
    {
        this.tabel = tabel;
    }
    
    public void print()
    {
        System.out.println(tabel);
    }
     
    public String toString()
    {
        return tabel;
    }

	public void add(Element el) {
		notify2();
	}
	
	public void remove(Element el) {
		// TODO Auto-generated method stub
		
	}

	public Element getChild(int child) {
		// TODO Auto-generated method stub
		return null;
	}

	public void acceptVis(Visitor v) {
		v.visitTabel(this);
		System.out.println("Tabel vizitat.");
	}

	public void afisareEl() {
		// TODO Auto-generated method stub
		
	}
}
