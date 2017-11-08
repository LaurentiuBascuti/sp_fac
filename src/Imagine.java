
public class Imagine implements Element{

	private String img;
	private int nrimag;

    public Imagine(String img)
    {
        this.img = img;
    }

    public void print()
    {
        System.out.println(img);
    }

    public String toString()
    {
        return img;
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
		v.visitImg(this);
		nrimag++;
		System.out.println("Imagine vizitata.");
	}

	public void afisareEl() {
		// TODO Auto-generated method stub
		
	}

}
