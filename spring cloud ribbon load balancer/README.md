# spring-cloud-loadbalance
How to balance load using spring cloud ribbon.
Ribbon is a client-side load balancer given by Netflix.

Ribbon primarily provides client-side load balancing algorithms.

Apart from the client-side load balancing algorithms, Ribbon provides also other features:

1) Service Discovery Integration – Ribbon load balancers provide service discovery in dynamic environments like a cloud. Integration with Eureka and Netflix service discovery component is included in the ribbon library

2) Fault Tolerance – the Ribbon API can dynamically determine whether the servers are up and running in a live environment and can detect those servers that are down

3) Configurable load-balancing rules – Ribbon supports RoundRobinRule, AvailabilityFilteringRule, WeightedResponseTimeRule out of the box and also supports defining custom rules

# pom.xml

		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
		</dependency>

# RibbonConfiguration

IClientConfig,
IPing,
IRule

# application.yml

chatbook:

  ribbon:
  
    eureka:
    
      enabled: false
      
    listOfServers: localhost:8081,localhost:8082,localhost:8083
    
    ServerListRefreshInterval: 2000
 
server:
  port: 9090


when hit the http://localhost:9090/chat multiple time, then service will hit on different different port in sequence like 8081, 8082, 8083. This sequence happening because of round-robin algorithm used in ribbon load balancer.
