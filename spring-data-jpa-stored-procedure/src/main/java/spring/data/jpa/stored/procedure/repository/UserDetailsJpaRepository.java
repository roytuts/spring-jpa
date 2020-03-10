package spring.data.jpa.stored.procedure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import spring.data.jpa.stored.procedure.entity.UserDetails;

public interface UserDetailsJpaRepository extends JpaRepository<UserDetails, Integer> {

	@Query(value = "call get_users()", nativeQuery = true)
	List<UserDetails> findUserDetailsList();

	@Procedure(procedureName = "get_user_full_name_in_out", outputParameterName = "full_name")
	String findUserFullNameIn_OutUsingName(@Param("user_id") Integer in);

}
