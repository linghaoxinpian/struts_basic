package model;

public class State {
	private String stateAbbr;	//实际值
	private String stateName;	//显示值
	
	public State(String stateAbbr,String stateName){
		this.stateAbbr=stateAbbr;
		this.stateName=stateName;
	}
	
	public String getStateAbbr() {
		return stateAbbr;
	}
	public void setStateAbbr(String stateAbbr) {
		this.stateAbbr = stateAbbr;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
}
