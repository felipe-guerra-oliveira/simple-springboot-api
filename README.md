# simple-springboot-api
API construída com Spring Boot para demonstração

## Instalação

Se você deseja baixar e rodar esse exemplo de API usando Spring Boot, você vai precisar dos seguintes pré-requisitos:

- JDK 17
- Maven 3.8.x ou superior
- Github Desktop (não é obrigatório mas auxilia muito)

## Execução

Faça o **clone** do projeto em um pasta de sua preferência.

Ex.:
```
git clone https://github.com/felipe-guerra-oliveira/simple-springboot-api.git
```

Valide que a JDK esteja instala e funcionando em sua máquina:

```
java --version

openjdk 17.0.13 2024-10-15
OpenJDK Runtime Environment OpenLogic-OpenJDK (build 17.0.13+11-adhoc.admin.jdk17u)
OpenJDK 64-Bit Server VM OpenLogic-OpenJDK (build 17.0.13+11-adhoc.admin.jdk17u, mixed mode, sharing)
```

Também, garanta que você baixou e configurou o Maven em sua máquina corretamente:

```
mvn --version

Apache Maven 3.9.8 (36645f6c9b5079805ea5009217e36f2cffd34256)
Maven home: /opt/maven/apache-maven-3.9.8
Java version: 17.0.13, vendor: OpenLogic, runtime: /Library/Java/JavaVirtualMachines/openlogic-openjdk-17.jdk/Contents/Home
Default locale: en_BR, platform encoding: UTF-8
OS name: "mac os x", version: "15.3.1", arch: "x86_64", family: "mac"

```

Em seguida, execute a aplicação na linha de comando utilizando o comando:

```
mvn spring-boot:run


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::             (v3.5.0-M3)

2025-03-22T16:56:24.280-03:00  INFO 30950 --- [simple-springboot-api] [           main] b.c.i.a.s.SimpleSpringbootApiApplication : Starting SimpleSpringbootApiApplication using Java 17.0.13 with PID 30950 (/Users/fguerraoliveira/Projects/Impacta/workspace/simple-springboot-api/target/classes started by fguerraoliveira in /Users/fguerraoliveira/Projects/Impacta/workspace/simple-springboot-api)
2025-03-22T16:56:24.284-03:00  INFO 30950 --- [simple-springboot-api] [           main] b.c.i.a.s.SimpleSpringbootApiApplication : No active profile set, falling back to 1 default profile: "default"
2025-03-22T16:56:25.286-03:00  INFO 30950 --- [simple-springboot-api] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8000 (http)
2025-03-22T16:56:25.301-03:00  INFO 30950 --- [simple-springboot-api] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-03-22T16:56:25.301-03:00  INFO 30950 --- [simple-springboot-api] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.39]
2025-03-22T16:56:25.353-03:00  INFO 30950 --- [simple-springboot-api] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-03-22T16:56:25.355-03:00  INFO 30950 --- [simple-springboot-api] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1018 ms
2025-03-22T16:56:25.840-03:00  INFO 30950 --- [simple-springboot-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint beneath base path '/actuator'
2025-03-22T16:56:25.915-03:00  INFO 30950 --- [simple-springboot-api] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8000 (http) with context path '/'
2025-03-22T16:56:25.934-03:00  INFO 30950 --- [simple-springboot-api] [           main] b.c.i.a.s.SimpleSpringbootApiApplication : Started SimpleSpringbootApiApplication in 2.094 seconds (process running for 2.392)
```

## Testes

Execute a seguinte URL http://localhost:8000/ping em seu browser, e valide que o retorno seja "OK".