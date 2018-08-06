package com.hibernate.multitenancy.multitenant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.hibernate.multitenancy.domain.UserTenantRelation;
import com.hibernate.multitenancy.repository.UserTenantRelationRepository;
import com.hibernate.multitenancy.domain.UserTenantRelation;

@Component
public class TenantNameFetcher extends UnboundTenantTask<UserTenantRelation> {
	 @Autowired
	    private UserTenantRelationRepository userTenantRelationRepository;

	    @Override
	    protected UserTenantRelation callInternal() {
	        UserTenantRelation utr = userTenantRelationRepository.findByUsername(this.username);
	        return utr;
	    }
}
