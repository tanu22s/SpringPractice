package in.co.rays.service;

import java.util.List;

import in.co.rays.dto.StudentDTO;

public interface StudentServiceInt {
	public long add(StudentDTO dto);
	public void update(StudentDTO dto);
	public StudentDTO findbypk(long pk);
	public void delete(long id);
	public List search(StudentDTO dto , int pageNo , int pageSize);
	

}
