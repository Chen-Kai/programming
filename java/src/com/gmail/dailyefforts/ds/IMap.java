package com.gmail.dailyefforts.ds;

public interface IMap<Key, Value> {
    /**
     * �����ֵ��
     * 
     * @param key
     *            ��
     * @param value
     *            ֵ
     */
    public void put(Key key, Value value);

    /**
     * ���I��ֵ
     * 
     * @param key
     *            �I
     * @return ֵ
     */
    public Value get(Key key);

    /**
     * �ж��Ƿ����ĳ��
     * 
     * @param key
     *            ��
     * @return <code>true</code> ������������<code>false</code>
     */
    public boolean contains(Key key);

    /**
     * ɾ����Ϊkey�ļ�ֵ��
     * 
     * @param key
     *            ��
     */
    public Value remove(Key key);

    /**
     * ���ؼ�ֵ�Ը���
     * 
     * @return ��ֵ�Ը���
     */
    public int size();

    /**
     * �жϼ�ֵ���Ƿ�Ϊ��
     * 
     * @return <code>true</code> �����ֵ��Ϊ�գ�����<code>false</code>��
     */
    public boolean isEmpty();
}