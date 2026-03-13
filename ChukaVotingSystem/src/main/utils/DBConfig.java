package main.utils;//package carrying DBconfigurations creditials
// This class contains the database configuration details such as host, port, database name, username, and password. It also constructs the JDBC URL for connecting to the MySQL database.
public class DBConfig {
    public static final String HOST     = "localhost";// Updated host
    public static final String PORT     = "3306";// Updated port number
    public static final String DATABASE = "chuka_voting_db";// Updated database name
    public static final String USERNAME = "root";// Updated username
    public static final String PASSWORD = "Monkey"; // Updated password

    public static final String URL =
            "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE +
                    "?useSSL=false&serverTimezone=Africa/Nairobi&allowPublicKeyRetrieval=true";
}
