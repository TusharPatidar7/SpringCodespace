package task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import task.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	Student findByEmail(String email);
	
	@Query(value = "select * from student_info where email=?1 and password=?2", nativeQuery = true)
	Student findByEmailAndPassword(String email, String password);

}
