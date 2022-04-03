/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cpit252_lab6;

/**
 *
 * @author yzeed
 */
public class HTMLFormatter extends FormatDecorator {
	public HTMLFormatter(BaseLogger logger) {
		this.logger = logger;
	}

	public String getLabel() {
		return logger.getLabel() + ", HTMLFormatter";
	}

	public String getLevel() {
		return "Info " + logger.getLevel();
	}
}