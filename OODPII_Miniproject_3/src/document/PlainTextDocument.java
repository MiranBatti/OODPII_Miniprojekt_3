package document;

public class PlainTextDocument extends TextDocument
{
	private StringBuffer plainText;
	
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
