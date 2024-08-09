package structural.facadePattern;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        final String tableName = "payments";

        // Without facade
        Connection mysqlConnection = MySQLHelper.getConnection();
        MySQLHelper mySQLHelper = new MySQLHelper();
        mySQLHelper.generateMySQLHTMLReport(tableName, mysqlConnection);

        Connection oracleConnection = OracleHelper.getConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, oracleConnection);

        //With facade
        String pdfSQLReport = HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.PDF, tableName);
        String pdfOracleReport = HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}
