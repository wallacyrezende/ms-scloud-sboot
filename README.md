# ms-scloud-sboot
Microsserviços utilizando Spring Boot e Spring Cloud, e implementando Feign, Ribbon, Hystrix, OAuth, JWT, Discovery Server Eureka, API Gateway Zuul e Config Server

Implementando conceitos anteriores utilizando docker

# Alguns comandos Docker


### Criar uma rede Docker

docker network create <nome-da-rede>
  
  
### Baixar imagem do Dockerhub

docker pull <nome-da-imagem:tag>


### Ver imagens

docker images


### Criar/rodar um container de uma imagem

docker run -p <porta-externa>:<porta-interna> --name <nome-do-container> --network <nome-da-rede> <nome-da-imagem:tag> 
  
  
### Listar containers

docker ps

docker ps -a


### Acompanhar logs do container em execução

docker logs -f <container-id>
