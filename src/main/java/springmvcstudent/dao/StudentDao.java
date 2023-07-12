package springmvcstudent.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.Query;

import antlr.collections.List;
import springmvcstudent.dto.Student;

@Repository
public class StudentDao {
	@Autowired
	private EntityManager entityManager;
	

	public Student saveStudent(Student student) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	public java.util.List<Student> getAllSTudents(){
		EntityTransaction entityTransaction=entityManager.getTransaction();
		javax.persistence.Query query=entityManager.createQuery("select s from Student s");
		java.util.List<Student> list=query.getResultList();
		return list;
	}
	public void deleteStudentById(int id) {
	Student student=entityManager.find(Student.class, id);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
	}
	public Student findStudentById(int id) {
		Student student=entityManager.find(Student.class, id);
		return student;
		
	}
	public void updateStudent(Student student) {
	 EntityTransaction entityTransaction=entityManager.getTransaction();
	 entityTransaction.begin();
	 entityManager.merge(student);
	 entityTransaction.commit();
		
	}

}
