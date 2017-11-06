package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the bbs_ad database table.
 * 
 */
@Entity
@Table(name="bbs_ad")
@NamedQuery(name="BbsAd.findAll", query="SELECT b FROM BbsAd b")
public class BbsAd implements Serializable {
	private String test;
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private int height;

	private String picture;

	@Column(name="position_id")
	private BigInteger positionId;

	private String title;

	private String url;

	private int width;

	public BbsAd() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public BigInteger getPositionId() {
		return this.positionId;
	}

	public void setPositionId(BigInteger positionId) {
		this.positionId = positionId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
