package ryu.park.shop.vo;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class CartVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4127532053115769310L;

	// 상품
	private GoodsVO goodsVO;
	 
	// 장바구니_시퀀스
	private Integer cartSeq;

	// 장바구니_상품_시퀀스
	@NotNull
	private Integer cartGoodsSeq;

	// 장바구니_유저_이메일
	private String cartUserEmail;

	// 장바구니_상품_갯수
	@NotNull
	@Range(min=0, max=9999)
	private Integer cartGoodsCnt;

	// 장바구니_생성일
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") 
	private Date cartCrtDate;

	public Integer getCartSeq() {
		return cartSeq;
	}
 
	public GoodsVO getGoodsVO() {
		return goodsVO;
	}

	public void setGoodsVO(GoodsVO goodsVO) {
		this.goodsVO = goodsVO;
	}
	
	public void setCartSeq(Integer cartSeq) {
		this.cartSeq = cartSeq;
	}

	public Integer getCartGoodsSeq() {
		return cartGoodsSeq;
	}

	public void setCartGoodsSeq(Integer cartGoodsSeq) {
		this.cartGoodsSeq = cartGoodsSeq;
	}

	public String getCartUserEmail() {
		return cartUserEmail;
	}

	public void setCartUserEmail(String cartUserEmail) {
		this.cartUserEmail = cartUserEmail;
	}

	public Integer getCartGoodsCnt() {
		return cartGoodsCnt;
	}

	public void setCartGoodsCnt(Integer cartGoodsCnt) {
		this.cartGoodsCnt = cartGoodsCnt;
	}

	public Date getCartCrtDate() {
		return cartCrtDate;
	}

	public void setCartCrtDate(Date cartCrtDate) {
		this.cartCrtDate = cartCrtDate;
	}

}
