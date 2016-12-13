package com.cri.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cri.beans.PayingGuest1;

public class CRITest {
	public static void main(String[] args) {
		BeanFactory beanfactory = new XmlBeanFactory( new ClassPathResource("com//cri//common//application-context.xml"));
		 PayingGuest1 payingguest =(PayingGuest1)beanfactory.getBean("payingguest1");
		 System.out.println(payingguest);
	}
}
