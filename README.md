# DataLayerMgmtviaJDBC-SpringJDBC-JPA-Spring-JPA-SpringDataJPA
This repository describes the Different ways of creating Data Repository in Java Enterprise Edition:

1.Simply adding Jar file 
for eg. If wants to connect to Mysql using Java then add JDBC driver in classpath & connect with it by registering driver & creating connection object.

2.By Using Spring JDBC 
It helps in removing the boilerplate code of Java like creating connections etc here main purpose is only to write queries.

3.JPA specification was used for ORM mapping . This specification is implemented by Hibernate.
Here no need to wriet queries instead EntityManager is there which handles everything.
No query need ,no boilerplate java code for making connections.

4.Finally Spring-Data-JPA abstract layer over Hibernate & JPA which abstacts the Entity manager bolierplate code & helps in creating repository by extending JpaRepository<Entity.class,PrimaryDatatpe>
-No Queries needed direct Function
-No boilerplate code for making connections ,entitymanager . 
Everything autoconfigured.

Finally Coming to conclusion:
JDBC-->JPA-->Hibernate-->Spring-JPA-->Spring-data-JPA
