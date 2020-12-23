package br.com.rafaj2ee.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="birthday")
public class Birthday {

	private long id;
	private String nome;
	private Date data;
	private String mail;	
	private Date dataEnviado;

	@Column(name="sent_date", nullable=true)	
	@Temporal(TemporalType.TIMESTAMP)  
	public Date getDataEnviado() {
		return dataEnviado;
	}
	public void setDataEnviado(Date dataEnviado) {
		this.dataEnviado = dataEnviado;
	}
	@Id
	@GeneratedValue
	@Column(name="birthday_id")
	public long getId() {
		return id;
	}
	@Column(name="mail", nullable=false, length=150)
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="name", nullable=false, length=150)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column(name="birthday_date", nullable=false)	
	@Temporal(TemporalType.TIMESTAMP)  
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int hashCode() {
        return (int) this.id;
    }	
	
	
}
