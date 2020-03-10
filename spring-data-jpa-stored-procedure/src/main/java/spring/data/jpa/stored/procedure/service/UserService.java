package spring.data.jpa.stored.procedure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.data.jpa.stored.procedure.entity.UserDetails;
import spring.data.jpa.stored.procedure.repository.UserDetailsJpaRepository;
import spring.data.jpa.stored.procedure.repository.UserDetailsRepository;

@Service
public class UserService {

	@Autowired
	private UserDetailsJpaRepository jpaRepository;

	@Autowired
	private UserDetailsRepository repository;

	public List<UserDetails> getUserListUsingNativeQuery() {
		return jpaRepository.findUserDetailsList();
	}

	public List<UserDetails> getUserDetailsListUsingProcAlias() {
		return repository.findUserDetailsListUsingAlias();
	}

	public List<UserDetails> getUserDetailsListUsingProcName() {
		return repository.findUserDetailsListUsingAlias();
	}

	public String getUserFullNameInOutUsingProcName(String dob) {
		return repository.findUserFullNameInOutUsingName(dob);
	}

	public String getUserFullNameIn_OutUsingProcName(int in) {
		return repository.findUserFullNameIn_OutUsingName(in);
		// return repository.findUserFullNameIn_OutUsingName(in);
	}

}
