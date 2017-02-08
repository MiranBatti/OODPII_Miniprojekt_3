package document;

public abstract class TextConverter
{
	public abstract void addHeader();
	
	public abstract void addParagraph();
	
	public abstract void addBulletList();
	
	public abstract void addTable();
	
	public abstract void preamble();
	
	public abstract void postamble();
}
