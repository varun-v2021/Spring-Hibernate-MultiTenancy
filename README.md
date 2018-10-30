# Spring-Hibernate-MultiTenancy

Reference:

https://github.com/alonsegal/springboot-schema-per-tenant

https://dzone.com/articles/spring-boot-hibernate-multitenancy-implementation

# Running Application using Insomnia

POST http://localhost:9091/orders, No authentication enabled 

Headers must have

X-TenantID as key and a string variable like sample-ten-123 be value
