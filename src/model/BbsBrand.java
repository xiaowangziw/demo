package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bbs_brand database table.
 * 
 */
@Entity
@Table(name="bbs_brand")
@NamedQuery(name="BbsBrand.findAll", query="SELECT b FROM BbsBrand b")
public class BbsBrand implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String description;

	@Column(name="img_url")
	private String imgUrl;

	@Column(name="is_display")
	private byte isDisplay;

	private String name;

	private int sort;

	@Column(name="web_site")
	private String webSite;

	public BbsBrand() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public byte getIsDisplay() {
		return this.isDisplay;
	}

	public void setIsDisplay(byte isDisplay) {
		this.isDisplay = isDisplay;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getWebSite() {
		return this.webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

}