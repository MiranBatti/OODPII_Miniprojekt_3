package document;

public class LaTeXElementFactory extends ElementFactory
{
	private static LaTeXElementFactory instance = null;
	
	protected LaTeXElementFactory()
	{
		
	}
	
	//Singleton
	public static LaTeXElementFactory getInstance()
	{
		if(instance == null)
			instance = new LaTeXElementFactory();
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
