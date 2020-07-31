/*package com.ischoolbar.programmer.controller.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ischoolbar.programmer.service.admin.CheckinService;


/*@RequestMapping("/admin/stats")
@Controller
public class StatsController {
	
	@Autowired
	private CheckinService checkinService;
	
	/*@RequestMapping(value="/stats",method=RequestMethod.GET)
	public ModelAndView stats(ModelAndView model){
		model.setViewName("stats/stats");
		return model;
	}
	
	/*@RequestMapping(value="/get_stats",method=RequestMethod.POST)
	@ResponseBody*/
	/*public Map<String, Object> getStats(String type){
		Map<String, Object> ret = new HashMap<String, Object>();
		if(StringUtils.isEmpty(type)){
			ret.put("type", "error");
			ret.put("msg", "��ѡ��ͳ������!");
			return ret;
		}
		switch (type) {
			case "month":{
				ret.put("type", "success");
				ret.put("content", getStatsValue(checkinService.getStatsByMonth()));
				return ret;
			}
			case "day":{
				ret.put("type", "success");
				ret.put("content", getStatsValue(checkinService.getStatsByDay()));
				return ret;
			}
			default:{
				ret.put("type", "error");
				ret.put("msg", "��ѡ����ȷ��ͳ������!");
				return ret;
			}
		}
	}
	
	/*private Map<String, Object> getStatsValue(List<Map> statsValue){
		Map<String, Object> ret = new HashMap<String, Object>();
		List<String> keyList = new ArrayList<String>();
		List<Float> valueList = new ArrayList<Float>();
		for(Map m:statsValue){
			keyList.add(m.get("stats_date").toString());
			valueList.add(Float.valueOf(m.get("money").toString()));
		}
		ret.put("keyList", keyList);
		ret.put("valueList", valueList);
		return ret;
	}
}
*/