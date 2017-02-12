package document;

public class StructuredTextDocumentParser implements Visitor
{
	private StructuredTextDocument structuredTextDocument;
	private Element e;
	private TextConverter converter;
	
	public StructuredTextDocumentParser()
	{
	}
	
	public void parseDocument()
	{
		for (Element e : structuredTextDocument.getElementList())
		{
		}
	}

	@Override
	public void visit(Paragraph e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(BulletList e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Table e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Heading e) {
		// TODO Auto-generated method stub
		
	}
}
