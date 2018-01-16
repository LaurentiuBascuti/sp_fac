
public class DocumentStatisticsVisitor implements Visitor{

	 	private int numarTabele = 0;
	    private int numarParagrafe = 0;
	    private int numarImagini = 0;
	    private int numarSectiuni = 0;
	    private int numarTextSpecial = 0;
	    
		public void visitTextSpecial(TextSpecial txtspec) {
			numarTextSpecial++;
		}
	    
		public void visitIP(ImagineProxy imgp) {
			numarImagini++;
		}
		
		public void visitImg(Imagine img) {
			numarImagini++;
		}

		public void visitParagraf(Paragraf p) {
			numarParagrafe++;
		}

		public void visitTabel(Tabel t) {
			numarTabele++;
		}

		public void visitSectiune(Sectiune s) {
			numarSectiuni++;
		}
    
		public int getNumarTextSpecial(){
			return numarTextSpecial;
		}
		
		public int getNumarTabele() {
			return numarTabele;
		}

		public int getNumarParagrafe() {
			return numarParagrafe;
		}

		public int getNumarImagini() {
			return numarImagini;
		}

		public int getNumarSectiuni() {
			return numarSectiuni;
		}

}
