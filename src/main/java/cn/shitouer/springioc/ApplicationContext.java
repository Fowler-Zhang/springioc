package cn.shitouer.springioc;

public interface ApplicationContext {
	/**
	 * 根据Bean Id 生成 Bean
	 * 
	 * @param beanId
	 * @return
	 */
	public Object getBean(String beanId);
}
