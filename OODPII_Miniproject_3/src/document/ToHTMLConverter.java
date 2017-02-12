package document;

import java.util.List;

public class ToHTMLConverter extends TextConverter
{
	private StringBuilder htmlText = new StringBuilder();
	
	@Override
	public void addHeader(Element e)
	{
		htmlText.append("<h>").append(e.getText()).append("</h>\n");
	}

	@Override
	public void addParagraph(Element e)
	{
		htmlText.append("<p>").append(e.getText()).append("</p>\n");
	}

	@Override
	public void addBulletList(List<Element> e)
	{
		htmlText.append("<ul>\n");
		for (Element er : e)
		{
			String tmp = er.getText();
			switch (er.toString())
			{
				case "heading" :
					htmlText.append("<h>").append(tmp).append("</h>\n");
					break;
				case "paragraph" :
					htmlText.append("<p>").append(tmp).append("</p>\n");
				default :
					break;
			}
		}
		htmlText.append("</ul>\n");
	}

	@Override
	public void addTable(List<Element> e)
	{
		htmlText.append("<table>\n");
		for (Element er : e)
		{
			String tmp = er.getText();
			switch (er.toString())
			{
				case "heading" :
					htmlText.append("<h>").append(tmp).append("</h>\n");
					break;
				case "paragraph" :
					htmlText.append("<p>").append(tmp).append("</p>\n");
				default :
					break;
			}
		}
		htmlText.append("</table>\n");
	}

	@Override
	public void preamble()
	{
		htmlText.append("<html>\n");
	}

	@Override
	public void postamble()
	{
		htmlText.append("</html>\n");
	}

	@Override
	public String getConvertedText()
	{
		return htmlText.toString();
	}

	@Override
	public ElementFactory getElementFactory()
	{
		return HTMLElementFactory.getInstance();
	}

}
