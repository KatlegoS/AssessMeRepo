package za.co.digitalplatoon.invoiceservice;

import java.util.List;

import za.co.digitalplatoon.invoiceservice.invoice.Invoice;

public interface InvoiceService {



	public void addInvoice(Invoice invoice);

	public List<Invoice> getInvoices();

	public Invoice getInvoice(Integer invoiceId);
	
}
