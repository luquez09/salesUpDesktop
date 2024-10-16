package accessdata.inventario;

import accessdata.utils.UtilsSql;
import accessdata.utils.UtilsValidateCodeError;
import entidad.constantes.ConstantLogger;
import entidad.constantes.Constants;
import entidad.constantes.sqlconstant.SqlConstant;
import entidad.entitys.inventario.Supplier;
import lombok.extern.log4j.Log4j2;
import accessdata.configurations.ConfigurationDb;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class AccessSupplier {

    private final String[] NAME_FIELDS = {"idsupplier", "name_supplier", "name_social", "direccion", "phonenumber1",
                                          "phonenumber2", "description"};
    String result = "Error: ";
    String abbreviation = "sup";

    public String callSaveSupplier(Supplier supplier) throws ParseException {
        try (Connection conn = ConfigurationDb.getConnection();
             PreparedStatement stmt = conn.prepareStatement(UtilsSql.queryCreate(SqlConstant.SUPPLIER)
                 + NAME_FIELDS[1].concat(Constants.COMMA)
                 + NAME_FIELDS[2].concat(Constants.COMMA)
                 + NAME_FIELDS[3].concat(Constants.COMMA)
                 + NAME_FIELDS[4].concat(Constants.COMMA)
                 + NAME_FIELDS[5].concat(Constants.COMMA)
                 + NAME_FIELDS[6]
                 + ") VALUES (?, ?, ?, ?, ?, ?)")) {

            stmt.setString(1, supplier.getName());
            stmt.setString(2, supplier.getName_social());
            stmt.setString(3, supplier.getDireccion());
            stmt.setString(4, supplier.getPhoneNumber1());
            stmt.setString(5, supplier.getPhoneNumber2());
            stmt.setString(6, supplier.getDescription());
            int response = stmt.executeUpdate();
            if (response > Constants.ZERO) {
                log.info(ConstantLogger.LOG_SUCCESS_QUERY_INSERT);
                result = SqlConstant.SUCCESS_PROCESS;
            } else {
                log.error(ConstantLogger.LOG_ERROR_QUERY_INSERT);
                result = SqlConstant.ERROR_PROCESS;
            }
            stmt.close();
            ConfigurationDb.closeConnection();
        } catch (SQLException e) {
            log.error(ConstantLogger.LOG_ERROR_EXECUTE_SQL, e.getMessage());
            log.error(ConstantLogger.LOG_ERROR_STATE_SQL, e.getSQLState());

            result = result.concat(UtilsValidateCodeError.validateMessageError(e.getSQLState()));
            result = result.concat(e.getMessage());
        }
        return result;
    }

    public String callUpdateSupplier(Supplier supplier) {
        try (Connection conn = ConfigurationDb.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                 UtilsSql.queryUpdate(SqlConstant.SUPPLIER, abbreviation)
                     + NAME_FIELDS[1].concat(SqlConstant.VALUE).concat(Constants.COMMA)
                     + NAME_FIELDS[2].concat(SqlConstant.VALUE).concat(Constants.COMMA)
                     + NAME_FIELDS[3].concat(SqlConstant.VALUE).concat(Constants.COMMA)
                     + NAME_FIELDS[4].concat(SqlConstant.VALUE).concat(Constants.COMMA)
                     + NAME_FIELDS[5].concat(SqlConstant.VALUE).concat(Constants.COMMA)
                     + NAME_FIELDS[6].concat(SqlConstant.VALUE)
                     + String.format(SqlConstant.WHERE, abbreviation,
                         NAME_FIELDS[0], SqlConstant.VALUE))) {

            stmt.setString(1, supplier.getName());
            stmt.setString(2, supplier.getName_social());
            stmt.setString(3, supplier.getDireccion());
            stmt.setString(4, supplier.getPhoneNumber1());
            stmt.setString(5, supplier.getPhoneNumber2());
            stmt.setString(6, supplier.getDescription());
            stmt.setInt(7, supplier.getIdSupplier());

            if (stmt.executeUpdate() > Constants.ZERO) {
                log.info(ConstantLogger.LOG_SUCCESS_QUERY_UPDATE, supplier.toString());
                result = SqlConstant.SUCCESS_UPDATE;
            } else {
                log.info(ConstantLogger.LOG_ERROR_QUERY_UPDATE, supplier.toString());
                result = SqlConstant.ERROR_UPDATE;
            }
        } catch (SQLException e) {
            log.error(ConstantLogger.LOG_ERROR_EXECUTE_SQL, e.getMessage());
            log.error(ConstantLogger.LOG_ERROR_STATE_SQL, e.getSQLState());

            result = result.concat(UtilsValidateCodeError.validateMessageError(e.getSQLState()));
            result = result.concat(e.getMessage());
        }
        return result;
    }


    public String callDeleteSupplier(Supplier category) {
        try (Connection conn = ConfigurationDb.getConnection();
             PreparedStatement stmt = conn.prepareStatement(UtilsSql.queryDetele(SqlConstant.SUPPLIER, abbreviation)
                 + String.format(SqlConstant.WHERE, abbreviation, NAME_FIELDS[0], SqlConstant.VALUE))) {

            stmt.setInt(1, category.getIdSupplier());

            if (stmt.executeUpdate() > Constants.ZERO) {
                log.info(ConstantLogger.LOG_SUCCESS_QUERY_DELETE, SqlConstant.SUPPLIER);
                result = SqlConstant.SUCCESS_DELETE;
            } else {
                log.info(ConstantLogger.LOG_ERROR_QUERY_DELETE, SqlConstant.SUPPLIER);
                result = SqlConstant.ERROR_DELETE;
            }
            stmt.close();
            ConfigurationDb.closeConnection();

        } catch (SQLException e) {
            log.error(ConstantLogger.LOG_ERROR_EXECUTE_SQL, e.getMessage());
            log.error(ConstantLogger.LOG_ERROR_STATE_SQL, e.getSQLState());

            result = result.concat(UtilsValidateCodeError.validateMessageError(e.getSQLState()));
            result = result.concat(e.getMessage());
        }

        return result;
    }

    public List<Supplier> callFindAllSupplier() throws ParseException {
        List<Supplier> supplierList = new ArrayList<>();
        String namesFields = String.join(Constants.COMMA, NAME_FIELDS);

        try (Connection conn = ConfigurationDb.getConnection();
             PreparedStatement stmt = conn.prepareStatement(UtilsSql.queryFindAll(namesFields, SqlConstant.SUPPLIER))) {

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Supplier categoryFind = Supplier.builder()
                        .idSupplier(rs.getInt(1))
                        .name(rs.getString(2))
                        .name_social(rs.getString(3))
                        .direccion(rs.getString(4))
                        .phoneNumber1(rs.getString(5))
                        .phoneNumber2(rs.getString(6))
                        .description(rs.getString(7))
                        .build();
                supplierList.add(categoryFind);
            }
            stmt.close();
            rs.close();
            ConfigurationDb.closeConnection();
        } catch (SQLException e) {
            log.error(ConstantLogger.LOG_ERROR_EXECUTE_SQL, e.getMessage());
            log.error(ConstantLogger.LOG_ERROR_STATE_SQL, e.getSQLState());

            result = result.concat(UtilsValidateCodeError.validateMessageError(e.getSQLState()));
            result = result.concat(e.getMessage());
            JOptionPane.showMessageDialog(null, result);
        }
        return supplierList;
    }
}
