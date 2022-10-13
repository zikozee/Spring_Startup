## inversion of control
- spring container == applicationContext is responsible for managing all the beans

## dependency injection
-  spring container or applicationContext injects all the dependencies of the object you are calling
  without you having to manually do it
- for xml we use the  <constructor-arg ref="myFortune" /> to wire in the dependency, where **myFortune** 
- is the dependency bean name
- setter injection: requires the use of <property name="fortuneService"  ref="myFortuneService"/>
- the above looks for a void class with name setFortuneService(...) which is used for injection of bean with Name myFortuneService
- setter injection: requires the use of <property name="emailAddress"  value="myemail.com"/>
- injecting values directly the above

##  loadings value from property file
- we set context like this    **<context:property-placeholder location="classpath:sport.properties"/>**
- we then load the property via syntax    <property name="team" value="${PROPERTY_NAME}"  /> 
