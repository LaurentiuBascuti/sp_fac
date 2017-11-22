import AlignStrategy.*;

public class SP {

		public static void main(String[] args) {

		final AlignStrategy a1 = new ColumnAlign();
	    final AlignStrategy a2 = new LineAlign();
	    final AlignStrategy a3 = new RaptorAlign();
		
	    Element[] list = {new Paragraf("Paragraf1"), new Paragraf("Paragraf2"), new Paragraf("Paragraf3"), new Tabel("634,7347,55,55"), new Tabel("Avocado")};
		
		System.out.println("Afisare elemente vizitate:");
		DocumentStatisticsVisitor visitor = new DocumentStatisticsVisitor();
		for(Element i : list)
		{
			i.acceptVis(visitor);
		}
		System.out.println("================================");
		
		System.out.println("Afisare numar elemente:3");
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
		
		System.out.println("Afisare AlignStrategy:");
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

		System.out.println("Afisare paragrafe:");
		p1.afisareparagraf();
		p2.afisareparagraf();
		p3.afisareparagraf();
		System.out.println("================================");
		System.out.println("Afisare sectiuni:");
		s1.print();
		s2.print();
		System.out.println("================================");
		System.out.println("Afisare imagini:");
		i1.print();
		i2.print();
		System.out.println("================================");
		
		}
	
}
