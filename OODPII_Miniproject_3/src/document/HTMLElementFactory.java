package document;

public class HTMLElementFactory extends ElementFactory
{
	private static HTMLElementFactory instance = null;
	
	protected HTMLElementFactory()
	{
		
	}
	
	//Singleton
	public static HTMLElementFactory getInstance()
	{
		if(instance == null)
			instance = new HTMLElementFactory();
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
