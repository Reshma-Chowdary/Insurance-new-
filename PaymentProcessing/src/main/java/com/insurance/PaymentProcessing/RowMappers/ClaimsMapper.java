package com.insurance.PaymentProcessing.RowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.insurance.PaymentProcessing.Models.Claim;

public class ClaimsMapper implements RowMapper<Claim> {

	@Override
	public Claim mapRow(ResultSet rs, int rowNum) throws SQLException {
		Claim claim = new Claim();
		claim.setClamId(rs.getInt(1));
		claim.setClamSource(rs.getString(2));
		claim.setClamType(rs.getString(3));
		claim.setClamDate(rs.getDate(4));
		claim.setClamAmountRequested(rs.getDouble(5));
		claim.setClamIplcId(rs.getInt(6));
		claim.setClamProcessedAmount(rs.getDouble(7));
		claim.setClamProcessedDate(rs.getDate(8));
		claim.setClamProcessedBy(rs.getInt(9));
		claim.setClamRemarks(rs.getString(10));
		claim.setClamStatus(rs.getString(11));
		claim.setPayStatus(rs.getString(12));
		claim.setHospName(rs.getString(13));
		return claim;
	}

}
