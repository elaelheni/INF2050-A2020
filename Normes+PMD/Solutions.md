## Checkstyle-IDEA plugin intellij
- file -> settings -> plugins -> Marketplace -> Checkstyle-IDEA 
- Restart intellij
- file -> settings -> checkstyle -> configuration file -> Sun Checks
- Right click on project -> analyse -> inspect code
- Inspection results -> checkstyle

## PMD plugin Intellij
- file -> settings -> plugins -> PMDPlugin
- Restart intellij
- file -> settings -> PMD
- tools -> pmd -> predefined

## Checkstyle maven
[https://maven.apache.org/plugins/maven-checkstyle-plugin/usage.html](https://maven.apache.org/plugins/maven-checkstyle-plugin/usage.html)

```mvn site```

## PMD maven
[https://maven.apache.org/plugins/maven-pmd-plugin/usage.html](https://maven.apache.org/plugins/maven-pmd-plugin/usage.html)

```mvn site```

## Maven site

```
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-site-plugin</artifactId>
    <version>3.7.1</version>
</plugin>
```

## Maven checkstyle dependecy
```
<dependency>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-checkstyle-plugin</artifactId>
    <version>3.1.1</version>
    <type>maven-plugin</type>
  </dependency>
```

## Maven pmd dependency
```
<dependency>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-pmd-plugin</artifactId>
    <version>3.13.0</version>
    <type>maven-plugin</type>
  </dependency>
```

