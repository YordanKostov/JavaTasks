package notebook;

public class Page {

	private String title;
	private String text;

	public Page(String title) {
		if (title != null || !title.equals(" ")) {
			this.title = title;
		} else {
			this.title = "";
			return;
		}
	}

	void addText(String text) {
		if (text != null || !text.equals(" ")) {
			this.text = text;
			System.out.println("Added text");
		} else {
			this.text = "";
			return;
		}
	}

	void deleteText() {
		this.text = new String("");
		System.out.println("Text deleted");
	}

	void viewPage() {
		System.out.print(this.title + ", ");
		System.out.println(this.text);
	}

	boolean searchWord(String word) {
		
		if (!word.equals(" ") || word != null) {
			System.out.println("Invalid word to search");
			if (text.contains(word)) {
				return true;
			} 
		}
		return false;

	}

	boolean containsDigits() {
		for (int index = 0; index < text.length(); index++) {
			char c = text.charAt(index);
			if (c >= '0' && c <= '9')
				return true;
		}

		return false;

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if (text == null || text.equals(" ")) {
			System.out.println("Invalid text");
			return;
		}else {
			this.text = text;
			return;
		}
	}

	public String getTitle() {
		return title;
	}
	
	
}
