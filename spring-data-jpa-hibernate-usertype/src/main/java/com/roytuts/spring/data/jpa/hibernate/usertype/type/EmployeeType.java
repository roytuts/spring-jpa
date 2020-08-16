package com.roytuts.spring.data.jpa.hibernate.usertype.type;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;

public class EmployeeType implements UserType {
	@Override
	public int[] sqlTypes() {
		return new int[] { Types.VARCHAR, Types.VARCHAR };
	}

	@Override
	public Class<String> returnedClass() {
		return String.class;
	}

	@Override
	public boolean equals(Object x, Object y) throws HibernateException {
		return ((x == y) || (x != null && y != null && x.equals(y)));
	}

	@Override
	public int hashCode(Object x) throws HibernateException {
		return x != null ? x.hashCode() : 0;
	}

	@Override
	public Object deepCopy(Object value) throws HibernateException {
		return value == null ? null : value;
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public Serializable disassemble(Object value) throws HibernateException {
		Object deepCopy = deepCopy(value);
		if (!(deepCopy instanceof Serializable)) {
			return (Serializable) deepCopy;
		}
		return null;
	}

	@Override
	public Object assemble(Serializable cached, Object owner) throws HibernateException {
		return deepCopy(cached);
	}

	@Override
	public Object replace(Object original, Object target, Object owner) throws HibernateException {
		return deepCopy(original);
	}

	@Override
	public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session, Object owner)
			throws HibernateException, SQLException {
		if (rs.wasNull()) {
			return null;
		}
		String firstName = rs.getString(names[0]);
		String lastName = rs.getString(names[1]);
		return firstName + " " + lastName;
	}

	@Override
	public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session)
			throws HibernateException, SQLException {
		if (value != null) {
			String[] names = ((String) value).split("\s");
			st.setString(index, names[0]);
			st.setString(index + 1, names[0]);
		} else {
			st.setString(index, null);
			st.setString(index + 1, null);
		}
	}

}
