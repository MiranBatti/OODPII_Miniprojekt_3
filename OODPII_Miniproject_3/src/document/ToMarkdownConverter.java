package document;

import java.util.List;

public class ToMarkdownConverter extends TextConverter
{
	private StringBuilder markdownText = new StringBuilder();

	@Override
	public void addHeader(Element e)
	{
		markdownText.append(e.getText()).append("\n=======\n");
	}

	@Override
	public void addParagraph(Element e)
	{
		markdownText.append(e.getText()).append("\n");
	}

	@Override
	public void addBulletList(List<Element> e)
	{
		for (Element er : e)
		{
			String tmp = er.getText();
			switch (er.toString())
			{
				case "heading" :
					markdownText.append("*").append(tmp).append("\n");
					break;
				case "paragraph" :
					markdownText.append("*").append(tmp).append("\n");
				default :
					break;
			}
		}
	}

	@Override
	public void addTable(List<Element> e)
	{

	}

	@Override
	public void preamble()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postamble()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getConvertedText()
	{
		return markdownText.toString();
	}

	@Override
	public ElementFactory getElementFactory()
	{
		return MarkdownElementFactory.getInstance();
	}

}
