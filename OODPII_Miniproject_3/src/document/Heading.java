package document;

public class Heading implements Element
{
	StringBuilder text = new StringBuilder();
	
	public Heading(String text) 
	{
		this.text.append(text);
	}
	
	@Override
	public void addElement(Element element)
	{
	}

	@Override
	public String getText()
	{
		return text.toString();
	}

	@Override
	public void accept(Visitor v) 
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString()
	{
		return "heading";
	}

}
