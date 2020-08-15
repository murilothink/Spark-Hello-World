package murilo.spark.java;

import static spark.Spark.*;

public class SparkHello {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
