package domain.System.BusinessEntity.Base;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the clothing database table.
 * 
 */
@Entity
@Table(name="clothing")
@NamedQuery(name="Clothing.findAll", query="SELECT c FROM Clothing c")
public class Clothing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idclothing;

	private Timestamp createdate;

	@Column(name="DESCRIPTION")
	private String description;

	private BigDecimal idclothingline;

	private BigDecimal idcolor;

	@Column(name="NAME")
	private String name;

	@Column(name="STATUS")
	private Object status;

	private Timestamp updatedate;

	public Clothing() {
	}

	public int getIdclothing() {
		return this.idclothing;
	}

	public void setIdclothing(int idclothing) {
		this.idclothing = idclothing;
	}

	public Timestamp getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getIdclothingline() {
		return this.idclothingline;
	}

	public void setIdclothingline(BigDecimal idclothingline) {
		this.idclothingline = idclothingline;
	}

	public BigDecimal getIdcolor() {
		return this.idcolor;
	}

	public void setIdcolor(BigDecimal idcolor) {
		this.idcolor = idcolor;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getStatus() {
		return this.status;
	}

	public void setStatus(Object status) {
		this.status = status;
	}

	public Timestamp getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}

}