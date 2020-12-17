package com.cartripanalytics.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cartripanalytics.service.TripAnalyticsService;



@RestController
public class AnalyticsController {
	
	@Autowired
	private TripAnalyticsService tripservice;
	
	
	
	
	@RequestMapping(path="/analyze/{simid}",method=RequestMethod.GET)
	public boolean startAnalytics(@PathVariable("simid")String SimulationId)
	{
		return tripservice.analyzedata(SimulationId);	
	}

}
