package com.gmail.dailyefforts.ds;

public interface IPQ<E> {
	/**
	 * 把<code>item<code>加入到队列中
	 * 
	 * @param item
	 *            要添加的元素
	 */
	public void add(E item);

	/**
	 * 移除最值
	 * 
	 * @return
	 */
	public E remove();

	/**
	 * 查询最值
	 * 
	 * @return 最值
	 */
	public E peek();

	/**
	 * 返回队列中元素的个数
	 * 
	 * @return 队列大小
	 */
	public int size();

	/**
	 * 查询队列是否为空
	 * 
	 * @return <code>true</code> 如果队列中元素个数为0；否则，返回<code>false</code>。
	 */
	public boolean isEmpty();
}
