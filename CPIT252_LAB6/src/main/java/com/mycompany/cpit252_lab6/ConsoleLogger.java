/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpit252_lab6;

/**
 *
 * @author yzeed
 */
public class ConsoleLogger extends BaseLogger {
	public ConsoleLogger() {
		label = "Console logger";
	}
 
	public String getLevel() {
		return "info";
	}
}