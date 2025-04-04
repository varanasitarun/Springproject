package studentteacher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studentteacher.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
