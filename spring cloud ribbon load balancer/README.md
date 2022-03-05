# spring-cloud-loadbalance
How to balance load using spring cloud ribbon 

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
