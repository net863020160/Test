package test.java.cn.springframework.test.bean;

public class UserService {
	 private String name;
	 
	 public UserService(String name){
		 this.name = name;
	 }
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void queryUserInfo(){
		System.out.println("��ѯ�û���Ϣ");
	}
}
