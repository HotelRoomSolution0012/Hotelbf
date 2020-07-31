package com.ischoolbar.programmer.entity;

import org.springframework.stereotype.Component;

@Component
public class RoomType {
	private Long id;//��������id
	private String name;//��������
	private String photo;//��������ͼƬ
	private Float price;//���ͼ۸�
	private Integer liveNum;//��ס����
	private Integer bedNum;//��λ��
	private Integer roomNum;//������
	private Integer avilableNum;//��ס���Ԥ��������
	private Integer bookNum;//Ԥ����
	private Integer livedNum;//�Ѿ���ס��
	private int status;//����״̬��0����������,1:��Ԥ������ס
	private String remark;//���ͱ�ע
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getLiveNum() {
		return liveNum;
	}
	public void setLiveNum(Integer liveNum) {
		this.liveNum = liveNum;
	}
	public Integer getBedNum() {
		return bedNum;
	}
	public void setBedNum(Integer bedNum) {
		this.bedNum = bedNum;
	}
	public Integer getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(Integer roomNum) {
		this.roomNum = roomNum;
	}
	public Integer getAvilableNum() {
		return avilableNum;
	}
	public void setAvilableNum(Integer avilableNum) {
		this.avilableNum = avilableNum;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getBookNum() {
		return bookNum;
	}
	public void setBookNum(Integer bookNum) {
		this.bookNum = bookNum;
	}
	public Integer getLivedNum() {
		return livedNum;
	}
	public void setLivedNum(Integer livedNum) {
		this.livedNum = livedNum;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
