//自定义异常 继承了运行时异常，具体操作让父类实现
package com.hjh.Dao;

/**
 * 自定义异常
 * @author Administrator
 *
 */
public class DaoException extends RuntimeException {


    public DaoException() {
        super();
    }

    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public DaoException(String messege) {
        super(messege);
    }

    public DaoException(Throwable cause) {
        super(cause);

    }
}
