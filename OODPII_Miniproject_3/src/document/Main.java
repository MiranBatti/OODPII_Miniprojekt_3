package document;

import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		PlainTextDocument document = new PlainTextDocument();
		TextConverter converter;	
		List<Element> listOfTableElements = new ArrayList<Element>();
		List<Element> listOfBulletListElements = new ArrayList<Element>();
		
		converter = document.getConverter("html");
		
		converter.preamble();
		converter.addHeader(converter.getElementFactory().createHeading("This is a heading"));
		converter.addHeader(converter.getElementFactory().createHeading("This is another heading"));
		converter.addParagraph(converter.getElementFactory().createParagraph("This is a paragraph"));
		
		listOfTableElements.add(converter.getElementFactory().createHeading("header inside table"));
		listOfTableElements.add(converter.getElementFactory().createParagraph("paragraph inside table"));
		
		listOfBulletListElements.add(converter.getElementFactory().createParagraph("paragraph inside bullet list"));
		listOfBulletListElements.add(converter.getElementFactory().createHeading("heading inside bullet list"));
		
		converter.addTable(listOfTableElements);
		converter.addBulletList(listOfBulletListElements);
		converter.postamble();		
		
		System.out.println(converter.getConvertedText());
	}
	
}
