package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the bbs_buyer database table.
 * 
 */
@Entity
@Table(name="bbs_buyer")
@NamedQuery(name="BbsBuyer.findAll", query="SELECT b FROM BbsBuyer b")
public class BbsBuyer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String addr;

	private String city;

	private String email;

	private int gender;

	@Column(name="is_del")
	private byte isDel;

	private String password;

	private String province;

	@Column(name="real_name")
	private String realName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="register_time")
	private Date registerTime;

	private String town;

	private String username;

	public BbsBuyer() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGender() {
		return this.gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public byte getIsDel() {
		return this.isDel;
	}

	public void setIsDel(byte isDel) {
		this.isDel = isDel;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}