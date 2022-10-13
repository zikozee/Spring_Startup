## inversion of control
- spring container == applicationContext is responsible for managing all the beans

## dependency injection
-  spring container or applicationContext injects all the dependencies of the object you are calling
  without you having to manually do it
- for xml we use the  <constructor-arg ref="myFortune" /> to wire in the dependency, where **myFortune** 
- is the dependency bean name