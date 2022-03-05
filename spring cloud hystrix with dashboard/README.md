# spring-boot-hystrix-dashboard
How to enable hystrix circuit breaker dashboard in spring boot application 

#hystrix url
http://localhost:8080/hystrix

http://localhost:8080/actuator/hystrix.stream

![image](https://user-images.githubusercontent.com/30867202/156889647-02073a7e-8cb6-4080-a8f3-035a16b6a491.png)

# hystrix dashboard
![image](https://user-images.githubusercontent.com/30867202/156889670-dbe8c4c0-9493-4e14-b058-93d6b1f5e13b.png)


# pom.xml
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-hystrix-dashboard</artifactId>
		</dependency>
    
    
# enable hystrix
enable class

@EnableHystrix

@EnableHystrixDashboard


add at hystric command at method

@HystrixCommand(groupKey = "abc abc", commandKey = "abc abc", fallbackMethod = "bookMyShowFallBack")

# fallback method
fallback method return type same as hystrix command method return type

public String bookMyShowFallBack() {
		return "service gateway failed...";
	}
    
    
 # 1. if all service up
 #http://localhost:8080/bookNow
 
  Email Service Called....
  Payment Service Called....
 
 #http://localhost:8080/bookNowWithoutHystrix
 
  Email Service Called....
  Payment Service Called....
 
 # 2. if any service down
 #http://localhost:8080/bookNow
 
   service gateway failed...
 
 
 #http://localhost:8080/bookNowWithoutHystrix
 
 {
    "timestamp": "2022-03-05T12:22:33.482+00:00",
    "status": 500,
    "error": "Internal Server Error",
    "message": "",
    "path": "/bookNowWithoutHystrix"
}


 
 

