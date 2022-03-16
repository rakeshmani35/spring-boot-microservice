Spring Cloud Netflix provides Netflix OSS integrations for Spring Boot apps through autoconfiguration and binding to the Spring Environment and other Spring programming model idioms. With a few simple annotations you can quickly enable and configure the common patterns inside your application and build large distributed systems with battle-tested Netflix components. The patterns provided include Service Discovery (Eureka), Circuit Breaker (Hystrix), Intelligent Routing (Zuul) and Client Side Load Balancing (Ribbon).

![image](https://user-images.githubusercontent.com/30867202/158517074-ec778e56-20c7-48e2-959a-5ac9d254c3bb.png)


Client and Server is always relative. Zuul is a client for your service instances and your service instances are servers for Zuul.

Traditional load balancer :

When we are using traditional load balancer (server-side load balancer), API caller (client) only knows a single endpoint that is a load balancer and the client doesn't know the list of servers. Load balancer chooses a server from the list.

# ZUUL :
![image](https://user-images.githubusercontent.com/30867202/158524040-5f527c19-0c79-40f8-86ec-54d1d0c3eae3.png)

When Zuul receives a request, it picks up one of the physical locations available and forwards requests to the actual service instance.

Internally, Zuul uses Netflix Ribbon to look up for all instances of the service from the service discovery (Eureka Server).

# Ribbon:

When we are using client-side load balancer like Ribbon, API caller (client) should know the list of servers and choose one of them from the list. That's why we call it client-side load balancer.
