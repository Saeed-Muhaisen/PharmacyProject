package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("prescription")
public class PrescriptionDao {
    @Autowired
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Prescription> prescriptionRawMapper = (resultSet, i) -> new Prescription()
            .PerscriptionId(resultSet.getInt("prescriptionId"))
            .drugListId(resultSet.getInt("DrugListID"))
            .doctorID(resultSet.getInt("DoctorID"))
            .patientId(resultSet.getInt("PatientID"))
            .PatientName(resultSet.getString("PatientName"))
            .Note(resultSet.getString("Notes"));


    public PrescriptionDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public int insertPerscription(int doctorID, int patientId,String PatientName,String note) {
        String sql = "INSERT INTO prescription (doctorid,patientID, patientname,notes) values (?,?,?,?) returning prescriptionid";
        return jdbcTemplate.queryForObject(sql, new Object[]{doctorID,patientId,PatientName,note},Integer.class);

    }

    public int updatePerscription(int PrescriptionId,int druglistId,int doctorID, int patientId,String PatientName,String Note) {
        String sql = "UPDATE prescription " +
                "SET druglistid=?,doctorid=?,patientid=?,patientname=?,notes=? where PrescriptionId=?";

        return jdbcTemplate.update(sql, new Object[]{druglistId,doctorID,patientId,PatientName,Note,PrescriptionId});
    }


    public int deletePerscriptionbyId(Integer PerscriptionId) {
        String sql = "DELETE FROM prescription WHERE prescriptionid=?;";
        try {
            jdbcTemplate.update(sql, PerscriptionId);
        } catch (Exception e) {
            return 0;
        }
        return 1;
    }


    public Prescription findPerscriptionById(Integer prescriptionId) {
        String sql = "SELECT * FROM prescription WHERE prescriptionid=?";
        Prescription prescription;

        prescription = jdbcTemplate.queryForObject(sql, new Object[]{prescriptionId}, prescriptionRawMapper);

        return prescription;
    }

    public List<Prescription> PrescriptionList() {
        return jdbcTemplate.query("SELECT * FROM prescription", prescriptionRawMapper);
    }

    public int sumOfPrescriptionByPatientID(int patientId, int doctorId) {
        int sum= jdbcTemplate.queryForObject("select count(*) from prescription where patientid=? and doctorid=?",new Object[]{patientId, doctorId},Integer.class);
        return sum;
    }

    public Prescription findPerscriptionByPatientIdAndDoctorID(int PatientId,int DoctorId) {
        String sql = "SELECT * FROM prescription WHERE patientid=? and doctorid=?";
        Prescription prescription;

        prescription = jdbcTemplate.queryForObject(sql, new Object[]{PatientId, DoctorId}, prescriptionRawMapper);

        return prescription;
    }

    public List<Prescription> findPerscriptionByPatientIdAndName(int patientId,String name) {
        String sql = "SELECT * FROM prescription WHERE patientid=? and patientname=?";
        List<Prescription> prescription;

        prescription = jdbcTemplate.query(sql, new Object[]{patientId,name}, prescriptionRawMapper);

        return prescription;
    }
}
