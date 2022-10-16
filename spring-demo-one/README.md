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


## Bean Scopes
- **singleton** : -> creates a single shared instance of the bean. Default scope
- **prototype** : -> creates a new bean instance for each container request
- **request** : -> Scoped to an HTTP web request. Only used for web apps
- **session** : -> Scoped to an HTTP web session. Only used for web apps
- **global-session** : -> Scoped to a global HTTP web session. Only used for web apps

## Bean LifeCycle
- container starts -> bean instantiated -> dependencies injected -> internal Spring processing -> ...
- ... Your Custom Init method -> Bean is ready for use -> Your custom Destroy Method

- init-Method and destroy-Method should take in method that has no args
- is should be void (though can have a return type), but the return type is not captured
- it can take any access modifiers

## How to destroy prototype
- By default prototype bean does not call the destroy method
- we need implement a DisposableBean and override the **destroy()** method
- OR just implement [this](https://bluebreeze0812.github.io/learn/2019/10/17/Spring-Destroy-Prototype-Beans/#:~:text=Therefore%20it's%20usually%20not%20necessary,hooks%20of%20your%20prototype%20beans.) as a component