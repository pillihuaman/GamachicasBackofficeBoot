package domain.System.BusinessEntity.Base;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the imagen database table.
 * 
 */
@Entity
@Table(name="imagen")
@NamedQuery(name="Imagen.findAll", query="SELECT i FROM Imagen i")
public class Imagen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idimagen;

	private int countViews;

	private Timestamp createdate;

	@Column(name="DESCRIPTION")
	private String description;

	private int idclothing;

	private int idclothingline;

	private int idposition;

	private byte[] imagendata;

	private String name;

	private int positionweb;

	@Column(name="STATUS")
	private Object status;

	private Timestamp updatedate;

	private String url;

	public Imagen() {
	}

	public int getIdimagen() {
		return this.idimagen;
	}

	public void setIdimagen(int idimagen) {
		this.idimagen = idimagen;
	}

	public int getCountViews() {
		return this.countViews;
	}

	public void setCountViews(int countViews) {
		this.countViews = countViews;
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

	public int getIdclothing() {
		return this.idclothing;
	}

	public void setIdclothing(int idclothing) {
		this.idclothing = idclothing;
	}

	public int getIdclothingline() {
		return this.idclothingline;
	}

	public void setIdclothingline(int idclothingline) {
		this.idclothingline = idclothingline;
	}

	public int getIdposition() {
		return this.idposition;
	}

	public void setIdposition(int idposition) {
		this.idposition = idposition;
	}

	public byte[]  getImagendata() {
		return this.imagendata;
	}

	public void setImagendata(byte[]  imagendata) {
		this.imagendata = imagendata;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPositionweb() {
		return this.positionweb;
	}

	public void setPositionweb(int positionweb) {
		this.positionweb = positionweb;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}