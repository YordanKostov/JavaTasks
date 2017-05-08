package notebook;

public class Demo {

	public static void main(String[] args) {
			
			
			SimpleNotepad simplepad = new SimpleNotepad(4);
			SecuredNotepad securedpad = new SecuredNotepad(5, "Abv123"); 
			ElectronicSecuredNotepad elsecuredPad = new ElectronicSecuredNotepad(3, "Abv123");
			
			Page page1 = new Page("Page 1");
			Page page2 = new Page("Page 2");
			Page page3 = new Page("Page 3");
			Page page4 = new Page("Page 4");

			Page page5 = new Page("Page 5");
			Page page6 = new Page("Page 6");
			Page page7 = new Page("Page 7");
			Page page8 = new Page("Page 8");

			
			
		    simplepad.addText("G1", page1, 0);
		    simplepad.addText("g", page2, 1);
		    simplepad.addText("M", page3, 2);
		    simplepad.addText("U", page4, 3);
		    simplepad.addText("dwadw",page5,4);
		    
		    System.out.println(page1.searchWord("G"));
		    System.out.println(page1.containsDigits());
		    
		    simplepad.replaceText("Haha", page2, 1);
		    simplepad.deleteText(page3);
		    
		    System.out.println("Simple Notepd :");
		    System.out.println();
		    simplepad.showAllPages();
		    
		    System.out.println(simplepad.searchWord("G"));
		    simplepad.printAllPagesWithDigits();
		    
		    if(securedpad.checkPass() == true)
		    securedpad.addText("porew", page2, 1);
		    else System.out.println("Wrong password");
		    if(securedpad.checkPass() == true)
		    securedpad.addText("hhaha", page3, 2);
		    else System.out.println("Wrong password");
		    if(securedpad.checkPass() == true){
		    	System.out.println();
		    	System.out.println("Secured Notepad : ");
		    	System.out.println();
		    securedpad.showAllPages();
		    }
		    else System.out.println("Wrong password");
		    
		 elsecuredPad.start();
		 if(elsecuredPad.isStarted()){
			 if(elsecuredPad.checkPass() == true)
		 elsecuredPad.addText("dawdwa", page1, 0);
			 else System.out.println("Wrong password");
		 }
		 else System.out.println("The electronic notepad is not started");
		 if(elsecuredPad.isStarted()){
			 if(elsecuredPad.checkPass() == true)
		 elsecuredPad.addText("rokoko", page2, 1);
			 else System.out.println("Wrong password");
		 }
		 else System.out.println("The electronic notepad is not started");
		 if(elsecuredPad.isStarted()){
			 if(elsecuredPad.checkPass() == true){
			 System.out.println();
			 System.out.println("Electronic secured notepad : ");
			 System.out.println();
		  elsecuredPad.showAllPages();
			 }
			 else System.out.println("Wrong password");
		 }
		 else System.out.println("The electronic notepad is not started");
			}

}
