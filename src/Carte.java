import java.util.*;

public class Carte {

	private ArrayList<Autor> aTeam;
    private String titlu;
    public ArrayList<Element> continut = new ArrayList<Element>();
	
    public Carte(ArrayList<Autor> aTeam, String titlu) {
		this.aTeam = aTeam;
		this.titlu = titlu;
	}

	public ArrayList<Autor> getaTeam() {
		return aTeam;
	}

	public void setaTeam(ArrayList<Autor> aTeam) {
		this.aTeam = aTeam;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
    
	public void addCapitol(Element el){
		this.continut.add(el);
	}
	
	public void afisare(){
		System.out.println(titlu);
		for(Element cop : continut)
		{
			cop.afisareEl();
		}	
	}
	
	public void accept(Visitor v){
		for(Element e : continut){
			e.acceptVis(v);
		}
	}
    
}
