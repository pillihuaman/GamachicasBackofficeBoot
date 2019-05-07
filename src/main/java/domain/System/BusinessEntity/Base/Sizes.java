/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.System.BusinessEntity.Base;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zarmir
 */
@Entity
@Table(name = "SIZES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sizes.findAll", query = "SELECT s FROM Sizes s"),
    @NamedQuery(name = "Sizes.findByIdsize", query = "SELECT s FROM Sizes s WHERE s.idsize = :idsize"),
    @NamedQuery(name = "Sizes.findByCode", query = "SELECT s FROM Sizes s WHERE s.code = :code"),
    @NamedQuery(name = "Sizes.findByName", query = "SELECT s FROM Sizes s WHERE s.name = :name"),
    @NamedQuery(name = "Sizes.findByStatus", query = "SELECT s FROM Sizes s WHERE s.status = :status")})
public class Sizes implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSIZE")
    private BigDecimal idsize;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "CODE")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STATUS")
    private short status;

    public Sizes() {
    }

    public Sizes(BigDecimal idsize) {
        this.idsize = idsize;
    }

    public Sizes(BigDecimal idsize, String code, String name, short status) {
        this.idsize = idsize;
        this.code = code;
        this.name = name;
        this.status = status;
    }

    public BigDecimal getIdsize() {
        return idsize;
    }

    public void setIdsize(BigDecimal idsize) {
        this.idsize = idsize;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsize != null ? idsize.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sizes)) {
            return false;
        }
        Sizes other = (Sizes) object;
        if ((this.idsize == null && other.idsize != null) || (this.idsize != null && !this.idsize.equals(other.idsize))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domain.System.BusinessEntity.Base.Sizes[ idsize=" + idsize + " ]";
    }
    
}
