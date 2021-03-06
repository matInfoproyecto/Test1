package tablas;

// Generated 10-mar-2019 11:47:42 by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Proveedor generated by hbm2java
 */
@Entity
@Table(name="proveedor")
public class Proveedor  extends Sociedad  implements Serializable{
	private static final long serialVersionUID = 1L;
	/*
	@Id
	@Column(name="idproveedor")
	private Integer idproveedor;
	@ManyToOne
	@JoinColumn (name="id")
	private Usuarios usuarios;
	@Column(name="denominacionSocial")
	private String denominacionSocial;
	@Column(name="direccion")
	private String direccion;
	@Column(name="codigoPostal")
	private Integer codigoPostal;
	@Column(name="telefono")
	private Integer telefono;
	@Column(name="email")
	private String email;
	@Column(name="ciudad")
	private String ciudad;
	@Column(name="provincia")
	private String provincia;
	@Column(name="createdDate")
	private Date createdDate;
	//a faire
	private Set supplierInvoiceses = new HashSet(0);
*/
	public Proveedor() {
	}
	public Proveedor(int id){
		super(id);
	
	}
	public Proveedor(String denominacion, String domicilio, String email,
			String poblacion, String provincia, int codigoPostal,int id,
			int telefono,Usuario usuarios) {
		super(denominacion,domicilio,email,poblacion,provincia,codigoPostal,id,usuarios,telefono);
	}
	public Proveedor(String denominacion, String domicilio, String email,
			String poblacion, String provincia, int codigoPostal,int id,
			int telefono) {
		super(denominacion,domicilio,email,poblacion,provincia,codigoPostal,id,telefono);
	}
	
	
	
	/*
	public Proveedor(Usuarios usuarios, String denominacionSocial,
			String direccion) {
		this.usuarios = usuarios;
		this.denominacionSocial = denominacionSocial;
		this.direccion = direccion;
	}

	public Proveedor(Usuarios usuarios, String denominacionSocial,
			String direccion, Integer codigoPostal, Integer telefono,
			String email, String ciudad, String provincia, Date createdDate,
			Set supplierInvoiceses) {
		this.usuarios = usuarios;
		this.denominacionSocial = denominacionSocial;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
		this.email = email;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.createdDate = createdDate;
		this.supplierInvoiceses = supplierInvoiceses;
	}

	public Integer getIdproveedor() {
		return this.idproveedor;
	}

	public void setIdproveedor(Integer idproveedor) {
		this.idproveedor = idproveedor;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public String getDenominacionSocial() {
		return this.denominacionSocial;
	}

	public void setDenominacionSocial(String denominacionSocial) {
		this.denominacionSocial = denominacionSocial;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Integer getTelefono() {
		return this.telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Set getSupplierInvoiceses() {
		return this.supplierInvoiceses;
	}

	public void setSupplierInvoiceses(Set supplierInvoiceses) {
		this.supplierInvoiceses = supplierInvoiceses;
	}
*/
}
