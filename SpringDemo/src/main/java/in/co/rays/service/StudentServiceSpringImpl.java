package in.co.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.rays.dao.StudentDAOInt;
import in.co.rays.dto.StudentDTO;
 
@Service(value="Studentservice")
public class StudentServiceSpringImpl implements StudentServiceInt{
	@Autowired
	private StudentDAOInt dao=null;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public long add(StudentDTO dto) {
		// TODO Auto-generated method stub
		long pk=dao.add(dto);
		return pk;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void update(StudentDTO dto) {
		System.out.println("Student  service update started");
		dao.update(dto);
		System.out.println("Student  service update end");
		
		
	}

	@Override
	@Transactional(readOnly = true)
	public StudentDTO findbypk(long pk) {
		System.out.println("Service findBy pk started");
		
	StudentDTO dto=	dao.findbypk(pk);
	System.out.println("Service findBy pk end");
		return dto;
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(long id) {
		System.out.println("Service delete started");
		dao.delete(id);
		System.out.println("Service delete end");
		
	}

	@Override
	@Transactional(readOnly = true)
	public List search(StudentDTO dto, int pageNo, int pageSize) {
		return dao.search(dto, pageNo, pageSize);
		
	}

}
