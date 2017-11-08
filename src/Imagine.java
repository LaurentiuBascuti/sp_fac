
public class Imagine extends AbstractElem{

	private String img;

    public Imagine(String img)
    {
        this.img = img;
    }
    
    @Override
    public void print()
    {
        System.out.println(img);
    }
    
    @Override 
    public String toString()
    {
        return img;
    }
}
