# Spring Cloud config Server
* [Nos sirve para centralizar la configuracion de todos nuestros microservicios, podriamos tener una gran arquitectura con varios microservicios y diferentes, con difrentes ambientes (desarrollo , produccion , testing), entonces centralizamos toda esta configuracion y administrarla.]
Podemos centralizar toda esta configuracion en un repositorio Git (local o remoto)
Antes de iniciar el Microservicio ->  Config Server  < --- > Repositorio Git
								  <-	
Antes de registrarse en Eureka va a consultar en el servidor de configuracion,todos sus atributos y propiedades de configuracion (Puerto, Cobexion a BD, ambientes) y una ves que las obtenga del repositorio Git se va a registrar en Eureka


## En la clase principal 
@EnableConfigServer
