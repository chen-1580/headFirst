package com.ckx.observer.subjects;

import com.ckx.observer.observers.Observer;

/**
 * 观察者接口
 * @author DELL
 *
 */
public interface Subject {
	/*
	 * 将观察者作为变量，注册或者删除观察者 
	 */
	public void registerObserve(Observer o);
	public void removeObserve(Observer o);
	//通知观察者方法
	public void notifyObserve();
}
