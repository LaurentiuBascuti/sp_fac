
public class ImagineProxy implements Element{

	private Imagine realImg = null;
    private String fileName = null;
    
    public ImagineProxy(String fileName)
    {
        this.fileName = fileName;
    }

    public void print() {
        if(realImg == null)
        {
            realImg = new Imagine(fileName);
        }
        
        realImg.print();
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
		v.visitIP(this);
		System.out.println("ImagineProxy vizitata.");
	}

	public void afisareEl() {
		// TODO Auto-generated method stub
		
	}
}
