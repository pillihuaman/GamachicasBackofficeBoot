package domain.System.BusinessEntity.Base;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the Detailtemptpay database table.
 * 
 */
@Entity
@NamedQuery(name="Detailtemptpay.findAll", query="SELECT d FROM Detailtemptpay d")
public class Detailtemptpay implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDetailtemptpay;

	private Timestamp createdate;

	private String description;

	private BigDecimal idclothing;

	private BigDecimal idclothingline;

	private BigDecimal idcolor;

	private BigDecimal iddescription;

	private BigDecimal idstatus;

	private BigDecimal idusercreate;

	private BigDecimal idvaucher;

	private BigDecimal price;

	private Object status;

	private BigDecimal totalitem;

	private BigDecimal totalprice;

	private Timestamp updatedate;

	public Detailtemptpay() {
	}

	public int getIdDetailtemptpay() {
		return this.idDetailtemptpay;
	}

	public void setIdDetailtemptpay(int idDetailtemptpay) {
		this.idDetailtemptpay = idDetailtemptpay;
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

	public BigDecimal getIdclothing() {
		return this.idclothing;
	}

	public void setIdclothing(BigDecimal idclothing) {
		this.idclothing = idclothing;
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

	public BigDecimal getIddescription() {
		return this.iddescription;
	}

	public void setIddescription(BigDecimal iddescription) {
		this.iddescription = iddescription;
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

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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