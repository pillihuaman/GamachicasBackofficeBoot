package domain.System.BusinessEntity.Base;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the temptpayheader database table.
 * 
 */
@Entity
@Table(name="temptpayheader")
@NamedQuery(name="Temptpayheader.findAll", query="SELECT t FROM Temptpayheader t")
public class Temptpayheader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idtemptpayheader;

	private Timestamp createdate;

	private String description;

	private BigDecimal idstatus;

	private BigDecimal idusercreate;

	private BigDecimal idvaucher;

	private Object status;

	private BigDecimal totalitem;

	private BigDecimal totalprice;

	private Timestamp updatedate;

	public Temptpayheader() {
	}

	public int getIdtemptpayheader() {
		return this.idtemptpayheader;
	}

	public void setIdtemptpayheader(int idtemptpayheader) {
		this.idtemptpayheader = idtemptpayheader;
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

	public BigDecimal getIdstatus() {
		return this.idstatus;
	}

	public void setIdstatus(BigDecimal idstatus) {
		this.idstatus = idstatus;
	}

	public BigDecimal getIdusercreate() {
		return this.idusercreate;
	}

	public void setIdusercreate(BigDecimal idusercreate) {
		this.idusercreate = idusercreate;
	}

	public BigDecimal getIdvaucher() {
		return this.idvaucher;
	}

	public void setIdvaucher(BigDecimal idvaucher) {
		this.idvaucher = idvaucher;
	}

	public Object getStatus() {
		return this.status;
	}

	public void setStatus(Object status) {
		this.status = status;
	}

	public BigDecimal getTotalitem() {
		return this.totalitem;
	}

	public void setTotalitem(BigDecimal totalitem) {
		this.totalitem = totalitem;
	}

	public BigDecimal getTotalprice() {
		return this.totalprice;
	}

	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}

	public Timestamp getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}

}