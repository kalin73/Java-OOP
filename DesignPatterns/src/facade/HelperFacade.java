package facade;

import java.sql.Connection;

public class HelperFacade {
    public static void generateReport(DBTypes type, ReportTypes reportType, String tableName) {
        Connection connection = null;

        switch (type) {
            case MYSQL -> {
                connection = MySQLHelper.getConnection();
                MySQLHelper mySQLHelper = new MySQLHelper();
                switch (reportType) {
                    case HTML -> mySQLHelper.generateMySQLHTMLReport(tableName, connection);
                    case PDF -> mySQLHelper.generateMySQLPDFReport(tableName, connection);
                }
            }
            case ORACLE -> {
                connection = MySQLHelper.getConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML -> oracleHelper.generateOracleHTMLReport(tableName, connection);
                    case PDF -> oracleHelper.generateOraclePDFReport(tableName, connection);
                }
            }
        }

    }

    public enum DBTypes {
        MYSQL, ORACLE
    }

    public enum ReportTypes {
        HTML, PDF
    }
}
