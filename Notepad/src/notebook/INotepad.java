package notebook;

public interface INotepad {

	void addText(String text,Page page, int numberOfPage);
	void replaceText(String text,Page page, int numberOfPage);
	void deleteText(Page page);
	void showAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
}
