package quiz;

public class EmpExam {

	public static void main(String[] args) {

		// insert into emp ()
		// values ()
		Emp e = new Emp();
		e.empno = 7369;
		e.ename = "smith";
		e.sal = 800;
		e.mgr = 7902;
		
		EmpTable et = new EmpTable();
		et.insert(e);
		
		Emp e2 = new Emp();
		e2.empno = 7902;
		e2.ename = "ford";
		e2.sal = 3000;
		e2.mgr = 7566;
		
		et.insert(e2);
		
		et.select();
	}

}
