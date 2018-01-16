
public interface Visitor {

	public void visitIP(ImagineProxy imgp);
	public void visitImg(Imagine img);
	public void visitParagraf(Paragraf p);
	public void visitTabel(Tabel t);
	public void visitSectiune(Sectiune s);
	public void visitTextSpecial(TextSpecial txtspec);
}
