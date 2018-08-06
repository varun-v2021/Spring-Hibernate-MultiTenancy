package com.hibernate.multitenancy.multitenant;

import java.util.concurrent.Callable;

/**
 * This is a workaround to resolve the issue with Hibernate where only a
 * tenant cannot be changed in a single context.
 *
 * Issue: https://hibernate.atlassian.net/browse/HHH-9766
 * Solution taken from: http://stackoverflow.com/questions/30757344/hibernate-multitenancy-change-tenant-in-session/
 */
import static com.hibernate.multitenancy.multitenant.MultiTenantConstants.DEFAULT_TENANT_ID;

public abstract class UnboundTenantTask<T> implements Callable<T> {
	protected String username;

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public T call() throws Exception {
		TenantContext.setCurrentTenant(DEFAULT_TENANT_ID);
		return callInternal();
	}

	protected abstract T callInternal();
}
