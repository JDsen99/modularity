package com.ss.dao;

import com.ss.main.Lifecycle;

/**
 * @author Jangsm
 */
public abstract class AbstractDaoProcessor<T> implements Lifecycle {

    /**
     * 插入 记录 无事务
     * @param t 泛型
     * @return success
     */
    public boolean insert(T t){
        return insert(t,false);
    }

    /**
     * 插入 记录
     * @param t 泛型 实体对象
     * @param isTransaction 是否开启事务
     * @return 成功 返回 true,失败返回 false
     */
    protected abstract boolean insert(T t, boolean isTransaction);

    /**
     * 批量删除 默认开启事务
     * @param ts T[]
     * @return 成功 返回 true,失败返回 false
     */
    protected boolean batchInsert(T[] ts) {
        for (T t : ts) {
            insert(t,true);
        }
        return true;
    }


    /**
     *  更新数据表
     * @param t 泛型 实体对象
     * @return 成功 返回 true,失败返回 false
     */
    public boolean update(T t) {
        return update(t, false);
    }

    protected abstract boolean update(T t, boolean isTransaction);

    /**
     * 批量更新 默认开启事务
     * @param ts T[]
     * @return 成功 返回 true,失败返回 false
     */
    protected boolean batchUpdate(T[] ts) {
        for (T t : ts) {
            update(t,true);
        }
        return true;
    }

    /**
     * 删除记录
     * @param t 泛型 实体对象
     * @return 成功 返回 true,失败返回 false
     */
    public boolean delete(T t) {
        return delete(t, false);
    }

    /**
     *  删除记录 使用事务
     * @param t  泛型 实体对象
     * @param isTransaction 是否开启事务
     * @return 成功 返回 true,失败返回 false
     */
    protected abstract boolean delete(T t, boolean isTransaction);

    /**
     * 批量删除 默认开启事务
     * @param ts T[]
     * @return 成功 返回 true,失败返回 false
     */
    protected boolean batchDelete(T[] ts) {
        for (T t : ts) {
            delete(t,true);
        }
        return true;
    }
}
