package domain.System.BusinessEntity.Base;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the color database table.
 * 
 */
@Entity
@Table(name="color")
@NamedQuery(name="Color.findAll", query="SELECT c FROM Color c")
public class Color implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idcolor;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdate;

	@Column(name="DESCRIPTION")
	private String description;

	@Column(name="NAME")
	private String name;

	@Column(name="STATUS")
	private Object status;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedate;

	public Color() {
	}

	public int getIdcolor() {
		return this.idcolor;
	}

	public void setIdcolor(int idcolor) {
		this.idcolor = idcolor;
	}

	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
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

	public Date getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

}