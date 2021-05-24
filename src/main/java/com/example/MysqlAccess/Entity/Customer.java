package com.example.MysqlAccess.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="c_num" ,columnDefinition = "CHAR(4)")
	private String c_num;
	
	@Column(name="c_name" ,nullable = false ,columnDefinition = "CHAR(40)")
	private String c_name;
	
	@Column(name="address" ,columnDefinition = "CHAR(20)")
	private String address;

	@Column(name="office" ,columnDefinition = "CHAR(2)")
	private String office;

	public String getC_num() {
		return c_num;
	}
	public void setC_num(String c_num) {
		this.c_num = c_num;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.address = office;
	}	
	public void setAll(  String c_num
						,String c_name
						,String address
						) {
		this.c_num = c_num;
		this.c_name = c_name;
		this.address = address;
	}

}
