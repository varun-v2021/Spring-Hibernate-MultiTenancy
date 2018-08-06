package com.hibernate.multitenancy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.multitenancy.domain.UserTenantRelation;

public interface UserTenantRelationRepository extends JpaRepository<UserTenantRelation, Integer> {
	UserTenantRelation findByUsername(String name);
}
