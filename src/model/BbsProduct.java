package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;


/**
 * The persistent class for the bbs_product database table.
 * 
 */
@Entity
@Table(name="bbs_product")
@NamedQuery(name="BbsProduct.findAll", query="SELECT b FROM BbsProduct b")
public class BbsProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="brand_id")
	private BigInteger brandId;

	private String colors;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Lob
	private String description;

	@Lob
	@Column(name="img_url")
	private String imgUrl;

	@Column(name="is_commend")
	private byte isCommend;

	@Column(name="is_del")
	private byte isDel;

	@Column(name="is_hot")
	private byte isHot;

	@Column(name="is_new")
	private byte isNew;

	@Column(name="is_show")
	private byte isShow;

	private String name;

	@Lob
	@Column(name="package_list")
	private String packageList;

	private String sizes;

	private float weight;

	public BbsProduct() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getBrandId() {
		return this.brandId;
	}

	public void setBrandId(BigInteger brandId) {
		this.brandId = brandId;
	}

	public String getColors() {
		return this.colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	public byte getIsCommend() {
		return this.isCommend;
	}

	public void setIsCommend(byte isCommend) {
		this.isCommend = isCommend;
	}

	public byte getIsDel() {
		return this.isDel;
	}

	public void setIsDel(byte isDel) {
		this.isDel = isDel;
	}

	public byte getIsHot() {
		return this.isHot;
	}

	public void setIsHot(byte isHot) {
		this.isHot = isHot;
	}

	public byte getIsNew() {
		return this.isNew;
	}

	public void setIsNew(byte isNew) {
		this.isNew = isNew;
	}

	public byte getIsShow() {
		return this.isShow;
	}

	public void setIsShow(byte isShow) {
		this.isShow = isShow;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPackageList() {
		return this.packageList;
	}

	public void setPackageList(String packageList) {
		this.packageList = packageList;
	}

	public String getSizes() {
		return this.sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}