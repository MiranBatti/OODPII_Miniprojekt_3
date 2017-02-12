package document;

public class Table implements Element
{
	StringBuilder text = new StringBuilder();
	
	
	public Table(String text)
	{
		this.text.append("text");
	}
	
	@Override
	public void addElement(Element element) {
		text.append(element.getText());
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
