package document;

import java.util.List;

public class ToLaTeXConverter extends TextConverter
{
	StringBuilder latexText = new StringBuilder();
	
	@Override
	public void addHeader(Element e)
	{
		latexText.append("\\section{").append(e.getText()).append("}\n");
	}

	@Override
	public void addParagraph(Element e)
	{
		latexText.append("\\paragraph{").append(e.getText()).append("}\n");
	}

	@Override
	public void addBulletList(List<Element> e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTable(List<Element> e)
	{
		// TODO Auto-generated method stub
		
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
		return latexText.toString();
	}

	@Override
	public ElementFactory getElementFactory()
	{
		return LaTeXElementFactory.getInstance();
	}

}
