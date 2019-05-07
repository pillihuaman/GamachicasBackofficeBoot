package domain.System.BusinessEntity.Base;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the clothingline database table.
 * 
 */
@Entity
@Table(name="clothingline")
@NamedQuery(name="Clothingline.findAll", query="SELECT c FROM Clothingline c")
public class Clothingline implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idclothingline;

	private Timestamp createdate;

	@Column(name="DESCRIPTION")
	private String description;

	@Column(name="NAME")
	private String name;

	@Column(name="STATUS")
	private Object status;

	private Timestamp updatedate;

	public Clothingline() {
	}

	public int getIdclothingline() {
		return this.idclothingline;
	}

	public void setIdclothingline(int idclothingline) {
		this.idclothingline = idclothingline;
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