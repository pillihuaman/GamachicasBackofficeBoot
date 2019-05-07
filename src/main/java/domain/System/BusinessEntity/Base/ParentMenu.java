package domain.System.BusinessEntity.Base;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the parentMenu database table.
 * 
 */
@Entity
@Table(name="parentMenu")
@NamedQuery(name="ParentMenu.findAll", query="SELECT p FROM ParentMenu p")
public class ParentMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idparentMenu;

	private Timestamp createdate;

	private String name;

	private String path;

	private Object status;

	private Timestamp updatedate;

	public ParentMenu() {
	}

	public int getIdparentMenu() {
		return this.idparentMenu;
	}

	public void setIdparentMenu(int idparentMenu) {
		this.idparentMenu = idparentMenu;
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

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
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