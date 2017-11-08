import java.util.*;

public class Capitol {

	private String titlu;
    private List<Subcapitol> subcapitol;

    public void setSubcapitol(List<Subcapitol> subcapitol) {
        this.subcapitol = subcapitol;
    }

    public String getTitlu() {
        return titlu;
    }

    public List<Subcapitol> getSubcapitol() {
        return subcapitol;
    }
    
    public void setTitlu(String x)
    {
        this.titlu = x;
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(byte i=1; i < subcapitol.size(); i++)
        {
            sb.append(subcapitol.get(i)).append(" ");
        }
        return sb.toString();
    }
}
