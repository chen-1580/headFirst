package com.ckx.observer.observers;

/**
 * 所有观察者都必须实现update()方法，以实现观察者接口
 * @author DELL
 *
 */
public interface Observer {
	
	public void update(float temperature, float humidity, float pressure);

}
