package com.insurance.PaymentProcessing.Contractors;

import java.util.List;

import com.insurance.PaymentProcessing.Models.Claim;
import com.insurance.PaymentProcessing.Models.Settlements;

public interface ClaimDao {

	List<Claim> getApprovedClaims();

	Claim getClaimById(int claimId);

	void updatePayStatus(int claimId);

	void addPayment(int claimId);

	List<Settlements> getProcessedPayments();

}