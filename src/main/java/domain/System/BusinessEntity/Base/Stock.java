package domain.System.BusinessEntity.Base;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the stock database table.
 * 
 */
@Entity
@Table(name="stock")
@NamedQuery(name="Stock.findAll", query="SELECT s FROM Stock s")
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idstock;

	private BigDecimal count;

	private Timestamp createdate;

	private String description;

	private BigDecimal idclothing;

	private BigDecimal idclothingline;

	private BigDecimal idcolor;

	private BigDecimal iddescription;

	private BigDecimal idusercreate;

	private BigDecimal price;

	private Object status;

	private Timestamp updatedate;

	public Stock() {
	}

	public int getIdstock() {
		return this.idstock;
	}

	public void setIdstock(int idstock) {
		this.idstock = idstock;
	}

	public BigDecimal getCount() {
		return this.count;
	}

	public void setCount(BigDecimal count) {
		this.count = count;
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

	public BigDecimal getIdusercreate() {
		return this.idusercreate;
	}

	public void setIdusercreate(BigDecimal idusercreate) {
		this.idusercreate = idusercreate;
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

	public Timestamp getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}

}