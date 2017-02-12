package document;

import java.util.List;

public abstract class TextConverter
{
	public abstract void addHeader(Element e);
	
	public abstract void addParagraph(Element e);
	
	public abstract void addBulletList(List<Element> e);
	
	public abstract void addTable(List<Element> e);
	
	public abstract void preamble();
	
	public abstract void postamble();
	
	public abstract String getConvertedText();
	
	public abstract ElementFactory getElementFactory();
}
