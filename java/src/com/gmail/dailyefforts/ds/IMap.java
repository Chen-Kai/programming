package com.gmail.dailyefforts.ds;

public interface IMap<Key, Value> {
    /**
     * 存入键值对
     * 
     * @param key
     *            键
     * @param value
     *            值
     */
    public void put(Key key, Value value);

    /**
     * 按鍵查值
     * 
     * @param key
     *            鍵
     * @return 值
     */
    public Value get(Key key);

    /**
     * 判断是否包含某键
     * 
     * @param key
     *            键
     * @return <code>true</code> 若包含；否则，<code>false</code>
     */
    public boolean contains(Key key);

    /**
     * 删除键为key的键值对
     * 
     * @param key
     *            键
     */
    public Value remove(Key key);

    /**
     * 返回键值对个数
     * 
     * @return 键值对个数
     */
    public int size();

    /**
     * 判断键值表是否为空
     * 
     * @return <code>true</code> 如果键值表为空；否则，<code>false</code>。
     */
    public boolean isEmpty();
}