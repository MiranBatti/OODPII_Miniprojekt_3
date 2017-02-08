package document;

public abstract class ElementFactory
{
	public abstract Heading createHeading(String text);
	
	public abstract Paragraph createParagraph(String text);
	
	public abstract BulletList createBulletList(String text);
	
	public abstract Table createTable(String text);
}
