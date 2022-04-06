package in.co.rays.dao;

import java.util.List;

import in.co.rays.dto.StudentDTO;

public interface StudentDAOInt {
	public long add(StudentDTO dto);
	public void update(StudentDTO dto);
	public void delete(long id);
	public StudentDTO findbypk(long pk);
	public List search(StudentDTO dto , int pageNo , int pageSize);
	
}
