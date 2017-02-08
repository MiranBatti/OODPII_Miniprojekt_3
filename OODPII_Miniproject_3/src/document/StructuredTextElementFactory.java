package document;

public class StructuredTextElementFactory extends ElementFactory
{
	private static StructuredTextElementFactory instance = null;
	
	protected StructuredTextElementFactory()
	{
	}
	
	//Singleton
	public static StructuredTextElementFactory getInstance()
	{
		if(instance == null)
			instance = new StructuredTextElementFactory();
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
