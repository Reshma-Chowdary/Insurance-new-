package com.insurance.Payments.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.insurance.Payments.Models.Payments;
import com.insurance.Payments.Repositories.PaymentDaoImpl;

@Controller
public class PaymentController {

	@Autowired
	PaymentDaoImpl pdao;

	@GetMapping("/payments")
	public String displayPayments(Model model) {
		List<Payments> payments = pdao.getPayments();
		model.addAttribute("payments", payments);
		return "index";
	}

	@GetMapping("/view")
	public String viewPayment(@RequestParam("id") String SettlementId, Model model) {
		System.out.println(Integer.parseInt(SettlementId));

		Payments payment = pdao.getPaymentById(Integer.parseInt(SettlementId));
		model.addAttribute("payment", payment);
		return "paymentDetails";
	}

	@GetMapping("/search")
	public String searchPaymentsByPaymentId(@RequestParam("filterBy") String type, @RequestParam("value") String value,
			Model model) {
		System.out.println(value + type);

		List<Payments> filteredData = pdao.filterList(type, value);
		model.addAttribute("payments", filteredData);
		return "index";
	}
}