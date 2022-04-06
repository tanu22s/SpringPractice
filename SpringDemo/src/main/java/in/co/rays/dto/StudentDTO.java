package in.co.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "Student")
public class StudentDTO {
	
	@Id
	@GenericGenerator(name="hiIncrement",strategy="increment")
	@GeneratedValue(generator="hiIncrement")
	@Column(name="ID",unique=true,nullable=false)
	protected long id;
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name = "Roll_No")
	private int rollNo;
	@Column(name = "NAME", length = 255)
	private String name;
	@Column(name = "DOB", length = 255)
	private String DOB ;
	@Column(name = "gmail_id", length = 255)
	private String gmail_id;
	@Column(name = "pass", length = 255)
	private String pass;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGmail_id() {
		return gmail_id;
	}
	public void setGmail_id(String gmail_id) {
		this.gmail_id = gmail_id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	
	
}
