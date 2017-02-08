package document;

public class MarkupElementFactory extends ElementFactory
{
	private static MarkupElementFactory instance = null;
	
	protected MarkupElementFactory()
	{
	}
	
	public static MarkupElementFactory getInstance()
	{
		if(instance == null)
			instance = new MarkupElementFactory();
		return instance;
	}
	
	@Override
	public Heading createHeading(String text)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paragraph createParagraph(String text)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BulletList createBulletList(String text)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table createTable(String text)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
