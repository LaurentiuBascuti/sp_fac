import AlignStrategy.AlignStrategy;

public class Paragraf implements Element{

	private String paragraf;
    private AlignStrategy as;
    
    public Paragraf(String paragraf)
    {
        this.paragraf = paragraf;
    }
    
    public void setAlign(AlignStrategy as)
    {
        this.as = as;
    }
       
    public void print()
    {
        as.printAligned(paragraf);
    }
     
    public void afisareparagraf()
    {
        System.out.println(paragraf);
    }

	public void add(Element el) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Element el) {
		// TODO Auto-generated method stub
		
	}

	public Element getChild(int child) {
		// TODO Auto-generated method stub
		return null;
	}

	public void acceptVis(Visitor v) {
		v.visitParagraf(this);
		System.out.println("Paragraf vizitat.");
	}

	public void afisareEl() {
		// TODO Auto-generated method stub
		
	}
	
    
}
