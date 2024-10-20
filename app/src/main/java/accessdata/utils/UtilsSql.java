package accessdata.utils;

import entidad.constantes.sqlconstant.SqlConstant;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UtilsSql {

    public static String queryCreate(String table) {
        return String.format(SqlConstant.INSERT_INTO, table);
    }

    public static String queryUpdate(String table, String abbreviation) {
        return String.format(SqlConstant.UPDATE_INTO, table, abbreviation);
    }

    public static String queryDetele(String table, String abbreviation) {
        return String.format(SqlConstant.DELETE_INTO, table, abbreviation);
    }

    public static String queryFindById(String namesFields, String table, String abbreviation) {
        return String.format(SqlConstant.FIND_INTO, namesFields, table, abbreviation);
    }

    public static String queryFindAll(String namesFields, String table) {
        return String.format(SqlConstant.FIND_ALL, namesFields, table);
    }

    public static String queryFindAllJoin(String namesFields, String table, String tableJoin, String joinTable) {
        return String.format(SqlConstant.FIND_ALL_JOIN, namesFields, table, tableJoin, joinTable);
    }
}
