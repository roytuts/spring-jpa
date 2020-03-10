package spring.data.jpa.stored.procedure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import spring.data.jpa.stored.procedure.entity.UserDetails;

@Repository
public class UserDetailsRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<UserDetails> findUserDetailsListUsingAlias() {
		StoredProcedureQuery users = entityManager.createNamedStoredProcedureQuery("getUsers");
		return users.getResultList();
	}

	public List<UserDetails> findUserDetailsListUsingName() {
		StoredProcedureQuery users = entityManager.createStoredProcedureQuery("get_users");
		return users.getResultList();
	}

	public String findUserFullNameInOutUsingName(String dob) {
		StoredProcedureQuery q = entityManager.createStoredProcedureQuery("get_user_full_name_inout");

		q.registerStoredProcedureParameter("in_out", String.class, ParameterMode.INOUT);

		q.setParameter("in_out", dob);

		return q.getOutputParameterValue("in_out").toString();
	}

	public String findUserFullNameIn_OutUsingName(Integer in) {
		StoredProcedureQuery q = entityManager.createStoredProcedureQuery("get_user_full_name_in_out");

		q.registerStoredProcedureParameter("user_id", Integer.class, ParameterMode.IN);
		q.registerStoredProcedureParameter("full_name", String.class, ParameterMode.OUT);

		q.setParameter("user_id", in);

		return q.getOutputParameterValue("full_name").toString();
	}

}
