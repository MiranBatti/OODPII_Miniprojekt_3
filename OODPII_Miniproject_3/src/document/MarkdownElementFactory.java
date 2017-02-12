package document;

public class MarkdownElementFactory extends ElementFactory
{
	private static MarkdownElementFactory instance = null;
	
	protected MarkdownElementFactory()
	{
	}
	
	public static MarkdownElementFactory getInstance()
	{
		if(instance == null)
			instance = new MarkdownElementFactory();
		return instance;
	}
	
	@Override
	public Heading createHeading(String text)
	{
		return new Heading(text);
	}

	@Override
	public Paragraph createParagraph(String text)
	{
		return new Paragraph(text);
	}

	@Override
	public BulletList createBulletList(String text)
	{
		// TODO Auto-generated method stub
		return new BulletList(text);
	}

	@Override
	public Table createTable(String text)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
