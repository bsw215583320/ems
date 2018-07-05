package com.lanbao.ems.common.jeasyopc;

import javafish.clients.opc.JOpc;
import javafish.clients.opc.component.OpcGroup;
import javafish.clients.opc.component.OpcItem;
import javafish.clients.opc.exception.*;

import java.util.ArrayList;
import java.util.List;

public class SynchReadGroupExample1 {
 /* public static void main(String[] args) throws InterruptedException {
   List<TagBean> list =  run();
   for (TagBean tagBean : list) {
	System.out.println(tagBean.getName()+"value:"+tagBean.getValue());
}
  }*/
	  private JOpc jopc = null;
	  private OpcGroup group = null;
	  private SynchReadGroupExample1 test = null;
	  private String ip = null;
	  private String opcName = null;
	  private String groupName = null;
	  private List<TagBean> list = new ArrayList<>();
	  
	  
	  public void conn(){
		  test = new SynchReadGroupExample1();

		  try {
			  JOpc.coInitialize();
		  }
		  catch (CoInitializeException e1) {
			  e1.printStackTrace();
		  }

		  jopc = new JOpc(ip, opcName, "JOPC1");
		  OpcItem item = null;
		  group = new OpcGroup(groupName, true, 2000, 0.0f);
		  for (TagBean tagBean : list) {
			  item = new OpcItem(tagBean.getName(), true, "");
			  group.addItem(item);
		  }
		  jopc.addGroup(group);
		  try {
			  jopc.connect();
			  System.out.println("JOPC client is connected...");
		  }
		  catch (ConnectivityException e2) {
			  e2.printStackTrace();
		  }

		  try {
			  jopc.registerGroups();
			  System.out.println("OPCGroup are registered...");
		  }
		  catch (UnableAddGroupException e2) {
			  e2.printStackTrace();
		  }
		  catch (UnableAddItemException e2) {
			  e2.printStackTrace();
		  }
	  }


  public List<TagBean> run()throws InterruptedException {
	  TagBean bean = null;
	  if(jopc==null){
		  conn();
	  }
	      try {
	    	  synchronized(test) {
		  	        test.wait(2000);
		  	      }
	        OpcGroup responseGroup = jopc.synchReadGroup(group);
	        if(responseGroup!=null){
	        	ArrayList<OpcItem> responseItems = responseGroup.getItems();
				if (responseGroup.isActive()) {
					int nPos = 0;
					for (OpcItem responseItem : responseItems) {
						if (responseItem.isQuality()) {
							for (TagBean tBean : list) {
								if (tBean.getName().equals(responseItem.getItemName())) {
									tBean.setValue(Double.parseDouble(responseItem.getValue().toString()));
								}
							}
						}
					}
				}
	        }
	      }
	      catch (ComponentNotFoundException e1) {
	        e1.printStackTrace();
	      }
	      catch (SynchReadException e1) {
			  try {
				  JOpc.coUninitialize();
			  }
			  catch (CoUninitializeException e) {
				  e.printStackTrace();
			  }
			  System.out.println("正在尝试重新连接。。。。。。");
			  conn();
	      }
	    
	 
		return list;
  }



public JOpc getJopc() {
	return jopc;
}



public void setJopc(JOpc jopc) {
	this.jopc = jopc;
}



public OpcGroup getGroup() {
	return group;
}



public void setGroup(OpcGroup group) {
	this.group = group;
}



public SynchReadGroupExample1 getTest() {
	return test;
}



public void setTest(SynchReadGroupExample1 test) {
	this.test = test;
}



public String getIp() {
	return ip;
}



public void setIp(String ip) {
	this.ip = ip;
}



public String getOpcName() {
	return opcName;
}



public void setOpcName(String opcName) {
	this.opcName = opcName;
}



public String getGroupName() {
	return groupName;
}



public void setGroupName(String groupName) {
	this.groupName = groupName;
}



public List<TagBean> getList() {
	return list;
}



public void setList(List<TagBean> list) {
	this.list = list;
}
 
}
