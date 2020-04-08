package za.co.digitalplatoon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.digitalplatoon.invoiceservice.invoice.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

	public void save(Invoice invoice);

	public Invoice getInvoice(Integer invoiceId);

	public List<Invoice> getInvoices();

}
