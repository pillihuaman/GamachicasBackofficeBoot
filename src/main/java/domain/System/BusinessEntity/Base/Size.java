package domain.System.BusinessEntity.Base;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sizes database table.
 * 
 */
@Entity
@Table(name="sizes")
@NamedQuery(name="Size.findAll", query="SELECT s FROM Size s")
public class Size implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idsize;

	@Column(name="CODE")
	private String code;

	@Column(name="NAME")
	private String name;

	@Column(name="STATUS")
	private BigDecimal status;

	public Size() {
	}

	public int getIdsize() {
		return this.idsize;
	}

	public void setIdsize(int idsize) {
		this.idsize = idsize;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

}