package document;

public interface Element
{
	public void addElement(Element element);
	
	public String getText();
	
	public void accept(Visitor v);
}
