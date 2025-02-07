package quiz;

import java.util.ArrayList;

public class EmpTable {

	ArrayList list = new ArrayList();
	
	void insert(Emp emp) {
		this.list.add(emp);
	}
	
	// Emp selectOne(index)
	
	void select() {
		for(int i=0; i<list.size(); i++) {
			Emp e = (Emp)list.get(i);
			System.out.print(e.empno +", "+
							 e.ename +", "+ 
							 e.sal +", "+ 
							 e.mgr);
			System.out.println();
		}
	}
}
