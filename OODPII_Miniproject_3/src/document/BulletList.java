package document;

public class BulletList implements Element
{
	StringBuilder text = new StringBuilder();
	
	public BulletList(String text)
	{
		this.text.append("text");
	}
	
	@Override
	public void addElement(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getText() {
		return text.toString();
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
