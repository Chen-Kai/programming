package com.gmail.dailyefforts.ds;

public interface IPQ<E> {
	/**
	 * ��<code>item<code>���뵽������
	 * 
	 * @param item
	 *            Ҫ��ӵ�Ԫ��
	 */
	public void add(E item);

	/**
	 * �Ƴ���ֵ
	 * 
	 * @return
	 */
	public E remove();

	/**
	 * ��ѯ��ֵ
	 * 
	 * @return ��ֵ
	 */
	public E peek();

	/**
	 * ���ض�����Ԫ�صĸ���
	 * 
	 * @return ���д�С
	 */
	public int size();

	/**
	 * ��ѯ�����Ƿ�Ϊ��
	 * 
	 * @return <code>true</code> ���������Ԫ�ظ���Ϊ0�����򣬷���<code>false</code>��
	 */
	public boolean isEmpty();
}
