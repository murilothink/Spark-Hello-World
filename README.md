# Spark-Java-Maven-Hello-World


Starter code for a Hello World web app using the Spark Java framework
that will run on CSIL

Must run on a machine with Java 8, i.e. NOT currently on csil.cs.ucsb.edu
as of this writing.  (All Phelps 3525 and CSIL cartoon name machines
should be ok.)

To compile and build an executable jar, do this from top level directory:

  mvn clean compile assembly:single

To run that jar:

  java -jar target/HelloSpark-1.0-jar-with-dependencies.jar 

