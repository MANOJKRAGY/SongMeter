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
		//this is small change
        //new change by manoj 
		//first change in aayush branch
		//new change for the aaayush branch

		/*a - 2
		i - 1
		ee - 2
		u - 1
		oo - 2
		e - 2
		ai - 2
		o - 2
		au - 2
		an - 1
		ah - 1*/

	}
	//adding the list of consonant
	/*
	k
	kh
	g
	gh
	ng
    ch
	chh
	j
	jh
	yn
	t
	th
	d
	dh
	n
	t
	th
	d
	dh
	n
	p
	ph
	b
	bh
	m
	y
	r
	l
	w/v
	sh
	sh
	s
	h
	ksh
	tr
	gy
	shr
	ri
	*/
	

}
