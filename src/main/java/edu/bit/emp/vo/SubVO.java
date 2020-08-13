package edu.bit.emp.vo;

import java.sql.Timestamp;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class SubVO {
	private double kor; 
	private double eng;
	private double math;
	
	
	public double getSum() {
		return kor+eng+math;
	}
	
	
}
