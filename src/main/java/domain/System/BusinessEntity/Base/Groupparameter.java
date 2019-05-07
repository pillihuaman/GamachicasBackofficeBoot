package domain.System.BusinessEntity.Base;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Groupparameter database table.
 * 
 */
@Entity
@NamedQuery(name="Groupparameter.findAll", query="SELECT g FROM Groupparameter g")
public class Groupparameter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idGroupparameter;

	private Timestamp createdate;

	@Column(name="DESCRIPTION")
	private String description;

	private Timestamp updatedate;

	public Groupparameter() {
	}

	public int getIdGroupparameter() {
		return this.idGroupparameter;
	}

	public void setIdGroupparameter(int idGroupparameter) {
		this.idGroupparameter = idGroupparameter;
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

	public Timestamp getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}

}