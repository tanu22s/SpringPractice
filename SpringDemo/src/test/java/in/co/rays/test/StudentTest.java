package in.co.rays.test;


import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;

//package in.co.rays.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import in.co.rays.dto.StudentDTO;
import in.co.rays.service.StudentServiceInt;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/dispatcher-servlet.xml"})
public class StudentTest {
	
	@Autowired
	StudentServiceInt Student;
	
	@Ignore
	public void add() {
		System.out.println("add mathod");
		StudentDTO dto= new StudentDTO();
		dto.setName("Madhuri");
		dto.setDOB("09/09/1999");
		dto.setRollNo(101);
		dto.setGmail_id("Madhu123@gmail.com");
		dto.setPass("65543");
		Student.add(dto);
		System.out.println("add Successfully");
				
	}
	@Ignore
	public void update() {
		System.out.println("test update Started");
		StudentDTO dto= new StudentDTO();
		dto.setId(1);
		dto.setName("Anisha");
		dto.setDOB("09/06/2001");
		dto.setPass("123455");
		dto.setRollNo(100);
		Student.update(dto);
		System.out.println("test update end");
	}
	@Ignore
	public void delete() {
System.out.println("test delete Started");


Student.delete(2);
System.out.println("Test delete end");

	}
	@Test
	public void search() {
		StudentDTO dto = new StudentDTO();
		dto.setName("Anisha");
		List list = Student.search(dto, 0, 0);
		Iterator it = list.iterator();
		while(it.hasNext()){
			
			dto =  (StudentDTO) it.next();
			
			System.out.print(dto.getId());
			System.out.print("\t"+dto.getName());
			System.out.print("\t"+dto.getDOB());
			System.out.print("\t"+dto.getPass());
			System.out.print("\t"+dto.getRollNo());
			System.out.println("\t"+dto.getGmail_id());
			
			
		}
	}


}
