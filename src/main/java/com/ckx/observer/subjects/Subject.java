package com.ckx.observer.subjects;

import com.ckx.observer.observers.Observer;

/**
 * �۲��߽ӿ�
 * @author DELL
 *
 */
public interface Subject {
	/*
	 * ���۲�����Ϊ������ע�����ɾ���۲��� 
	 */
	public void registerObserve(Observer o);
	public void removeObserve(Observer o);
	//֪ͨ�۲��߷���
	public void notifyObserve();
}
