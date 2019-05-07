package domain.System.BusinessEntity.Base;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the parameter database table.
 * 
 */
@Entity
@Table(name="parameter")
@NamedQuery(name="Parameter.findAll", query="SELECT p FROM Parameter p")
public class Parameter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idparameter;

	private Timestamp createdate;

	@Column(name="NAME")
	private String name;

	@Column(name="STATUS")
	private Object status;

	private Timestamp updatedate;

	public Parameter() {
	}

	public int getIdparameter() {
		return this.idparameter;
	}

	public void setIdparameter(int idparameter) {
		this.idparameter = idparameter;
	}

	public Timestamp getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
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