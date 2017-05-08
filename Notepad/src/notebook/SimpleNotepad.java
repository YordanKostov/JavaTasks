package notebook;

public class SimpleNotepad implements INotepad {

	private Page[] pagesOfNotepad;

	SimpleNotepad(int numOfPages) {
		if (numOfPages > 0) {
			pagesOfNotepad = new Page[numOfPages];
		} else {
			pagesOfNotepad = new Page[10];
		}

	}

	@Override
	public void addText(String text, Page page, int numberOfPage) {

		if (numberOfPage < 0 || numberOfPage >= pagesOfNotepad.length) {
			System.out.println("Wrong number for page");
			return;
		}
		if (pagesOfNotepad[numberOfPage] != null) {
			pagesOfNotepad[numberOfPage] = page;
			pagesOfNotepad[numberOfPage].setText(pagesOfNotepad[numberOfPage].getText() + " " + text);
			System.out.println("Text to " + pagesOfNotepad[numberOfPage].getTitle() + " is added");
		} else {
			replaceText(text, page, numberOfPage);
			System.out.println("Text to " + pagesOfNotepad[numberOfPage].getTitle() + " is added");
		}
	}

	@Override
	public void replaceText(String text, Page page, int number) {

		if (number < 0 || number > pagesOfNotepad.length) {
			System.out.println("Wrong number for page");
			return;
		}
		pagesOfNotepad[number] = page;
		pagesOfNotepad[number].setText(text);
		System.out.println("Text is replaced");
	}

	@Override
	public void deleteText(Page page) {

		if (page.getText() != null) {
			page.setText("");
			System.out.println("Text is deleted");
		}

	}

	@Override
	public void showAllPages() {
		for (int i = 0; i < pagesOfNotepad.length; i++) {
			if (pagesOfNotepad[i] != null) {
				System.out.println(pagesOfNotepad[i].getTitle());
				System.out.println();
				System.out.println(pagesOfNotepad[i].getText());
				System.out.println();
			}
		}
	}

	@Override
	public boolean searchWord(String word) {
		for (int i = 0; i < pagesOfNotepad.length; i++) {
			if (pagesOfNotepad[i] != null && pagesOfNotepad[i].getText().contains(word)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pagesOfNotepad.length; i++) {
			if (pagesOfNotepad[i] != null && pagesOfNotepad[i].getText().matches(".*\\d.*")) {
				System.out.println(pagesOfNotepad[i].getText());
			}
		}
	}

}
