
public class ImagineProxy extends AbstractElem{

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
}
