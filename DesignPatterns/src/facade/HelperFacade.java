package facade;

import java.sql.Connection;

public class HelperFacade {
    public static String generateReport(DBTypes type, ReportTypes reportType, String tableName) {
        Connection connection;

        switch (type) {
            case MYSQL -> {
                connection = MySQLHelper.getConnection();
                MySQLHelper mySQLHelper = new MySQLHelper();
                return switch (reportType) {
                    case HTML -> mySQLHelper.generateMySQLHTMLReport(tableName, connection);
                    case PDF -> mySQLHelper.generateMySQLPDFReport(tableName, connection);
                };
            }
            case ORACLE -> {
                connection = MySQLHelper.getConnection();
                OracleHelper oracleHelper = new OracleHelper();
                return switch (reportType) {
                    case HTML -> oracleHelper.generateOracleHTMLReport(tableName, connection);
                    case PDF -> oracleHelper.generateOraclePDFReport(tableName, connection);
                };
            }
        }
        return "";
    }

    public enum DBTypes {
        MYSQL, ORACLE
    }

    public enum ReportTypes {
        HTML, PDF
    }
}
