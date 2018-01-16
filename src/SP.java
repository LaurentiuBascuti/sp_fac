//import AlignStrategy.*;
//import textSpecial.*;

public class SP {

		public static void main(String[] args) {

		/*final AlignStrategy a1 = new ColumnAlign();
	    final AlignStrategy a2 = new LineAlign();
	    final AlignStrategy a3 = new RaptorAlign();
	    
	    final TextSpecialInt bold = new TextSpecialBold();
	    final TextSpecialInt italic = new TextSpecialItalic();
		
	    Element[] list = {new Paragraf("Paragraf1"), new Paragraf("Paragraf2"), new Paragraf("Paragraf3"), new Tabel("634,7347,55,55"), new Tabel("Avocado"), new Imagine("imagine"), new TextSpecial("Bold")};
		
		System.out.println("Afisare elemente vizitate:\n");
		DocumentStatisticsVisitor visitor = new DocumentStatisticsVisitor();
		for(Element i : list)
		{
			i.acceptVis(visitor);
		}
		System.out.println("================================");
		
		System.out.println("Afisare numar elemente:\n");
		System.out.println("Numar paragrafe " + visitor.getNumarParagrafe());
		System.out.println("Numar tabele " + visitor.getNumarTabele());
		System.out.println("Numar imagini " + visitor.getNumarImagini());
		System.out.println("Numar sectiuni " + visitor.getNumarSectiuni());
		System.out.println("================================");
		
		Sectiune s1 = new Sectiune();
		Sectiune s2 = new Sectiune();
		
		Paragraf p1 = new Paragraf("Paragraf1");
		Paragraf p2 = new Paragraf("Paragraf2");
		Paragraf p3 = new Paragraf("Paragraf3");
		
		/*TextSpecial t1 = new TextSpecial("Bold");
		TextSpecial t2 = new TextSpecial("Italic");
		
		s1.add(t1);
		s2.add(t2);*/
		
		/*System.out.println("Afisare text special:\n");
		p1.setTxtspec(italic);
		p2.setTxtspec(bold);
		p1.printTxt();
		p2.printTxt();
		System.out.println("================================");
		
		System.out.println("Afisare AlignStrategy:\n");
		p1.setAlign(a1);
		p2.setAlign(a2);
		p3.setAlign(a3);
		p1.print();
		p2.print();
		p3.print();
		s1.add(p1);
		s2.add(p2);
		s2.add(p3);
		System.out.println("================================");
		
		Imagine i1 = new Imagine("Iepure");
		Imagine i2 = new Imagine("Cal");
		
		s1.add(i1);
		s2.add(i1);
		
		System.out.println("Afisare paragrafe:\n");
		p1.afisareparagraf();
		p2.afisareparagraf();
		p3.afisareparagraf();
		System.out.println("================================");
		System.out.println("Afisare sectiuni:\n");
		s1.print();
		s2.print();
		System.out.println("================================");
		System.out.println("Afisare imagini:\n");
		i1.print();
		i2.print();
		System.out.println("================================");*/
			
		/*------------------------Lab13_Observer--------------------------*/
		Observer o = new SimpleObserver();
		Paragraf p1 = new Paragraf("Paragraf1");
		Paragraf p2 = new Paragraf("Paragraf2");
		Imagine i1 = new Imagine("Iepure");
		Imagine i2 = new Imagine("Cal");
		Sectiune s = new Sectiune();
		
		p1.attach(o);
		p2.attach(o);
		i1.attach(o);
		i2.attach(o);
		s.attach(o);
		
		s.add(p1);
		s.add(p2);
		s.add(i1);
		s.add(i2);
		}
	
}
