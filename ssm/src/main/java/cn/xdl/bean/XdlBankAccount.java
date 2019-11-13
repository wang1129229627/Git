package cn.xdl.bean;

import java.io.Serializable;

public class XdlBankAccount implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String acc_no;
	private String acc_password;
	private double acc_money;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}
	public String getAcc_password() {
		return acc_password;
	}
	public void setAcc_password(String acc_password) {
		this.acc_password = acc_password;
	}
	public double getAcc_money() {
		return acc_money;
	}
	public void setAcc_money(double acc_money) {
		this.acc_money = acc_money;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "XdlBankAccount [id=" + id + ", acc_no=" + acc_no + ", acc_password=" + acc_password + ", acc_money="
				+ acc_money + "]";
	}
	public XdlBankAccount(int id, String acc_no, String acc_password, double acc_money) {
		super();
		this.id = id;
		this.acc_no = acc_no;
		this.acc_password = acc_password;
		this.acc_money = acc_money;
	}
	public XdlBankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public XdlBankAccount(String acc_no, String acc_password, double acc_money) {
		super();
		this.acc_no = acc_no;
		this.acc_password = acc_password;
		this.acc_money = acc_money;
	}
	
	
}
