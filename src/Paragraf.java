import AlignStrategy.AlignStrategy;

public class Paragraf extends AbstractElem{

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
     
    public String toString()
    {
        return paragraf;
    }
    
}
