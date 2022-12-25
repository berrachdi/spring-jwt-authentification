# spring-jwt-authentification

Spring Security JWT in Spring Boot 2.7.6
This is diagram for Spring Security/JWT classes that are separated into 3 layers:
– HTTP
– Spring Security
– REST API <br /><br />
![spring jwt authentification flow](https://www.bezkoder.com/wp-content/uploads/2020/05/spring-boot-jwt-mysql-spring-security-architecture.png)

<br/>
<br/>
With diagram above, we can easily associate these components with Spring Security Authentication process: receive HTTP request,
filter, authenticate, store Authentication data, generate token, get User details, authorize, handle exception..

