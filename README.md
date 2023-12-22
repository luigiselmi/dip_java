Digital Image Processing in Java
================================
Notes from the book by Burger and Burge [Digital Image Processing - An Algorithmic Introduction, 3rd Edition](https://imagingbook.com/)

## Import jar file into the local Maven repository

  mvn install:install-file -Dfile=<path to jar file> -DgroupId=<Maven groupId> -DartifactId=<Maven artifact> -Dversion=<version> -Dpackaging=jar

Install the common package

  mvn install:install-file -Dfile=lib/imagingbook-common-1.6.jar -DgroupId=imagingbook -DartifactId=common -Dversion=1.6 -Dpackaging=jar

The common jar file can be used as a dependency in the project using the coordinates

  <dependency>  
    <groupId>imagingbook</groupId>  
    <artifactId>common</artifactId>   
    <version>1.6</version>  
  </dependency>   

Install the plugins package

  mvn install:install-file -Dfile=lib/imagingbook_plugins_all-1.6.jar -DgroupId=imagingbook -DartifactId=plugins-all -Dversion=1.6 -Dpackaging=jar

The plugins jar file can be used as a dependency in the project using the coordinates

  <dependency>  
    <groupId>imagingbook</groupId>  
    <artifactId>plugins-all</artifactId>   
    <version>1.6</version>  
  </dependency>   
