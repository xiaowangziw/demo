package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;


/**
 * The persistent class for the bbs_order database table.
 * 
 */
@Entity
@Table(name="bbs_order")
@NamedQuery(name="BbsOrder.findAll", query="SELECT b FROM BbsOrder b")
public class BbsOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="buyer_id")
	private BigInteger buyerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="deliver_fee")
	private float deliverFee;

	private byte delivery;

	@Column(name="is_confirm")
	private byte isConfirm;

	@Column(name="is_paiy")
	private byte isPaiy;

	private String note;

	@Column(name="order_price")
	private float orderPrice;

	@Column(name="order_state")
	private byte orderState;

	@Column(name="payment_cash")
	private byte paymentCash;

	@Column(name="payment_way")
	private byte paymentWay;

	@Column(name="total_price")
	private float totalPrice;

	public BbsOrder() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getBuyerId() {
		return this.buyerId;
	}

	public void setBuyerId(BigInteger buyerId) {
		this.buyerId = buyerId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public float getDeliverFee() {
		return this.deliverFee;
	}

	public void setDeliverFee(float deliverFee) {
		this.deliverFee = deliverFee;
	}

	public byte getDelivery() {
		return this.delivery;
	}

	public void setDelivery(byte delivery) {
		this.delivery = delivery;
	}

	public byte getIsConfirm() {
		return this.isConfirm;
	}

	public void setIsConfirm(byte isConfirm) {
		this.isConfirm = isConfirm;
	}

	public byte getIsPaiy() {
		return this.isPaiy;
	}

	public void setIsPaiy(byte isPaiy) {
		this.isPaiy = isPaiy;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public float getOrderPrice() {
		return this.orderPrice;
	}

	public void setOrderPrice(float orderPrice) {
		this.orderPrice = orderPrice;
	}

	public byte getOrderState() {
		return this.orderState;
	}

	public void setOrderState(byte orderState) {
		this.orderState = orderState;
	}

	public byte getPaymentCash() {
		return this.paymentCash;
	}

	public void setPaymentCash(byte paymentCash) {
		this.paymentCash = paymentCash;
	}

	public byte getPaymentWay() {
		return this.paymentWay;
	}

	public void setPaymentWay(byte paymentWay) {
		this.paymentWay = paymentWay;
	}

	public float getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

}