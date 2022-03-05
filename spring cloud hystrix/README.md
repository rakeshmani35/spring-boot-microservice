# Spring-cloud-hystrix
How to use hystrix

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

add at hystric command at method
@HystrixCommand(groupKey = "abc abc", commandKey = "abc abc", fallbackMethod = "bookMyShowFallBack")

# fallback method
fallback method return type same as hystrix command method return type
public String bookMyShowFallBack() {
		return "service gateway failed...";
	}
    
    
 # 1. if all service up
 # http://localhost:8080/bookNow
  Email Service Called....
  Payment Service Called....
 
 # http://localhost:8080/bookNowWithoutHystrix
  Email Service Called....
  Payment Service Called....
 
 # 2. if any service down
 # http://localhost:8080/bookNow
   service gateway failed...
 
 
 # http://localhost:8080/bookNowWithoutHystrix
 {
    "timestamp": "2022-03-05T12:22:33.482+00:00",
    "status": 500,
    "error": "Internal Server Error",
    "message": "",
    "path": "/bookNowWithoutHystrix"
}


 
 
