

<!-- to remove get,set from dto to entity we use mapstruct -->
		<dependency>
			<groupId>org.mapstruct</groupId>
			<artifactId>mapstruct</artifactId>
			<version>1.5.5.Final</version>
		</dependency>

<!--	This plugin is used to generate the mapper implementation during the build-->
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version> <!-- Use the appropriate version -->
				<configuration>
					<source>17</source> <!-- or your Java version -->
					<target>17</target> <!-- or your Java version -->
					<annotationProcessorPaths>
						<path>
							<groupId>org.mapstruct</groupId>
							<artifactId>mapstruct-processor</artifactId>
							<version>1.5.5.Final</version> <!-- Use the latest version -->
						</path>
					</annotationProcessorPaths>
				</configuration>
			</plugin>