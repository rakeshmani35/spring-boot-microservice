Microservice Rules
=======================
1) Indenedent
2) Coupling
3) Business goal

Microservice Design Pattern
===========================
1) Decomposition Design Patterns
     - Business Capability
	 - Subdomain
	 - Strangler
	 
2) Integration Design Patterns
     - API Gateway
	 - Aggregater
	 - Proxy
	 - Client Side UI decomposition
	 - Chain of responsibilities
	 - Branch
	 
3) Database Design Patterns
     - Database per service
	 - Shared database per service
	 - CQRS (Command Query Responsiblity segregator)
	 - Two Phase Commit
	 - Saga
	 - Asynchronous Messaging
	 - Even Sourcing
	 
4) Observability Design Patterns
     - Log Aggregation
	 - Performance Matrics
	 - Distributed Tracing
	 - Health Check
	 
5) Cross Cutting Concern Design Patterns
     - External Configuration
	 - Service Discovery
	 - Circuit Breaker
	 - Blue Green Deployment
	 
	 
Microservice Communication
===========================
1) Orchestration
2) Choreography	 


Orchestration vs. Choreography
=================================
To better understand the differences between orchestration and choreography, let’s look at their main distinctions in a table format:
<img width="562" alt="image" src="https://github.com/user-attachments/assets/9f30db73-f3ac-4d7e-96e2-15df81443cca">
