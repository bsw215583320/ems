package com.lanbao.ems;


import com.lanbao.ems.common.jeasyopc.SynchReadGroupExample1;
import com.lanbao.ems.common.jeasyopc.TagBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("ems")
public class EMSController {
	public SynchReadGroupExample1 example;
	 @RequestMapping("hello")
	    public String hello() {
	        
	        return "hello";
	    }
	 @RequestMapping("index")
	    public String index() {
	        
	        return "index";
	    }
	 @RequestMapping("huanbao3d")
	 public String huanbao3d() {
	        return "huanbao3d";
	    }
	@RequestMapping("chejian3d")
	public String chejian3d() {
		return "chejian3d";
	}
	 @RequestMapping("chengpincangku")
	 public String chengpincangku() {
		return "chengpincangku";
	}
	 @RequestMapping("yuanliaocangku")
 	 public String yuanliaocangku() {
		return "yuanliaocangku";
	}
     @RequestMapping("content")
     public String content() {
        return "content";
    }
	 @ResponseBody
	 @RequestMapping("getData")
	 public  List<TagBean>  getData(Map<String,Object> map) throws InterruptedException{
		 if(null == example){
			 System.err.println(123);
			 example = new SynchReadGroupExample1();
			 example.setOpcName("KEPware.KEPServerEx.V4");
			 example.setIp("localhost");
			 example.setGroupName("Channel_2");
			 example.getList().add(new TagBean("Channel_2.Device_3.Tag_1",0D,"1"));
			 example.getList().add(new TagBean("Channel_2.Device_3.Tag_2",0D,"2"));
			 example.getList().add(new TagBean("Channel_2.Device_3.Tag_3",0D,"3"));
		 }
		 return example.run();
	 }
}
