package com.insurance.Payments.Repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.insurance.Payments.Contractors.PaymentDao;
import com.insurance.Payments.Models.Payments;
import com.insurance.Payments.RowMappers.PaymentMapper;

@Repository
public class PaymentDaoImpl implements PaymentDao {

	String Get_Payment = "select * from Settlements";
	String Get_PaymentByStmtId = "select * from Settlements where stmt_id =?";
	String Get_PaymentByTranId = "select * from Settlements where tran_id =?";
	String Get_PaymentByClaimId = "select * from Settlements where claim_id =?";
	String Get_PaymentByDate = "select * from Settlements where  payment_Processed_date =?";
	JdbcTemplate jdbc;

	@Autowired
	public PaymentDaoImpl(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public List<Payments> getPayments() {
		return jdbc.query(Get_Payment, new PaymentMapper());
	}

	@Override
	public Payments getPaymentById(int paymentId) {
		System.out.println("--" + paymentId);
		return jdbc.queryForObject(Get_PaymentByStmtId, new Object[] { paymentId }, new PaymentMapper());
	}

	/*
	 * public Payments getPaymentByCustId(String customerId) { return jdbc.queryForObject(Get_PaymentByCustId, new
	 * Object[] { customerId }, new PaymentMapper()); }
	 * 
	 * public Payments getPaymentByDate(String paymentDate) { return jdbc.queryForObject(Get_PaymentByDate, new Object[]
	 * { paymentDate }, new PaymentMapper()); }
	 */
	@Override
	public List<Payments> filterList(String type, String value) {
		System.out.println(type + ',' + value);
		if (type.equalsIgnoreCase("tran_id ")) {
			System.out.println(value + type);
			return jdbc.query(Get_PaymentByTranId, new Object[] { value }, new PaymentMapper());
		} else if (type.equalsIgnoreCase("claim_id ")) {
			return jdbc.query(Get_PaymentByClaimId, new Object[] { Integer.parseInt(value) }, new PaymentMapper());
		} else {
			return jdbc.query(Get_PaymentByDate, new Object[] { Date.valueOf(value) }, new PaymentMapper());
		}
	}
}