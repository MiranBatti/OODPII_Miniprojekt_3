package document;

public interface Visitor 
{
	public void visit(Paragraph e);
	public void visit(BulletList e);
	public void visit(Table e);
	public void visit(Heading e);
}
