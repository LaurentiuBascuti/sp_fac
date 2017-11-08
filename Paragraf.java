
public class Paragraf {

	public String text;

	public Paragraf(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
    
	public void afisare()
	{
		System.out.print(text);
	}
	
	public void adaugare(Element el){
		//throw new Exception("Not ");
	}
    
}
