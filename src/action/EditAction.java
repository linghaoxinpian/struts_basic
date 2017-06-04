package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.Person;
import model.State;

public class EditAction extends ActionSupport {

	private Person personBean;
	public String execute(){
	//	personBean=new Person();	不必要的代码
		return SUCCESS;
	}
	//----------getter-setter start------------
	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}
	//----------getter-setter end------------
	
	//获取 "运动列表"
	public List<String> getSports(){
		List<String> list=new ArrayList<String>();
		list.add("basketball");
		list.add("baseball");
		list.add("football");
		return list;
	}
	
	//获取 "性别类表"
	public String[] getGenders(){
		return new String[]{"男","女","保密"};
	}
	
	//获取 "居住地列表"
	public List<State> getStates(){
		List<State> list=new ArrayList<State>();		
			list.add(new State("zh","中国"));
			list.add(new State("en", "English"));
			
			return list;
	}
	
	//是否检查 "满21岁"
	public boolean getOver21(){
		return true;
	}
	
	//获取"汽车模型列表"
	public List<String> getCarModelAvailable(){
		List<String> list=new ArrayList<String>();
		list.add("Ford");
		list.add("Chrysler");
		return list;
	}
}
