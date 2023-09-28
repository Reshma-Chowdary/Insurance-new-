package com.insurance.PaymentProcessing.Models;
//
// import java.sql.Date;
//
// public class Claims {
// int clam_id;
// String clam_source;
// String clam_type;
// Date clam_date;
// Double clam_amount_requested;
// int clam_iplc_id;
// Double clam_processed_amount;
// Date clam_processed_Date;
// int clam_processed_by;
// String clam_remarks;
// String clam_status;
// String pay_status;
//
// public Claims() {
// }
//
// public int getClam_id() {
// return clam_id;
// }
//
// public void setClam_id(int clam_id) {
// this.clam_id = clam_id;
// }
//
// public String getClam_source() {
// return clam_source;
// }
//
// public void setClam_source(String clam_source) {
// this.clam_source = clam_source;
// }
//
// public String getClam_type() {
// return clam_type;
// }
//
// public void setClam_type(String clam_type) {
// this.clam_type = clam_type;
// }
//
// public Date getClam_date() {
// return clam_date;
// }
//
// public void setClam_date(Date clam_date) {
// this.clam_date = clam_date;
// }
//
// public Double getClam_amount_requested() {
// return clam_amount_requested;
// }
//
// public void setClam_amount_requested(Double clam_amount_requested) {
// this.clam_amount_requested = clam_amount_requested;
// }
//
// public int getClam_iplc_id() {
// return clam_iplc_id;
// }
//
// public void setClam_iplc_id(int clam_iplc_id) {
// this.clam_iplc_id = clam_iplc_id;
// }
//
// public Double getClam_processed_amount() {
// return clam_processed_amount;
// }
//
// public void setClam_processed_amount(Double clam_processed_amount) {
// this.clam_processed_amount = clam_processed_amount;
// }
//
// public Date getClam_processed_Date() {
// return clam_processed_Date;
// }
//
// public void setClam_processed_Date(Date clam_processed_Date) {
// this.clam_processed_Date = clam_processed_Date;
// }
//
// public int getClam_processed_by() {
// return clam_processed_by;
// }
//
// public void setClam_processed_by(int clam_processed_by) {
// this.clam_processed_by = clam_processed_by;
// }
//
// public String getClam_remarks() {
// return clam_remarks;
// }
//
// public void setClam_remarks(String clam_remarks) {
// this.clam_remarks = clam_remarks;
// }
//
// public String getClam_status() {
// return clam_status;
// }
//
// public void setClam_status(String clam_status) {
// this.clam_status = clam_status;
// }
//
// public String getPay_status() {
// return pay_status;
// }
//
// public void setPay_status(String pay_status) {
// this.pay_status = pay_status;
// }
//
// }

import java.sql.Date;

public class Claim {
	private int clamId;
	private String clamSource;
	private String clamType;
	private Date clamDate;
	private double clamAmountRequested;
	private int clamIplcId;
	private double clamProcessedAmount;
	private Date clamProcessedDate;
	private int clamProcessedBy;
	private String clamRemarks;
	private String clamStatus;
	private String payStatus;
	private String hospName;

	public int getClamId() {
		return clamId;
	}

	public void setClamId(int clamId) {
		this.clamId = clamId;
	}

	public String getClamSource() {
		return clamSource;
	}

	public void setClamSource(String clamSource) {
		this.clamSource = clamSource;
	}

	public String getClamType() {
		return clamType;
	}

	public void setClamType(String clamType) {
		this.clamType = clamType;
	}

	public Date getClamDate() {
		return clamDate;
	}

	public void setClamDate(Date clamDate) {
		this.clamDate = clamDate;
	}

	public double getClamAmountRequested() {
		return clamAmountRequested;
	}

	public void setClamAmountRequested(double clamAmountRequested) {
		this.clamAmountRequested = clamAmountRequested;
	}

	public int getClamIplcId() {
		return clamIplcId;
	}

	public void setClamIplcId(int clamIplcId) {
		this.clamIplcId = clamIplcId;
	}

	public double getClamProcessedAmount() {
		return clamProcessedAmount;
	}

	public void setClamProcessedAmount(double clamProcessedAmount) {
		this.clamProcessedAmount = clamProcessedAmount;
	}

	public Date getClamProcessedDate() {
		return clamProcessedDate;
	}

	public void setClamProcessedDate(Date clamProcessedDate) {
		this.clamProcessedDate = clamProcessedDate;
	}

	public int getClamProcessedBy() {
		return clamProcessedBy;
	}

	public void setClamProcessedBy(int clamProcessedBy) {
		this.clamProcessedBy = clamProcessedBy;
	}

	public String getClamRemarks() {
		return clamRemarks;
	}

	public void setClamRemarks(String clamRemarks) {
		this.clamRemarks = clamRemarks;
	}

	public String getClamStatus() {
		return clamStatus;
	}

	public void setClamStatus(String clamStatus) {
		this.clamStatus = clamStatus;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getHospName() {
		return hospName;
	}

	public void setHospName(String hospName) {
		this.hospName = hospName;
	}

	public Claim() {
		super();
	}

	@Override
	public String toString() {
		return "Claim [clamId=" + clamId + ", clamSource=" + clamSource + ", clamType=" + clamType + ", clamDate="
				+ clamDate + ", clamAmountRequested=" + clamAmountRequested + ", clamIplcId=" + clamIplcId
				+ ", clamProcessedAmount=" + clamProcessedAmount + ", clamProcessedDate=" + clamProcessedDate
				+ ", clamProcessedBy=" + clamProcessedBy + ", clamRemarks=" + clamRemarks + ", clamStatus=" + clamStatus
				+ ", payStatus=" + payStatus + ", hospName=" + hospName + "]";
	}

}