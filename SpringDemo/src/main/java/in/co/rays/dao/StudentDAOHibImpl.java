package in.co.rays.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.rays.dto.StudentDTO;


@Repository(value="StudentDao")
public class StudentDAOHibImpl implements StudentDAOInt{
	@Autowired
	private SessionFactory sessionFactory = null;
	@Override
	public long add(StudentDTO dto) {
		// TODO Auto-generated method stub
		
		System.out.println("Student Dao Add Started");
		long pk = 0;
		pk = (Long) sessionFactory.getCurrentSession().save(dto);
		System.out.println("User Dao Add end");
		return pk;
	}
	@Override
	public void update(StudentDTO dto) {
		System.out.println("Student dao update Started");
		 sessionFactory.getCurrentSession().update(dto);
		 System.out.println("Student Dao update Started");
		
	}
	
	
	@Override
	public void delete(long id) {

System.out.println("Student dao delete started");
StudentDTO dto =findbypk(id);
  
sessionFactory.getCurrentSession().delete(dto);
System.out.println("Student dao delete end");
		
	}
	@Override
	public StudentDTO findbypk(long pk) {
		System.out.println("student dao findby pk started");
		StudentDTO dto = null;
		dto =  (StudentDTO) sessionFactory.getCurrentSession().get(StudentDTO.class, pk);
		
		System.out.println("dao "+dto);
		System.out.println("student dao findby pk end");
		return dto;
	}
	@Override
	public List search(StudentDTO dto, int pageNo, int pageSize) {
		Criteria criteria= sessionFactory.getCurrentSession().createCriteria(StudentDTO.class);
		if(dto!=null){
			if(dto.getId()>0){
				criteria.add(Restrictions.eq("id", dto.getId()));
			}
			if(dto.getName()!=null&&dto.getName().length()>0){
				criteria.add(Restrictions.like("name", dto.getName()+"%"));
			}
			if(dto.getGmail_id()!=null&&dto.getGmail_id().length()>0){
				criteria.add(Restrictions.like("Email_id", dto.getGmail_id()+"%"));
			}
			
		}
         List list = criteria.list();
		
		return list;
	}

}
