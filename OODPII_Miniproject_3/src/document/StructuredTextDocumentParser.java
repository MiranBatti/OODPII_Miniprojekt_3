package document;

public class StructuredTextDocumentParser implements Visitor
{
	private PlainTextDocument plainTextDocument;
	
	public StructuredTextDocumentParser(PlainTextDocument plainTextDocument)
	{
		this.plainTextDocument = plainTextDocument;
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
