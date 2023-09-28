package com.insurance.Payments.Contractors;

import java.util.List;

import com.insurance.Payments.Models.Payments;

public interface PaymentDao {
	List<Payments> getPayments();

	Payments getPaymentById(int paymentId);

	// Payments getPaymentByCustId(String customerId);

	// Payments getPaymentByDate(String paymentDate);

	List<Payments> filterList(String type, String value);
}