package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;


/**
 * The persistent class for the bbs_sku database table.
 * 
 */
@Entity
@Table(name="bbs_sku")
@NamedQuery(name="BbsSku.findAll", query="SELECT b FROM BbsSku b")
public class BbsSku implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="color_id")
	private BigInteger colorId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="delive_fee")
	private float deliveFee;

	@Column(name="market_price")
	private float marketPrice;

	private float price;

	@Column(name="product_id")
	private BigInteger productId;

	private String size;

	private int stock;

	@Column(name="upper_limit")
	private int upperLimit;

	public BbsSku() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getColorId() {
		return this.colorId;
	}

	public void setColorId(BigInteger colorId) {
		this.colorId = colorId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public float getDeliveFee() {
		return this.deliveFee;
	}

	public void setDeliveFee(float deliveFee) {
		this.deliveFee = deliveFee;
	}

	public float getMarketPrice() {
		return this.marketPrice;
	}

	public void setMarketPrice(float marketPrice) {
		this.marketPrice = marketPrice;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public BigInteger getProductId() {
		return this.productId;
	}

	public void setProductId(BigInteger productId) {
		this.productId = productId;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getUpperLimit() {
		return this.upperLimit;
	}

	public void setUpperLimit(int upperLimit) {
		this.upperLimit = upperLimit;
	}

}