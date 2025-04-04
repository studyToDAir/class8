package kr.or.human.dto;
import java.sql.Date; 
import java.util.List;

import lombok.Data;

// DTO : Data Transfer Object
// VO : Value Object
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor // 생성자
//@EqualsAndHashCode
@Data
public class EmpDTO {
	
	private Integer empno;		// 사원번호
	private String ename;	// 사원명
	private String job;
	private Integer mgr;
	private Date hiredate;
	private int sal = -1;
	private Integer comm;
	private Integer deptno;
	
	private String type;
	private String keyword;

	private List empnos;
	
	private int page = 1;	// 현재 페이지
	private int viewCount = 10;	// 페이지당 보여줄 수 countPerPage rowPerPage
	private int indexStart;
	private int indexEnd;
	
}
