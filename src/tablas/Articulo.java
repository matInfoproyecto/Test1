package tablas;
// Generated 18-mar-2019 21:54:18 by Hibernate Tools 4.3.5.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import utils.HibernateUtils;

import org.hibernate.Session;
/**
 * Articulo generated by hbm2java
 */
@Entity
@Table(name="Articulo")
public class Articulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idarticulo")
	private int idarticulo;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="idcategoria")
	private Categoria categoria;
	
	@Column(name="nombreArticulo")
	private String nombreArticulo;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="precioVenta")
	private Double precioVenta;
	@Column(name="precioCompra")
	private Double precioCompra;
	@Column(name="inventario")
	private int inventario;
	private Set supplierInvoiceLineItemses = new HashSet(0);
	private Set customerLineItemses = new HashSet(0);

	public Articulo() {
	}
	
	public Articulo(int idarticulo) {
		this.idarticulo=idarticulo;
	}
	
	public Articulo(Categoria categoria, String nombreArticulo, Double precioCompra) {
		super();
		this.categoria = categoria;
		this.nombreArticulo = nombreArticulo;
		this.precioCompra = precioCompra;
	}

	public Articulo(Categoria categoria, String nombreArticulo, String descripcion, Double precioVenta,
			Double precioCompra, int inventario) {
		super();
		this.categoria = categoria;
		this.nombreArticulo = nombreArticulo;
		this.descripcion = descripcion;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
		this.inventario = inventario;
	}
	public Articulo(Categoria categoria, String nombreArticulo, String descripcion, Double precioVenta,
			Double precioCompra, int inventario,int idarticulo) {
		super();
		this.categoria = categoria;
		this.nombreArticulo = nombreArticulo;
		this.descripcion = descripcion;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
		this.inventario = inventario;
		this.idarticulo=idarticulo;
	}

	public int getIdarticulo() {
		return this.idarticulo;
	}

	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getInventario() {
		return inventario;
	}

	public void setInventario(int inventario) {
		this.inventario = inventario;
	}

	public Set getSupplierInvoiceLineItemses() {
		return supplierInvoiceLineItemses;
	}

	public void setSupplierInvoiceLineItemses(Set supplierInvoiceLineItemses) {
		this.supplierInvoiceLineItemses = supplierInvoiceLineItemses;
	}

	public Set getCustomerLineItemses() {
		return customerLineItemses;
	}

	public void setCustomerLineItemses(Set customerLineItemses) {
		this.customerLineItemses = customerLineItemses;
	}
	@Transactional
    public void write(List<Categoria> modelObjectList) throws Exception{
		Session session =HibernateUtils.getSessionFactory().openSession();
            for(Categoria t : modelObjectList){
                session.save(t);
            }
        }

	public int getIdarticulo(int ip) {
		// TODO Auto-generated method stub
		return 0;
	}
}
