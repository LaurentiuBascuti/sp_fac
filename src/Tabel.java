
public class Tabel extends AbstractElem{

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
}
