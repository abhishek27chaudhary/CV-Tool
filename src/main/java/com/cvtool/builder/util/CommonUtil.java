package com.cvtool.builder.util;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.cvtool.builder.entity.Employee;

public class CommonUtil {
	
	private EntityManager manager;
	
	public Boolean findUserByEmail(String email) {
		System.out.println("findby user email -----------------------------");
		CriteriaBuilder cb = manager.getCriteriaBuilder();
		CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		
		List<Predicate> res = new ArrayList<>();
		res.add(cb.equal(root.get("email"), email));
		query.select(root).where(cb.and(res.toArray(new Predicate [res.size()])));
		 manager.createQuery(query).getResultList();
		 return true;
}
}
