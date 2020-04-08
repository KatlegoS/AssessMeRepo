package za.co.digitalplatoon.invoiceservice.implementation;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import za.co.digitalplatoon.invoiceservice.InvoiceService;
import za.co.digitalplatoon.invoiceservice.invoice.Invoice;
import za.co.digitalplatoon.repository.InvoiceRepository;

public class InvoiceServiceImpl implements InvoiceService{

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	
	@Override
	public void addInvoice(Invoice invoice) {
		invoiceRepository.save(invoice);		
	}

	@Override
	public List<Invoice> getInvoices() {

		List<Invoice> invoices = invoiceRepository.getInvoices();
		return invoices;
	}

	@Override
	public Invoice getInvoice(Integer invoiceId) {
		
		Invoice invoice = invoiceRepository.getInvoice(invoiceId);
		
		return invoice;
	}

	

}
