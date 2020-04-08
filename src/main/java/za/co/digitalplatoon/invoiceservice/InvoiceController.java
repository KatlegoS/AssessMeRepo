package za.co.digitalplatoon.invoiceservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.digitalplatoon.invoiceservice.invoice.Invoice;

@RestController
public class InvoiceController {
 
	@Autowired
	private InvoiceService invoiceService;
	
	 public void setInvoiceService(InvoiceService invoiceService) {
		  this.invoiceService = invoiceService;
		 }
	
	 @PostMapping("/api/employees")
	public void addInvoice(Invoice invoice){
		invoiceService.addInvoice(invoice);
	}
	@GetMapping("/api/invoices")
	public List<Invoice> viewAllInvoices(){
		
		List<Invoice> invoices = new ArrayList<Invoice>();
		invoices = invoiceService.getInvoices();
		
		return invoices;
	}
	
	@GetMapping("/api/invoices/{invoiceId}")
	public Invoice viewInvoice() {
		Invoice invoice = new Invoice();
		invoice = invoiceService.getInvoice();
		return invoice;
		
	}
	
}
