package quiz.login;

import java.util.ArrayList;

public class Portal {

	Portal() {
	}

	Object[] obj;
	int cursor;

	Portal(int length) {
		obj = new Object[length];
	}

	void add(Object o) {
		this.obj[cursor++] = o;
	}

	Object get(int index) {
		return this.obj[index];
	}

	/*
	 * boolean join(이름, id, pw) - Naver 회원 가입 String findId(이름) - Naver 회원 찾기 String
	 * findPw(이름, id) - Naver 비번 찾기 boolean loginCheck(...) - Naver 회원인지
	 */
	ArrayList list = new ArrayList();

	boolean join(String name, String id, String pw) {
		Member member = new Member();
		member.name = name;
		member.id = id;
		member.pw = pw;

		for (int i = 0; i < this.list.size(); i++) {
			Member m = (Member) list.get(i);

			if (m.id == null || m.id.equals(id)) {
				return false;
			}
		}

		list.add(member);
		return true;
	}

	String findId(String name) {
		for (int i = 0; i < this.list.size(); i++) {
			Member m = (Member) list.get(i);

			if (m.name.equals(name)) {
				return m.id;
			}
		}

		return null;
	}

	String findPw(String name, String id) {
		String result = null;

		for (int i = 0; i < this.list.size(); i++) {
			Member m = (Member) list.get(i);

			if (m.name.equals(name) && m.id.equals(id)) {
				result = m.pw;
				break;
			}
		}

		return result;
	}

	boolean loginCheck(String id, String pw) {
		boolean result = false;

		for (int i = 0; i < this.list.size(); i++) {
			Member m = (Member) list.get(i);

			if (m.id.equals(id) && m.pw.equals(pw)) {
				result = true;
				break;
			}
		}

		return result;
	}
}
