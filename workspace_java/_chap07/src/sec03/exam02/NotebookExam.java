package sec03.exam02;

public class NotebookExam {

	public static void main(String[] args) {

		Notebook n = new Notebook();
		n.boot();
		
		PC pc = new PC();
		pc.boot();
		( (MacOS) pc ).boot();
		
	}

}
