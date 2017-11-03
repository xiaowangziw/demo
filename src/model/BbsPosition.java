package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the bbs_position database table.
 * 
 */
@Entity
@Table(name="bbs_position")
@NamedQuery(name="BbsPosition.findAll", query="SELECT b FROM BbsPosition b")
public class BbsPosition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="is_enable")
	private byte isEnable;

	@Column(name="is_parent")
	private byte isParent;

	private String name;

	@Column(name="parent_id")
	private BigInteger parentId;

	private int sort;

	public BbsPosition() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(byte isEnable) {
		this.isEnable = isEnable;
	}

	public byte getIsParent() {
		return this.isParent;
	}

	public void setIsParent(byte isParent) {
		this.isParent = isParent;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getParentId() {
		return this.parentId;
	}

	public void setParentId(BigInteger parentId) {
		this.parentId = parentId;
	}

	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

}