package tablas;

// Generated 10-mar-2019 11:47:42 by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idusuario")
	private static int idusuario;
	
	@Column(name="usuario")
	private String usuario;
	@Column(name="password")
	private String password;
	@Column(name="nombre")
	private String nombre;	
	// relation inverse Categorie (one) -> Article (many) de la relation Article (many) -> Categorie (one).
	// cascade insertion Categorie -> insertion Articles21.
	// cascade maj Categorie -> maj Articles22.
	// cascade suppression Categorie -> suppression Articles
	@OneToMany(mappedBy = "idusuario", cascade = { CascadeType.ALL })
	private Set<Sociedad> sociedades = new HashSet<Sociedad>();
	
	@OneToMany(mappedBy = "idusuario", cascade = { CascadeType.ALL })
	private Set<Proveedor> proveedors = new HashSet<Proveedor>();
	
	@OneToMany(mappedBy = "idusuario", cascade = { CascadeType.ALL })
	private Set<Cliente> clientes = new HashSet<Cliente>();
	
	public Set<Sociedad> getSociedades() {
		return sociedades;
	}

	public void setSociedades(Set<Sociedad> sociedades) {
		this.sociedades = sociedades;
	}


	 
	@Override
	public String toString() {
		return "Usuario [id=" + idusuario + ", usuario=" + usuario + ", password="
				+ password + ", nombre=" + nombre + ", proveedors="
				+ proveedors + ", clientes=" + clientes + "]";
	}

	public Usuario() {}

	public Usuario(String usuario, String password, String nombre) {
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
	}

	public Usuario(String usuario, String password, String nombre,
			 Set proveedors, Set clientes) {
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.proveedors = proveedors;
		this.clientes = clientes;
	}

	public Usuario(String usuario) {
		super();
		this.usuario = usuario;
	}

	public static int getId() {
		return idusuario;
	}

	public void setId(int idusuario) {
		Usuario.idusuario = idusuario;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		Usuario.idusuario = idusuario;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getProveedors() {
		return this.proveedors;
	}

	public void setProveedors(Set proveedors) {
		this.proveedors = proveedors;
	}

	public Set getClientes() {
		return this.clientes;
	}

	public void setClientes(Set clientes) {
		this.clientes = clientes;
	}

}
