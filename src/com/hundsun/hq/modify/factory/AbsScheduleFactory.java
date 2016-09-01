package com.hundsun.hq.modify.factory;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

public abstract class AbsScheduleFactory extends StdSchedulerFactory{

	public static Scheduler hqScheduler ;
	
	protected abstract void loadJobClass() ;
	
	public void start(){
		loadJobClass();
		try {
			if(hqScheduler!=null){
				hqScheduler.start();
			}else{
				System.out.println("��û�г�ʼ��job�ƻ�");
			}
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	};
}
