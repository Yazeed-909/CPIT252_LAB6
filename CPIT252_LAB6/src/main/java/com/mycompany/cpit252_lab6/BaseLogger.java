/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpit252_lab6;

/**
 *
 * @author yzeed
 */
public abstract class BaseLogger {
	String label = "Unknown label";
  
	public String getLabel() {
		return label;
	}
 
	public abstract String getLevel();
}