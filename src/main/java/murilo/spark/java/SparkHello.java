package murilo.spark.java;

import static spark.Spark.*;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;

public class SparkHello {
    public static void main(String[] args) {

        SparkSession spark =  SparkSession.builder()
                .master("local")
                .appName("Word Count")
                .getOrCreate();
        Dataset<String> logData = spark.read().textFile( "/home/murilohg/Documentos/helloworld.txt" );
        long numAs = logData.filter((FilterFunction<String>) s -> s.contains("a")).count();
        logData.filter("joao").show();

    }
}
