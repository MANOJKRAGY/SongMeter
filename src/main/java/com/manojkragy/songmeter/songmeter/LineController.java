package com.manojkragy.songmeter.songmeter;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LineController {
	
	@GetMapping("/lines")
	public List<Line> getAllLines(){
		return Arrays.asList(new Line(1,"aa","manoj",10));
	}

}
