package tablas;

// Generated 10-mar-2019 11:47:42 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CustomerInvoices generated by hbm2java
 */
public class CustomerInvoices implements java.io.Serializable {

	private Integer idfacturaCliente;
	private Cliente cliente;
	private Date fecha;
	private Set customerLineItemses = new HashSet(0);

	public CustomerInvoices() {
	}

	public CustomerInvoices(Cliente cliente) {
		this.cliente = cliente;
	}

	public CustomerInvoices(Cliente cliente, Date fecha, Set customerLineItemses) {
		this.cliente = cliente;
		this.fecha = fecha;
		this.customerLineItemses = customerLineItemses;
	}

	public Integer getIdfacturaCliente() {
		return this.idfacturaCliente;
	}

	public void setIdfacturaCliente(Integer idfacturaCliente) {
		this.idfacturaCliente = idfacturaCliente;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Set getCustomerLineItemses() {
		return this.customerLineItemses;
	}

	public void setCustomerLineItemses(Set customerLineItemses) {
		this.customerLineItemses = customerLineItemses;
	}

}
