package manager;

public class Manager {
	private int ManagerId;
	private String ManagerName;
	private String Branch;
	public Manager(int managerId, String managerName, String branch) {
		super();
		ManagerId = managerId;
		ManagerName = managerName;
		Branch = branch;
	}
	public int getManagerId() {
		return ManagerId;
	}
	public void setManagerId(int managerId) {
		ManagerId = managerId;
	}
	public String getManagerName() {
		return ManagerName;
	}
	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	
	

}
