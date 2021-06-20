don't hard code your database password in application.properties file
For that we can set up environ variable as in the application.properties file
to set that environment variables goto project properties by clicking right and use tabs itself


ENVIRONMENTAL CONFIGURATIONS
	spring.profiles.active=prod
	spring.profiles.active=dev
	
	prod and dev are the suffix which is in properties file
	logging.level.org = INFO
	above will log only org package INFO messages

CUSTOM CONFIGURATION classes are used to set datasource etc.code can check in PersistanceConfiguration class
external to internal configuration

To get package for deploy use mvn package command/pom.xml shows the type of file(jar,war etc)

to run jar file use -> java -jar filename.jar

<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<executable>true</executable>//executable jar -> this can be execute in linux/unix systems by ./filename.jar
				</configuration>
			</plugin>
		</plugins>