package action;

import com.opensymphony.xwork2.ActionSupport;

import model.MessageStore;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;

    public String execute() {
    	//每次调用helloCount++
    	helloCount++;
        messageStore = new MessageStore() ;

        if (userName != null) {
            messageStore.setMessage( messageStore.getMessage() + " " + userName);
        }
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
    //添加一个static int变量
    private static int helloCount = 0;
	
    public int getHelloCount() {
        return helloCount;
    }
    
    //自动填充
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}