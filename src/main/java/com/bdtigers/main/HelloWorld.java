package com.bdtigers.main;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;
        private String phoneNo;
        private String emailId;
        private String address;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name+" phoneNo ="+phoneNo+" emailId ="+emailId+" address ="+address);
	}

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
        
}