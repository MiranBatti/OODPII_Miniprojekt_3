package document;

import java.util.ArrayList;
import java.util.List;

public class StructuredTextDocument extends TextDocument
{
	List<Element> elementList = new ArrayList<Element>();
	
	public void addElement(Element e)
	{
		elementList.add(e);
	}
	
	public List<Element> getElementList()
	{
		return elementList;
	}
	
	public TextConverter getConverter(String type)
	{
		switch (type)
		{
			case "html" :
				return new ToHTMLConverter();
			case "markdown" :
				return new ToMarkdownConverter();
			case "latex" :
				return new ToLaTeXConverter();
			default : 
				return null; //Står inte null här. Ignorera mannen bakom gardinerna.
		}
	}
	
}
