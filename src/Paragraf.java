import AlignStrategy.AlignStrategy;
import textSpecial.TextSpecialInt;

public class Paragraf extends SubjectElement{

	private String paragraf;
    private AlignStrategy as;
	private TextSpecialInt txtspec;
    
    public Paragraf(String paragraf)
    {
        this.paragraf = paragraf;
    }
    
    public void setAlign(AlignStrategy as)
    {
        this.as = as;
    }
       
    public void setTxtSpecial(TextSpecialInt txtspec){
    	this.txtspec = txtspec;
    }
    
    public void printTxt(){
    	txtspec.printST(paragraf);
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
		v.visitParagraf(this);
		System.out.println("Paragraf vizitat.");
	}

	public void afisareEl() {
		// TODO Auto-generated method stub
		
	}

	public TextSpecialInt getTxtspec() {
		return txtspec;
	}

	public void setTxtspec(TextSpecialInt txtspec) {
		this.txtspec = txtspec;
	}
	
    
}
